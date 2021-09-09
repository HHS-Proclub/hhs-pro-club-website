<?php

$problem = json_decode(file_get_contents("content/problems".$_GET['year'].".json"), true)[$_GET["problem"]];
// $problem = json_decode(file_get_contents("content/problems2018.json"), true)[$_GET["problem"]];

if (!is_null($problem) && ($problem["state"] != "down" || isset($_GET['getAll']))){ 
	$pagetitle = "$_GET[problem]: $problem[title]";
	$pagedescription = $problem["type"];
} else {
	$pagetitle = "Error 404";
	$pagedescription =  "This page wasn't found or isn't up yet!";
	include('includes/header.php');
	die();
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

// Only add below stuff if problem is using version 2 format
if (array_key_exists("version", $problem) && $problem["version"] == 2) {
?>
<style>
h4 {
  margin-top: 2em;
	margin-bottom: 0;
}

pre {
	padding: 2px;
	margin-bottom: 1.5em;
	margin-top: 1.5em;
}

.content {
	padding: 16px 30px 30px 30px;
}

.link-disabled {
	color: #888;
}

#bonus-container {
	margin-bottom: -1em;
}

#hint-container {
  margin-bottom: -2em;
}

.box {
	margin-bottom: 15px;
}
</style>

<div id="submission-result-box" style="display: none;">
  <div class="progress-box"></div>
  <div class="submission-status">
    <p class="status-text">Waiting...</p>
    <div class="loader"></div>
  </div>
  <div class="test-results-box"></div>
</div>

<template id="test-result">
  <a href="#" class="tooltip-no-underline">
    <div class="test-result">
      <div class="test-verdict"></div>
      <div class="test-number"></div>
      <div class="test-info">
        <div class="test-memory"></div>
        <div class="test-time"></div>
      </div>
    </div>
   </a>
</template>

<script src="/js/problem_status.js"></script>

<? } ?>

<?php if ($problem["state"] != "down" || isset($_GET['getAll'])) { ?>
<div class="box one"><?= $problem["description"] ?></div>

<?php if (array_key_exists("version", $problem) && $problem["version"] == 2) { ?>
<!-- Everything in here is part of the new problem statement format (version 2) -->

<?php if ($problem["bonus"]) { ?>

<a class="link-disabled" href="#/" id="bonus-button" onClick="toggleBonus();">Show Bonus</a>
<div id="bonus-container" style="display: none;"><?= $problem["bonus"] ?></div>

<br>

<?php } ?>

<!-- End of new problem statement format (version 2) -->

<?php } else { ?>
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
<?php } ?>


<?php if ($problem["hints"]) { ?>

<a href="#/" id="hint-button" onClick="toggleHints();">Show Hints</a>
<div id="hint-container" style="display: none;"><?= $problem["hints"] ?></div>

<?php }?>

<br /><br />
<script src="/js/problem.js"></script>

<?php if (array_key_exists("version", $problem) && $problem["version"] == 2) { ?>

<?php include 'grader.php' ?>

<script type="text/javascript" async
  src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/latest.js?config=TeX-MML-AM_CHTML">
</script>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/highlight.js/10.1.2/styles/github.min.css">
<link rel="stylesheet" href="css/problemv2.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/highlight.js/10.1.2/highlight.min.js"></script>
<script>hljs.initHighlightingOnLoad();</script>

<?php } else { ?>

<?php include 'grader.20old.php' ?>

<?php } } ?>

<?php include('includes/footer.php'); ?>
