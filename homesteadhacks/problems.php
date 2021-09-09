<?php
if (!empty($_GET['year']) && !is_numeric($_GET['year'])) header('Location: /problem/' . $_GET['year'] . '/');

$pagetitle = 'Challenge Problems';
$pagedescription = 'Sharpen your Programming Skills';
include_once('hackathonIncludes/header.php');

$problems = json_decode(file_get_contents("hackathonContent/problems" . $_GET['year'] . ".json"), true);
// $problems = json_decode(file_get_contents("content/problems2019.json"), true);
$results = json_decode(file_get_contents("hackathonContent/problem-results" . $_GET['year'] . ".json"), true);
?>

<link rel="stylesheet" href="/css/problems.css" />

<div id="problem-container">
<?php

foreach (array_reverse($problems) as $id => $problem) {
	if ((isset($_GET['getAll']) || $problem["state"] == ($_GET["competition"] ? : "up")) || ($_SESSION["user"]['officer']) == TRUE) {

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
			else
			{
				$level = 'adv';
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
                    foreach ((array) $results[$id] as $email => $result) {
                        if ($result["correct"] && $email == $_SESSION['user']['email']) {
                            $completed = true;
                        }
                    }
                ?>
			<div class="problem-footer">
				<?php if (isset($_GET['getAll'])){ ?>
					<a href="/problem/<?php echo $id; ?>/?getAll=1" class="btn" style="<?php if($completed) echo 'background-color: lightgray;'; ?>">
                         <?php if($completed) echo 'Challenge Completed';
                        else echo 'Solve Challenge'; ?>
					</a>
				<?php } else { ?>
					<a href="/problem/<?php echo !empty($_GET['year']) ? $_GET['year'] . '/' : ''; ?><?php echo $id; ?>/ " class="btn" style="<?php if($completed) echo 'background-color: lightgray;'; ?>">
					<?php if($completed) echo 'Challenge Completed';
                        else echo 'Solve Challenge'; ?>
					</a>
				<?php } ?>
			</div>
		</div>
	<br>
<?php
	}
}

?>
</div>
