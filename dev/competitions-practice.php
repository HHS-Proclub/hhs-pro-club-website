<?php
$pagetitle = 'Competitions Practice';
$pagedescription = 'HPI 2015 Review';
include('includes/header.php');

$problems = json_decode(file_get_contents("content/problems.json"), true);
?>

<link rel="stylesheet" type="text/css" href="/css/problems.css" />

<div id="problem-container">
<?php

foreach ($problems as $id => $problem) {

?>
	<?php if ($problem["state"] == "hpi2015review"){ ?>
		<div class="challenge-problem">
			<span class="header-type <?php echo !strcmp($problem["type"], 'Beginner') ? 'beg' : 'adv'; ?>"><?php echo $problem["type"] ?></span>
			<h2>
				<?php echo $id.": ".$problem["title"] ?>
			</h2>
			<p class="problem-description">
				<?php echo $problem["blurb"] ?>
			</p>
			<div class="problem-footer">
				<a href="/problems/<?php echo $id ?>/" class="btn">
				Solve Challenge
				</a>
			</div>
		</div>
<?php
	}
}

?>
</div>
<?php include('includes/footer.php'); ?>
