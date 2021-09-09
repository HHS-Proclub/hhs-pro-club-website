<?php

$competitions = json_decode(file_get_contents("content/competitions.json"), true);
$competition = &$competitions[$_GET["competition"]];

if (!$competition) die("This competition does not exist");

$pagetitle = $competition["name"];
$pagedescription = 'Competition problems';
include('includes/header.php');

if (empty($_SESSION["user"])) {
	die('You need to be logged in to participate.');
}

if (isset($_POST["create"])) {
	$competition["teams"][$_POST["team"]] = [$_SESSION["user"]["username"]];
	file_put_contents("content/competitions.json", json_encode($competitions, JSON_PRETTY_PRINT));
}

if (isset($_POST["join"])) {
	if (isset($competition["teams"][$_POST["team"] ])) {
		$competition["teams"][$_POST["team"]][] = $_SESSION["user"]["username"];
		file_put_contents("content/competitions.json", json_encode($competitions, JSON_PRETTY_PRINT));
	} else {
		// TODO: fuck shit
	}
	
}

foreach ($competition["teams"] as $t => $members) {
	if (in_array($_SESSION["user"]["username"], $members)) {
		$team = $t;
		break;
	}
}

if (!isset($team)) {
?>
<div style="float:left;width:50%">
	<h3>Create a new team</h3>
	<form id="create-form" method="post">
		<input type="text" name="team" placeholder="Team name" required /><br />
		<!-- <input type="password" name="password" placeholder="Password" required /><br /> -->
		<input type="submit" class="btn" name="create" value="Create" />
	</form>
</div>
<div style="float:left;width:50%">
	<h3>Join an existing team</h3>
	<form id="join-form" method="post">
		<input type="text" name="team" placeholder="Team name" required /><br />
		<!-- <input type="password" name="password" placeholder="Password" required /><br /> -->
		<input type="submit" class="btn" name="join"  value="Join" />
	</form>
</div>
<?php

	exit();
}

?>

<style>
.team-info {
	position: relative;
	/* width: 90%; */
	width: 100%;
	margin-bottom: 20px;
	/* margin-left: 5%; */
	padding: 30px;
	border: 1px solid #c2c7d0;
	/* border-radius: 3px; */
	text-decoration: none;
	background: white;
}
</style>

<div class="team-info">
	<strong>Team Name:</strong> <?php echo $team; ?><br />
	<strong>Members:</strong>
<?php

$users = json_decode(file_get_contents("content/users.json"), true);
$names = [];
foreach ($members as $username) {
	$user = $users[$username];
	$names[] = isset($user) ? "$user[first] $user[last]" : $username;
}
echo implode(", ", $names);

?>
	<br /><br />
	<a href="/leaderboard/<?php echo $_GET["competition"]; ?>/" class="btn" target="_blank">
		Competition Leaderboard
	</a>
</div>

<?php 
if ($competition['state']) {
	include 'problems.php';
}
else {
	echo 'This competition has not started!';
}
include 'includes/footer.php';
?>