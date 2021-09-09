<?php

define("TIMEOUT", 30000);		// in milliseconds
define("DELAY", 1000);

// not executed as included file
if ($_SERVER["PHP_SELF"] === "/vs.php") {
	include "wp-load.php";	// required for DB constants
		
	// establish connection to db
	$db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)
			or die("Could not connect to the database");
	
	// long polling
	if (isset($_GET["poll"])) {
		switch ($_GET["poll"]) {
			
		// update group list
		case "groups":
			// escape inputs
			$groups = $_GET["groups"] ? $_GET["groups"] : array();
			sort($groups);
			
			// prepare query of groups
			$query = $db->prepare("SELECT id, name, problem, size "
					."FROM vs_groups WHERE starttime IS NOT NULL");
			$query->bind_result($id, $name, $problem, $size);
			
			// poll db
			$i = 0;
			do {
				// query db for groups
				$query->execute();
				$rows = array();
				$ids = array();
				while ($query->fetch()) {
					$rows[] = array("id" => $id,
									"name" => $name,
									"problem" => $problem,
									"size" => $size);
					$ids[] = $id;
				}
				
				// check if updated
				sort($ids);
				$changed = ($groups != $ids);
			} while (!$changed
					&& ($i++ < TIMEOUT / DELAY)	// check for timeout
					&& !usleep(DELAY * 1000));	// sleep before repeating
			
			// return updated list as json
			header("Content-type: application/json");
			exit(json_encode(array("status" => "success",
									"groups" => $rows)));
			break;
			
		// update player list and check for challenge start
		case "start":
			// escape inputs
			$id = intval($_GET["id"]);
			$players = $_GET["players"] ? $_GET["players"] : array();
			sort($players);
			
			// prepare query to check for accept
			$query = $db->prepare("SELECT p1.display_name, "
						."p2.display_name, p3.display_name, "
						."p4.display_name, p5.display_name, "
						."p6.display_name, p7.display_name, "
						."p8.display_name, starttime FROM vs_challenges "
						
						."JOIN wp_users AS p1 ON p1.id=uid1 "
						."JOIN wp_users AS p2 ON p2.id=uid2 "
						."JOIN wp_users AS p3 ON p3.id=uid3 "
						."JOIN wp_users AS p4 ON p4.id=uid4 "
						."JOIN wp_users AS p5 ON p5.id=uid5 "
						."JOIN wp_users AS p6 ON p6.id=uid6 "
						."JOIN wp_users AS p7 ON p7.id=uid7 "
						."JOIN wp_users AS p8 ON p8.id=uid8 "
						
						."WHERE id=$id");
				$query->bind_result($p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8, $start);
					
			
			// poll db
			$i = 0;
			do {
				// check if new players or challenge start
				$query->execute();
				$row = array();
				if ($query->fetch()) {
					$row = array_filter(array($p1, $p2, $p3, $p4, $p5, $p6, $p7, $p8));
				}
				
				// check if updated
				sort($row);
				$changed = ($players != $row);
			} while (!$start && !$changed
					&& ($i++ < TIMEOUT / DELAY)	// check for timeout
					&& !usleep(DELAY * 1000));	// sleep before repeating
			
			// return updated list as json
			header("Content-type: application/json");
			exit(json_encode(array("status" => "success",
									"players" => $row,
									"start" => $start)));
			break;
		}
		
	// open a group
	} elseif (isset($_POST["name"] && isset($_POST["problem_id"])
			&& isset($_POST["uid"])) {
		$name = $db->real_escape_string($_POST["name"]);
		$uid = intval($_POST["uid"]);
		$pid = intval($_POST["problem_id"]);
		
		$db->query("INSERT INTO vs_challenges (name, problem_id, size, uid1) "
				."VALUES($name, $pid, 1, $uid1)");
		
		// get challenge id
		$result = $db->query("SELECT LAST_INSERT_ID()");
		$row = $result->fetch_row();
		
		header("Content-type: application/json");
		exit(json_encode(array("status" => "success", "id" => $row[0])));
		
	// join group
	} elseif (isset($_POST["id"]) && isset($_POST["uid"])) {
		$id = intval($_POST["id"]);
		$uid = intval($_POST["uid"]);
		
		$result = $db->query("SELECT size FROM vs_challenges WHERW id=$id");
		$row = $result->fetch_assoc();
		if ($row[0] < 8) {
			$n = $row[0] + 1;
			$db->query("UPDATE vs_challenges "
					."SET size=$n, uid$n=$uid WHERE id=$id");
			
			header("Content-type: application/json");
			exit(json_encode(array("status" => "success")));
		} else {
			header("Content-type: application/json");
			exit(json_encode(array("status" => "full",
					"message" => "Group is full")));
		}
		
	// start/cancel challenge
	} elseif (isset($_POST["start"]) && isset($_POST["id"])) {
		$id = intval($_POST["id"]);
		
		if ($_POST["start"]) {
			$db->query("UPDATE vs_challenges SET starttime="
					."ADDTIME(NOW(), '00:00:10') WHERE id=$id");
		} else {
			$db->query("DELETE FROM vs_challenges WHERE id=$id");
		}
		
		header("Content-type: application/json");
		exit(json_encode(array("status" => "success")));
		
	// load challenge
	} elseif (isset($_GET["uid"]) && isset($_GET["problem_id"])) {
		$current_user = intval($_POST["uid"]);
		$pid = intval($_POST["problem_id"]);
		$prob = "test";		// TODO probname from post
		
		// TODO load problems
		include 'problem-form.php';
		exit();
	}
	
// show interface for logged in users
} elseif (is_user_logged_in()) {
	$user = wp_get_current_user();
	
?>
<style>
.hidden {
	display: none;
}

#vs-groups a {
	cursor: pointer;
}
</style>
<script>
jQuery(function ($) {
	var vs;
	var xhr;
	
	// show div by id
	var show = function (divId) {
		$("#vs > div").each(function () {
			if (this.id === divId) {
				$(this).removeClass("hidden");
			} else {
				$(this).addClass("hidden");
			}
		})
	};
	
	// get error message from ajax data
	var errorMessage = function (data) {
		return data.message || data || "Invalid data recieved";
	};
	
	vs = $("#vs")
			.data("uid", <?php echo $user->ID; ?>)
			.data("name", "<?php echo $user->display_name; ?>");
	
	// update groups list
	var listUpdate = function (data) {
		// clear current list
		var groups = $("#vs-groups ul").html("");
		
		// parse and bind data to new list
		for (var i = 0; i < data.groups.length; i++) {
			$("<a>")
				.text(data.groups[i].name
						+ " (" + data.groups[i].size + "/8)")
				.data("id", data.groups[i].id)
				.data("user", data.groups[i].user)
				.click(function () {
					join($(this).data("id"), $(this).data("user"));
				})
				.appendTo($("<li>").appendTo(groups));
		}
	};
	
	// open new group
	var open = function (problemId) {
		$.post("/vs.php", {uid: vs.data("uid"), problem_id: problemId},
			function (data) {
				switch (data.status) {
					case "success":
						vs.data("id", data.id);
						pollType = "wait";
						xhr.abort();
						show("waiting-room");
					default:
						alert(errorMessage(data);
				}
			});
	};
	
	// accept/refuse challenge
	var accept = {
		if (confirm(data.challenger + " challenges you "
		+ "on problem " + data.problem
		+ " Accept?")) {
			show("vs-load");
			pollType = "none";
			xhr.abort();
			

			vs.data("id", data.id);
			vs.data("challenger", data.challenger);
			vs.data("problem", data.problem);
		} else {
			
		}
	};
	
	// initiate challenge
	var challenge = function (uid, problemId) {
		$.post("vs.php",
		{uid1: vs.data("uid"), uid2: uid, problem_id: problemId},
		function (data) {
			show("waiting-room");
			vs.data("id", data.id);
			
			pollType = "accept";
			xhr.abort();
		});
	}
	
	//
	// OLD FUNCTIONS
	//
	
	var join = function (id, opponent) {
		$.post("/vs.php",
		{id: id, uid: vs.data("uid")},
		function (data) {
			switch (data.status) {
				case "success":
				$("#player1").text(opponent);
				$("#player2").text(vs.data(uid));
				show("challenge");
				alert("You lose");
				break;
				default:
				alert(errorMessage(data));
			}
		});
	};
	
	$("#new-button").click(function () {
		open($("#problem").val());
	});
	
	var pollType = "groups";
	var abort = false;
	(function poll () {
		if (abort) { return; }
		
		var data;
		switch (pollType) {
			case "online":
			data = {poll: pollType, online: []};
			
			$("#vs-groups a").each(function (index, element) {
				data.list[index] = $(element).data("id");
			});
			break;
			case "accept":
			data = {id: data.id}
			break;
			
			//
			// OLD POLL CASES
			//
			
			case "list":
			data = {poll: pollType, list: []};
			
			$("#vs-groups a").each(function (index, element) {
				data.list[index] = $(element).data("id");
			});
			break;
			case "wait":
			data = {poll: pollType, id: vs.data("id")};
			break;
		}
		
		xhr = $.ajax({
			url: "/vs.php",
			type: "get",
			data: data,
			success: function (data) {
				switch (data.status) {
				case "success":
					switch (pollType) {
					case "groups":
						if (data.groups) {
							listUpdate(data);
						} else {
							accept();
						}
						break;
					case "accept":
						
						break;
					
					//
					// OLD POLL SUCCESS CASES
					//
					
					case "list":
						// clear current list
						var list = $("#vs-groups ul").html("");
						
						// parse and bind data to new list
						for (var i = 0; i < data.list.length; i++) {
							$("<a>")
								.text("vs " + data.list[i].user
										+ " (" + data.list[i].problem + ")")
								.data("id", data.list[i].id)
								.data("user", data.list[i].user)
								.click(function () {
									join($(this).data("id"), $(this).data("user"));
								})
								.appendTo($("<li>").appendTo(list));
						}
						break;
					case "wait":
						vs.data("challenger", data.challenger);
						alert("You beat " + data.challenger + "!");
						vs.removeData("id problem");
						pollType = "list";
						xhr.abort();
						show("join-challenge");
						break;
					}
					break;
				default:
					alert(errorMessage(data));
					abort = true;
					break;
				}
			},
			timeout: <?php echo TIMEOUT; ?>,
			complete: poll
		});
	})();
})
</script>

<div id="vs">
	<div id="join-challenge">
		<h3>Join a group</h3>
		<div id="vs-groups">
			<ul>
			</ul>
		</div>
		<br />
		<h3>Open a new group</h3>
		<h4>Group name: <input type="text" id="group-name" /></h4>
		<h4>Problem: <select id="problem" style="width: 100px;">
<?php

$db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)
		or die("Could not connect to the database");
$result = $db->query("SELECT * FROM vs_problems");

while ($row = $result->fetch_assoc()) {
	echo "\t\t<option value=\"{$row["id"]}\">{$row["name"]}</option>";
}

$result->free();
$db->close();

?>
		</select></h4>
		<input type="button" id="new-button" value="Open new group" />
	</div>
	<div id="waiting-room" class="hidden">
		<h3>Waiting for a more participants...
		(<span id="vs-num-players"></span>/8)</h3>
		
		<span id="vs-start"></span>
	</div>
	<div id="challenge" class="hidden">
		<h3><span id="player1"></span><span id="player2"></span></h3>
	</div>
</div>

<?php

// shown for non-logged-in users
} else {
	
?>
Sorry, this feature is only available for registered members.
Register <a href="/register/">here</a>!
<?php } ?>