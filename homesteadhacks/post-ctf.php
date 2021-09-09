<?php
session_start();
    if (($_SESSION["user"]['officer']) != TRUE) {
        die("Sorry, you do not have permission to view this page.");
    }

if (isset($_POST['pr']) && isset($_POST['title']) && isset($_POST['state'])) {
	$prob = $_POST['pr'];
	unset($_POST['pr']);
	// move_uploaded_file($_FILES['inputFile']['tmp_name'], 'test-data/' . $prob . '.in');
	// move_uploaded_file($_FILES['outputFile']['tmp_name'], 'test-data/' . $prob . '.out');
	move_uploaded_file($_FILES['outputFile']['tmp_name'], './test-data/' . $prob . '.txt');
    unset($_POST['outputFile']);
	foreach ($_POST as $key => $value) $_POST[$key] = str_replace("\r\n", "<br>", $_POST[$key]);
	$ctfproblems = json_decode(file_get_contents('./hackathonContent/ctfproblems.json'), true);
	// $problems = json_decode(file_get_contents('content/problems2019.json'), true);
	$ctfproblems = array($prob => $_POST) + $ctfproblems;
    file_put_contents('./hackathonContent/ctfproblems.json', json_encode($ctfproblems, JSON_PRETTY_PRINT));
    // file_put_contents('content/problems2019.json', json_encode($problems, JSON_PRETTY_PRINT));
    header("Location: /ctf");
}

$pagetitle = 'Post CTF Problems';
$pagedescription = "wowowowow";
include('hackathonIncludes/header.php');
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
			</div>
			<div class="box one-half last-child">
                <p>
                    <label for="blurb">Blurb</label><br>
                    <input type="text" name="blurb" required>
                </p>
                <p>
                    <label for="description">Description</label><br>
                    <textarea name="description" required></textarea>
                </p>
				<p>
					<label for="outputFile">Test case output (PRname.text)</label>
					<input type="file" name="outputFile" required>
				</p>
			</div>
			<!-- ohlook tis a center tag -->
			<center><input type="submit" class="btn" value="Post"></center>
		</form>
