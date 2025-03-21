<?php

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

if (isset($_POST['pr']) && isset($_POST['title']) && isset($_POST['state'])) {
	$prob = $_POST['pr'];
	unset($_POST['pr']);
	$problems_data = file_get_contents('content/problems.json');
	$problems = json_decode($problems_data, true);
	$problems = array($prob => $_POST) + $problems;
    $problems_f = fopen("content/problems.json","r+");
    fwrite($problems_f, json_encode($problems, JSON_PRETTY_PRINT));
    fclose($problems_f);
    header("Location: /problems");
}

$pagetitle = 'Post Problems';
$pagedescription = "you're welcome soham";
include('includes/header.php');
?>

	<div class="box-gray one-half">
		<form method="post">
			<p>
				<label for="pr">PR</label><br>
				<input type="text" name="pr" placeholder="A8, B5, etc" required>
			</p>
			<p>
				<label for="title">Title</label><br>
				<input type="text" name="title" required>
			</p>
			<p>
				<label for="type">Type</label><br>
				<input type="radio" name="type" value="Beginner"> Beginner<br>
				<input type="radio" name="type" value="Advanced"> Advanced
			</p>
			<p>
				<label for="state">State</label><br>
				<input type="radio" name="state" value="up"> up<br>
				<input type="radio" name="state" value="down"> down<br>
				<input type="radio" name="state"> other: <input type="text">
				<script>
					document.currentScript.previousElementSibling
							.addEventListener("blur", function () {
						this.previousElementSibling.value = this.value;
					});
				</script>
			</p>
			<p>
				<label for="blurb">Blurb</label><br>
				<input type="text" name="blurb" required>
			</p>
			<p>
				<label for="description">Description</label><br>
				<textarea name="description" required></textarea>
			</p>
			<p>
				<label for="inputForm">Input format</label><br>
				<textarea name="inputForm" required></textarea>
			</p>
			<p>
				<label for="sampleInput">Sample input</label><br>
				<textarea name="sampleInput" required></textarea>
			</p>
			<p>
				<label for="outputForm">Output format</label><br>
				<textarea name="outputForm" required></textarea>
			</p>
			<p>
				<label for="sampleOutput">Sample output</label><br>
				<textarea name="sampleOutput" required></textarea>
			</p>
			<!-- ohlook tis a center tag -->
			<center><input type="submit" class="btn" value="Post"></center>
		</form>
	</div>

<?php include('includes/footer.php'); ?>