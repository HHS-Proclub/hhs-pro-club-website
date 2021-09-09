<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

if (isset($_POST['pr']) && isset($_POST['title']) && isset($_POST['state'])) {
	$prob = $_POST['pr'];
	unset($_POST['pr']);
	move_uploaded_file($_FILES['inputFile']['tmp_name'], 'test-data/' . $prob . '.in');
	move_uploaded_file($_FILES['outputFile']['tmp_name'], 'test-data/' . $prob . '.out');
	//move_uploaded_file($_FILES['inputFile']['tmp_name'], 'test-data2019/' . $prob . '.in');
	//move_uploaded_file($_FILES['outputFile']['tmp_name'], 'test-data2019/' . $prob . '.out');
	//move_uploaded_file($_FILES['inputFile']['tmp_name'], '/public_html/homesteadhacks/test-data2019/' . $prob . '.in');
	//move_uploaded_file($_FILES['outputFile']['tmp_name'], '/public_html/homesteadhacks/test-data2019/' . $prob . '.out');
    unset($_POST['inputFile']);
    unset($_POST['outputFile']);
	foreach ($_POST as $key => $value) $_POST[$key] = str_replace("\r\n", "<br>", $_POST[$key]);
	// $problems = json_decode(file_get_contents('content/problems2019.json'), true);
	$problems = json_decode(file_get_contents('content/problems.json'), true);
	//$problems = json_decode(file_get_contents('homesteadhacks/hackathonContent/problems.json'), true);
	$problems = array($prob => $_POST) + $problems;
    file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
    //file_put_contents('content/problems2019.json', json_encode($problems, JSON_PRETTY_PRINT));
    // file_put_contents('homesteadhacks/hackathonContent/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
    header("Location: /problems");
}

$pagetitle = 'Post Problems';
$pagedescription = "you're welcome soham";
include('includes/header.php');
?>

<style>
.shorter {
	height: 100px;
}
</style>

		<form method="post" enctype="multipart/form-data">
			<div class="box one-half">
				<p>
					<label for="pr">PR</label><br>
					<input type="text" name="pr" placeholder="PRA8, PRB5, etc" required>
				</p>
				<p>
					<label for="title">Title</label><br>
					<input type="text" name="title" required>
				</p>
				<p>
					<label for="type">Type</label><br>
					<input type="radio" name="type" value="Beginner"> Beginner<br>
					<input type="radio" name="type" value="Intermediate"> Intermediate<br>
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
				  <label for="hints">Hints (Leave blank for no hints)</label>
					<textarea name="hints" class="shorter"></textarea>
				</p>
			</div>
			<div class="box one-half last-child">
				<p>
					<label for="inputForm">Input format</label><br>
					<textarea name="inputForm" class="shorter" required></textarea>
				</p>
				<p>
					<label for="sampleInput">Sample input</label><br>
					<textarea name="sampleInput" class="shorter" required></textarea>
				</p>
				<p>
					<label for="outputForm">Output format</label><br>
					<textarea name="outputForm" class="shorter" required></textarea>
				</p>
				<p>
					<label for="sampleOutput">Sample output</label><br>
					<textarea name="sampleOutput" class="shorter" required></textarea>
				</p>
				<p>
					<label for="inputFile">Input test case (PRname.in)</label>
					<input type="file" name="inputFile" required>
				</p>
				<p>
					<label for="outputFile">Test case output (PRname.out)</label>
					<input type="file" name="outputFile" required>
				</p>
			</div>
			<!-- ohlook tis a center tag -->
			<center><input type="submit" class="btn" value="Post"></center>
		</form>

<?php include('includes/footer.php'); ?>
