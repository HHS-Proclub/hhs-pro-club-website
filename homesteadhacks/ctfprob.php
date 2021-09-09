<?php

$problem = json_decode(file_get_contents("./hackathonContent/ctfproblems.json"), true)[$_GET["prob"]];

// $problem = json_decode(file_get_contents("content/problems2018.json"), true)[$_GET["problem"]];

if ($problem["state"] != "down" || isset($_GET['getAll'])){ 
	$pagetitle = $_GET["prob"] . ": $problem[title]";
	$pagedescription = $problem["type"];
} else {
	$pagetitle = "Error 404";
    $pagedescription =  "This page wasn't found or isn't up yet!";
}
include('./hackathonIncludes/header.php');

$competitions = json_decode(file_get_contents("./hackathonContent/competitions.json"), true);
if (isset($competitions[$problem["state"]])) {
	$competition = $competitions[$problem["state"]];
	foreach ($competition["teams"] as $t => $members) {
		if (in_array($_SESSION["user"]["username"], $members)) {
			$team = $t;
			break;
		}
	}
}

?>

<?php if (($problem["state"] != "down" || isset($_GET['getAll'])) || ($_SESSION["user"]['officer']) == TRUE) { ?>
<div class="box one" style="font-family: courier new;"><?= nl2br($problem["description"]) ?></div>

<br /><br />
<?php include './ctfgrader.php' ?>

<?php } ?>
