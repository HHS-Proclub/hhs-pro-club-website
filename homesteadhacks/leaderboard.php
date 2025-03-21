<?php

define(UPDATE_DELAY_MS, 2000);

// output leaderboard data as JSON
if (isset($_GET["data"])) {
	header("Content-type: application/json");

	$problems = json_decode(file_get_contents("./hackathonContent/problems.json"), true);
  $ctfproblems = json_decode(file_get_contents("./hackathonContent/ctfproblems.json"), true);
	$results = json_decode(file_get_contents("./hackathonContent/problem-results.json"), true);
	$users = json_decode(file_get_contents("./hackathonContent/users.json"), true);
	$useroffsets = json_decode(file_get_contents("./hackathonContent/useroffsets.json"), true);
	
	$leaderboard = [];
	$json = [];

	// tally up points
	foreach ($problems as $id => $problem) {
		if ($problem["state"] === ($_GET["state"] ?: "up") && $results[$id]) {
			$points = 1;
			if ($problem["type"] === "Advanced") $points = 3;
            if ($problem["type"] === "Intermediate") $points = 2;
			
			foreach ($results[$id] as $email => $result) if ($result["correct"]) {
				if (!array_key_exists($email, $leaderboard)) {
					$leaderboard[$email] = array("points" => 0, "timestamp" => 0);
				}
				$leaderboard[$email]["points"] += $points;
				$leaderboard[$email]["timestamp"] = max(strtotime($result["timestamp"]),
						$leaderboard[$email]["timestamp"]);
			}
		}
	}
    
    foreach ($ctfproblems as $id => $problem) {
        if ($problem["state"] === ($_GET["state"] ?: "up") && $results[$id]) {
            $points = $problem["point_value"];
            
            foreach ($results[$id] as $email => $result) if ($result["correct"]) {
                if (!array_key_exists($email, $leaderboard)) {
                    $leaderboard[$email] = array("points" => 0, "timestamp" => 0);
                }
                $leaderboard[$email]["points"] += $points;
                $leaderboard[$email]["timestamp"] = max(strtotime($result["timestamp"]),
                                                        $leaderboard[$email]["timestamp"]);
            }
        }
    }

	foreach ($useroffsets as $member => $offset){
		if (!array_key_exists($member, $leaderboard)) {
			$leaderboard[$member] = array("points" => 0, "timestamp" => 0);
		}
		$leaderboard[$member]["points"] += $offset["points"];
	}

	// sort by points first, then timestamp
	uasort($leaderboard, function ($a, $b) {
		$result = $b["points"] - $a["points"];
		if (!$result) $result = $a["timestamp"] - $b["timestamp"];
		return $result;
	});

	// construct array of name => point mappings
	// TODO: can we directly rename keys?
	
	foreach ($leaderboard as $email => $stats) {
		// TODO: how to array_walk()?
		if (isset($competition)) {
			$name = $email;
		} else {

			foreach ($users as $user) if (strcmp($user["email"], $email) === 0){
				break;
			} 

			// skip officers
			// TODO: how to unset shit
			// if (!isset($_GET['officers']) && $user["officer"]) continue;
			
			$name = "$user[username]";

			if ($user["email"] != $email) $name = $email;
		}

		$json[] = ["name" => $name,
		           "points" => $stats["points"]];
	}
	
	if (isset($_GET['name'])) {
		foreach ($json as $row)
			if ($row['name'] == $_GET['name'])
				exit(json_encode($row));
	}
	else {
		exit(json_encode($json));
	}
}

$pagetitle = (isset($competition) ? $competition['name'] . ' ' : '') . "Leaderboard";
$pagedescription = "in realtime!";
include "hackathonIncludes/header.php";

?>

<style>
table {
	width: 600px;
}
</style>

<?php if (isset($competition)): ?>
	<a href="/competition/<?php echo $competition['id']; ?>/" class="btn"><- Back to Competition Problems</a><br><br>
<?php endif; ?>

<?php if (!isset($competition) || $competition['leaderboard']): ?>

<table id="leaderboard">
	<thead><tr><td>Rank</td><td>Name</td><td>Points</td></tr></thead>
	<tbody></tbody>
</table>

<script>
	(function () {
		var leaderboard = document.getElementById("leaderboard").getElementsByTagName("tbody")[0];

		var xhr = new XMLHttpRequest();
		xhr.onload = function () {
			var data = JSON.parse(this.responseText);
			var i;

			leaderboard.innerHTML = "";
			for (i = 0; i < data.length; i++) {
				leaderboard.innerHTML += "<tr><td>" + (i + 1) + "</td><td>" + data[i].name + "</td><td>"
						+ data[i].points + "</td>";
			}
		};

		var poll = function () {
			if (window.location.search.indexOf('officers') != -1) {
				xhr.open("GET", "?data&officers");
			}
			else {
				xhr.open("GET", "?data");
			}
			xhr.send();
			setTimeout(poll, <?= UPDATE_DELAY_MS ?>);
		}
		poll();
	})();
</script>

<?php else: ?>

Leaderboard is disabled for this competition.

<?php endif; ?>
