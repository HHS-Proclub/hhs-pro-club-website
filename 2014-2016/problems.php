<?php
if (!empty($_GET['year']) && !is_numeric($_GET['year'])) header('Location: /problem/' . $_GET['year'] . '/');

$pagetitle = 'Challenge Problems';
$pagedescription = 'Sharpen your Programming Skills';
include_once('includes/header.php');

$problems = json_decode(file_get_contents("content/problems".$_GET['year'].".json"), true);
?>

<link rel="stylesheet" href="/css/problems.css" />

<div id="problem-container">
<?php

foreach ($problems as $id => $problem) {
	if (isset($_GET['getAll']) || $problem["state"] == ($_GET["competition"] ?: "up")) {

?>
		<div class="challenge-problem">
			<span class="header-type <?= !strcmp($problem["type"], 'Beginner') ? 'beg' : 'adv'; ?>"><?= $problem["type"] ?></span>
			<h2>
				<?= $id.": ".$problem["title"] ?>
			</h2>
			<p class="problem-description">
				<?= $problem["blurb"] ?>
			</p>
			<div class="problem-footer">
				<?php if (isset($_GET['getAll'])){ ?>
					<a href="/problem/<?= $id ?>/?getAll=1" class="btn">
					Solve Challenge
					</a>
				<?php } else { ?>
					<a href="/problem/<?php echo !empty($_GET['year']) ? $_GET['year'] . '/' : ''; ?><?= $id ?>/ " class="btn">
					Solve Challenge
					</a>
				<?php } ?>
			</div>
		</div>
<?php
	}
}

?>
</div>
<?php include_once('includes/footer.php'); ?>
