<?php
if (!empty($_GET['year']) && !is_numeric($_GET['year'])) header('Location: /problem/' . $_GET['year'] . '/');

$pagetitle = 'CTF';
$pagedescription = 'Capture The Flag';
include_once('hackathonIncludes/header.php');

$problems = json_decode(file_get_contents("./hackathonContent/ctfproblems.json"), true);
$results = json_decode(file_get_contents("hackathonContent/problem-results.json"), true);
?>

<link rel="stylesheet" href="/css/problems.css" />

<?php

foreach ($problems as $id => $problem) {
	if ((isset($_GET['getAll']) || $problem["state"] == ($_GET["competition"] ? : "up")) || ($_SESSION["user"]['officer']) == TRUE) {

?>
		<div id="problem-container">
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
					<a href="/ctfprob?prob=<?php echo $id; ?>?getAll=1" class="btn" style="<?php if($completed) echo 'background-color: green;'; ?>">
                         <?php if($completed) echo 'Flag Found';
                        else echo 'Find the Flag'; ?>
					</a>
				<?php } else { ?>
					<a href="/ctfprob?prob=<?php echo !empty($_GET['year']) ? $_GET['year'] . '/' : ''; ?><?php echo $id; ?> " class="btn" style="<?php if($completed) echo 'background-color: green;'; ?>">
					<?php if($completed) echo 'Flag Found';
                        else echo 'Find the Flag'; ?>
					</a>
<br><br>
				<?php } ?>
			</div>
		</div>
		<br>
<?php
	}
}

?>
</div>
