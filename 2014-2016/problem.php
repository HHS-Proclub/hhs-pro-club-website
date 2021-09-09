<?php

$problem = json_decode(file_get_contents("content/problems".$_GET['year'].".json"), true)[$_GET["problem"]];

if ($problem["state"] != "down" || isset($_GET['getAll'])){ 
	$pagetitle = "$_GET[problem]: $problem[title]";
	$pagedescription = $problem["type"];
} else {
	$pagetitle = "Error 404";
	$pagedescription =  "This page wasn't found or isn't up yet!";
}
include('includes/header.php');

$competitions = json_decode(file_get_contents("content/competitions.json"), true);
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

<?php if ($problem["state"] != "down" || isset($_GET['getAll'])) { ?>
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
	<h3>Output Format</h4>
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
<?php include('includes/footer.php'); ?>
