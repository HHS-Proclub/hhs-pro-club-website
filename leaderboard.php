<?php

define("UPDATE_DELAY_MS", 2000);

$competitions = json_decode(file_get_contents("content/competitions.json"), true);
if (isset($competitions[$_GET["state"]])) {
	$competition = $competitions[$_GET["state"]];
	$competition['id'] = $_GET['state'];
}

// output leaderboard data as JSON
if (isset($_GET["data"])) {
    header("Content-type: application/json");

    $problems = json_decode(file_get_contents("content/problems.json"), true);
    $results = json_decode(file_get_contents("content/problem-results.json"), true);
    $users = json_decode(file_get_contents("content/users.json"), true);
    $useroffsets = json_decode(file_get_contents("content/useroffsets.json"), true);
    
    $leaderboard = [];
    $json = [];

    // tally up points and total time
    foreach ($problems as $id => $problem) {
        if (($problem["state"] === ($_GET["state"] ?: "up") || $problem["state"] === "hidden") && $results[$id]) {
            if (array_key_exists("version", $problem) && $problem["version"] == 2) {
                // JudgeLite
                $points = $problem["maxScore"];
                foreach ($results[$id] as $email => $result) {
                    if (!array_key_exists($email, $leaderboard)) {
                        $leaderboard[$email] = array("points" => 0, "timestamp" => 0, "total_time" => 0);
                    }
                    $leaderboard[$email]["points"] += $result["score"];
                    $leaderboard[$email]["timestamp"] = max(strtotime($result["timestamp"]), $leaderboard[$email]["timestamp"]);
                    if (isset($result["time"])) {
                        $leaderboard[$email]["total_time"] += $result["time"]*1000;
                    }
					$leaderboard[$email]["total_time"] = round($leaderboard[$email]["total_time"], 1);
                }
            } else {
                // Ideone
                $points = 100;
                foreach ($results[$id] as $email => $result) {
                    if ($result["correct"]) {
                        if (!array_key_exists($email, $leaderboard)) {
                            $leaderboard[$email] = array("points" => 0, "timestamp" => 0, "total_time" => 0);
                        }
                        $leaderboard[$email]["points"] += $points;
                        $leaderboard[$email]["timestamp"] = max(strtotime($result["timestamp"]), $leaderboard[$email]["timestamp"]);
                        if (isset($result["time"])) {
                            $leaderboard[$email]["total_time"] += $result["time"]*1000;
                        }
						$leaderboard[$email]["total_time"] = round($leaderboard[$email]["total_time"], 1);
                    }
                }
            }
        }
    }

    foreach ($useroffsets as $member => $offset){
        if (!array_key_exists($member, $leaderboard)) {
            $leaderboard[$member] = array("points" => 0, "timestamp" => 0, "total_time" => 0);
        }
        $leaderboard[$member]["points"] += $offset["points"];
    }

    // sort by points first, then total time (lower is better), then timestamp
    uasort($leaderboard, function ($a, $b) {
        $result = $b["points"] - $a["points"];
        if (!$result) $result = $a["total_time"] - $b["total_time"]; // Compare by total time if points are equal
        if (!$result) $result = $a["timestamp"] - $b["timestamp"];
        return $result;
    });

    // construct array of name => point mappings
    foreach ($leaderboard as $email => $stats) {
        if (isset($competition)) {
            $name = $email;
        } else {
            foreach ($users as $user) if (strcmp($user["email"], $email) === 0){
                break;
            }

            // skip officers
            $name = "$user[first] $user[last]";
            if ($user["email"] != $email) $name = $email;
        }

        $json[] = [
            "name" => $name,
            "points" => $stats["points"],
            "total_time" => $stats["total_time"] // Add the total time column
        ];
    }

    if (isset($_GET['name'])) {
        foreach ($json as $row)
            if ($row['name'] == $_GET['name'])
                exit(json_encode($row));
    } else {
        exit(json_encode($json));
    }
}

$pagetitle = (isset($competition) ? $competition['name'] . ' ' : '') . "Leaderboard";
$pagedescription = "in realtime!";
include "includes/header.php";

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
	<thead>
		<tr>
			<td>Rank</td>
			<td>Name</td>
			<td>Points</td>
			<td>Total Time (ms)</td>
		</tr>
	</thead>
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
				var encodedName = data[i].name.replace(/[\u00A0-\u9999<>\&]/g, function(i) {
					   return '&#'+i.charCodeAt(0)+';';
				});
				leaderboard.innerHTML += "<tr><td>" + (i + 1) + "</td><td>" + encodedName + "</td><td>"
				            + data[i].points + "</td><td>" + data[i].total_time + "</td>"; // Show total_time
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

<?php include "includes/footer.php"; ?>
