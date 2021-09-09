<?php

/************************************************
 * Autograder form and handler
 *
 * Test data files: ${TEST_DATA_DIR}/<problem_id>.{in|out}
 * Submitted solutions: ${SOLUTIONS_DIR}/<problem_id>/<email>.<ext>
 *
 * Author: Simon Deng <simonsdeng@gmail.com>
 ************************************************/

define('TEST_DATA_DIR', './test-data');
define('SOLUTIONS_DIR', './solutions');
define('RESULTS_DB', './hackathonContent/problem-results.json');
    

// enabled languages
// TODO: read from db

/*******************
 * FUNCTIONS
 *******************/

// prints out grading result as HTML
function showResult($result, $description = "", $error = false) {
	$color = $error ? "red" : "green";
	echo "<div style=\"color: $color\">$result<br /><small>$description</small></div>";
}

// stores grading results in db
function storeResult($prob, $email, $correct, $err_msg = "") {
	$results = json_decode(file_get_contents(RESULTS_DB), true);
	if (!isset($results[$prob])) $results[$prob] = [];

	$result = [
		"correct" => $correct,
		"timestamp" => date("c")
	];

	if (!empty($err_msg)) $result["err_msg"] = $err_msg;

	$results[$prob][$email] = $result;
	file_put_contents(RESULTS_DB, json_encode($results, JSON_PRETTY_PRINT));
}

// returns any previous grading result from db
function getResult($prob, $email) {
	$results = json_decode(file_get_contents(RESULTS_DB), true);

	if (empty($results[$prob])) return false;
	if (isset($results[$prob][$email])) return $results[$prob][$email];

	return false;
}

/******************
 * AJAX HANDLING
 ******************/

// grade submission if AJAX
if ($_SERVER["PHP_SELF"] === "/ctfgrader.php") {
    
	if (empty($_POST['user'])
			|| empty($_POST['problem'])
			|| empty($_FILES['file'])) {
		die();
	}

	$user = $_POST['user'];						// submitter
	$prob = $_POST['problem'];					// problem name
	$uploaded = $_FILES['file']['tmp_name'];	// uploaded file path
    
	// check that test data exists for problem
	if (!file_exists(TEST_DATA_DIR."/$prob.txt")
			|| !is_dir(SOLUTIONS_DIR)) {
		die("Missing test data for problem $prob.");
	}

	// store solution in filesystem
	$contents = file_get_contents($uploaded);
	if (!file_exists(SOLUTIONS_DIR."/$prob")) {
		mkdir(SOLUTIONS_DIR."/$prob");
	}
    
	move_uploaded_file($uploaded, SOLUTIONS_DIR."/$prob/$user.{$langs[$lang]["ext"]}");

    
    // check if output is correct
    if (sha1(file_get_contents(TEST_DATA_DIR."/$prob.txt")) == sha1($contents)) {
        storeResult($prob, $user, true, 'Correct.');
        showResult("Result: Correct.", "", false);
    } else {
        storeResult($prob, $user, false, 'Incorrect.');
        showResult("Result: Incorrect.", "", true);
    }

	
    
    


/******************
 * FORM
 ******************/

// show submission form if included
} else {
	$prob = $_GET["prob"];
	if (empty($prob)) return;

	if (isset($_SESSION["user"]) && empty($competition) == empty($team)) {

?>
<h3>Submit your solution:</h3>
<form id="ctfgrader" action="/ctfgrader.php" enctype="multipart/form-data">
	</select></label>
	<input type="file" name="file" id="file" accept=".txt" required="" />
	<input type="submit" value="Submit" class="btn" />
	<input type="hidden" name="user" value="<?= isset($competition) ? $team : $_SESSION["user"]["email"] ?>" />
	<input type="hidden" name="problem" value="<?= $prob ?>" /><br />
</form>
<div id="result"></div>
<?php
		if ($result = getResult($prob, isset($competition) ? $team : $_SESSION["user"]["email"])) {
?>
<br />
<h3>Previous submission results</h3>
<?php

			$msg = $result['correct'] ? 'Correct' : $result['err_msg'];

			showResult("Result: $msg", "", !$result['correct']);
		}

?>
<script>

	document.getElementById("ctfgrader").onsubmit = function (e) {
		e.preventDefault();
		document.getElementById("result").innerHTML = "<br />Loading...";

		var xhr = new XMLHttpRequest();

		xhr.onload = function () {
			// clears file upload field
			var file = document.getElementById("file");
			file.parentNode.insertBefore(file.cloneNode(), file);
			file.parentNode.removeChild(file);
			document.getElementById("result").innerHTML = "<br />" + this.response;
		};

		xhr.open("POST", "/ctfgrader.php");
		xhr.send(new FormData(this));
	};
</script>
<?php

	// not logged in
	} else {

?>
<br />You must be <a href="/login/">logged in</a> to submit a solution.
<?php

	}
}

?>
