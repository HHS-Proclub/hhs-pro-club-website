<?php
if (!empty($_GET['year']) && !is_numeric($_GET['year'])) header('Location: /problem/' . $_GET['year'] . '/');

$pagetitle = 'Challenge Problems';
$pagedescription = 'Sharpen your Programming Skills';
include_once('includes/header.php');

$problems = json_decode(file_get_contents("content/problems" . $_GET['year'] . ".json"), true);
// $problems = json_decode(file_get_contents("content/problems2019.json"), true);
$results = json_decode(file_get_contents("content/problem-results" . $_GET['year'] . ".json"), true);
?>

<link rel="stylesheet" href="/css/problems.css" />

<div id="problem-container">
<?php

foreach ($problems as $id => $problem) {
	if (isset($_GET['getAll']) || $problem["state"] == ($_GET["competition"] ? : "up")) {

?>
		<div class="challenge-problem">
			<?php if (!strcmp($problem["type"], 'Beginner'))
			{
				$level = 'beg';
			}
			else if (!strcmp($problem["type"], 'Intermediate'))
			{
				$level = 'int';
			}
			else if (!strcmp($problem["type"], 'Advanced'))
			{
				$level = 'adv';
			}
			else if (!strcmp($problem["type"], 'Expert'))
			{
				$level = 'exp';
			}
			else
			{
				$level = 'other';
			}
			?>

			<span class="header-type <?php echo $level; ?>"><?php echo $problem["type"]; ?></span>
			<!--<span class="header-type <?php echo !strcmp($problem["type"], 'Beginner') ? 'beg' : 'adv'; ?>"><?php echo $problem["type"]; ?></span>-->
			<h2>
				<?php echo $id . ": " . $problem["title"]; ?>
			</h2>
			<p class="problem-description">
				<?php echo $problem["blurb"]; ?>
			</p>
                <?php
                    $completed = false;
										$submitted = false;
										$score = 0;
										$maxScore = (array_key_exists("maxScore", $problem) ? $problem["maxScore"] : 100);
                    foreach ((array) $results[$id] as $email => $result) {
                        if ($result["correct"] && $email == $_SESSION['user']['email']) {
                            $completed = true;
														$score = $maxScore;
                        }
												if ($email == $_SESSION['user']['email'] && array_key_exists("score", $result)) {
													  $score = $result["score"];
														$submitted = true;
												}
                    }
                ?>
			<div class="problem-footer">
				<?php if (isset($_GET['getAll'])){ ?>
					<a href="/problem?problem=<?php echo $id; ?>&getAll=1" class="btn" style="<?php if($completed) echo 'background-color: lightgray;'; ?>">
                         <?php if($completed) echo 'Completed (' . $score . '/' . $maxScore . ')';
                        else if ($submitted) echo 'Solve Challenge (' . $score . '/' . $maxScore . ')';
												else echo 'Solve Challenge'; ?>
					</a>
				<?php } else { ?>
					<a href="/problem?problem=<?php echo !empty($_GET['year']) ? $_GET['year'] . '/' : ''; ?><?php echo $id; ?>" class="btn" style="<?php if($completed) echo 'background-color: lightgray;'; ?>">
					<?php if($completed) echo 'Completed (' . $score . '/' . $maxScore . ')';
					      else if ($submitted) echo 'Solve Challenge (' . $score . '/' . $maxScore . ')';
                else echo 'Solve Challenge'; ?>
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
