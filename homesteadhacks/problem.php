<?php

$problem = json_decode(file_get_contents("./hackathonContent/problems".$_GET['year'].".json"), true)[$_GET["problem"]];
// $problem = json_decode(file_get_contents("content/problems2018.json"), true)[$_GET["problem"]];

if ($problem["state"] != "down" || isset($_GET['getAll'])){ 
	$pagetitle = "$_GET[problem]: $problem[title]";
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
<h3>Description</h3>
<?php if (($problem["state"] != "down" || isset($_GET['getAll'])) || ($_SESSION["user"]['officer']) == TRUE) { ?>
<div class="box one"><?= nl2br($problem["description"]) ?></div>

<div class="box one">
<p>
	<h3>Input Format</h3>
	<?= nl2br($problem["inputForm"]) ?>
</p>
<p>
	<h4>Sample Input</h4>
	<pre><code><?= $problem["sampleInput"] ?></code></pre>
</p>
</div>

<div class="box one">
<p>
	<h3>Output Format</h3>
	<?= nl2br($problem["outputForm"]) ?>
</p>
<p>
	<h4>Sample Output</h4>
	<pre><code><?= $problem["sampleOutput"] ?></code></pre>
</p>
</div>

<br /><br />
<?php include 'grader.php' ?>

<?php } ?>
