<?php

define('TEST_DATA_DIR', 'test-data');
define('SOLUTIONS_DIR', 'solutions');
define('IDEONE_USER', 'hhsprogramming');
define('IDEONE_PASSWORD', 'hhsprog4ming');
define('RESULTS_DB', 'content/problem-results.json');

// enabled languages
// TODO: read from db
$langs = array(
	10 => array("name" => "Java", "ext" => "java"),
	116 => array("name" => "Python 3", "ext" => "py"),
	44 => array("name" => "C++", "ext" => "cpp")
);

// prints out grading result as HTML
function showResult($result, $description = "", $error = false) {
	$color = $error ? "red" : "green";
	echo "<div style=\"color: $color\">$result<br /><small>$description</small></div>";
}

// stores grading results in db
function storeResult($prob, $email, $lang, $correct, $err_msg = "", $time = NULL, $mem = NULL) {
	$results = json_decode(file_get_contents(RESULTS_DB), true);
	if (!isset($results[$prob])) $results[$prob] = array();

	$result = array("lang" => $lang,
	                "correct" => $correct,
					"timestamp" => date("c"));
	if (!empty($err_msg)) $result["err_msg"] = $err_msg;
	if (!is_null($time)) $result["time"] = $time;
	if (!is_null($mem)) $result["mem"] = $mem;
	
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

// grade submission if AJAX
if ($_SERVER["PHP_SELF"] === "/grader.php") {
	if (empty($_POST['user']) || empty($_POST['problem'])
			|| empty($_POST['lang']) || empty($_FILES['file'])
			|| !$_FILES['file']['size']) {
		die();
	}

	$user = $_POST['user'];						// submitter
	$prob = $_POST['problem'];					// problem name
	$lang = intval($_POST['lang']);				// source code language
	$uploaded = $_FILES['file']['tmp_name'];	// uploaded file path

	// check that test data exists for problem
	if (!file_exists(TEST_DATA_DIR."/$prob.in")
			|| !file_exists(TEST_DATA_DIR."/$prob.out")
			|| !is_dir(SOLUTIONS_DIR)) {
		die("Missing test data for problem $prob.");
	}

	// store solution in filesystem
	$contents = file_get_contents($uploaded);
	if (!file_exists(SOLUTIONS_DIR."/$prob")) {
		mkdir(SOLUTIONS_DIR."/$prob");
	}
	move_uploaded_file($uploaded, SOLUTIONS_DIR."/$prob/$user.{$langs[$lang]["ext"]}");

	// replace class name for Java
	if ($lang === 10) {
		$contents = str_replace($prob, "Main", $contents, $count);
		if ($count === 0) {
			storeResult($prob, $user, $lang, false, 'Class name is incorrect.');
			showResult("Class name is incorrect.", "", true);
			die();
		}
	}

	// ideone API (http://ideone.com/files/ideone-api.pdf)
	try {
		$client = new SoapClient('http://ideone.com/api/1/service.wsdl');
	} catch (Exception $e) {
		die("SOAP fault: ".$e->getMessage());
	}

	// upload source code to ideone
	try {
		$result = $client->__soapCall('createSubmission',
			array('user' => IDEONE_USER,
				'pass' => IDEONE_PASSWORD,
				'sourceCode' => $contents,
				'language' => $lang,
				'input' => file_get_contents(TEST_DATA_DIR."/$prob.in"),
				'run' => true,
				'private' => true));
	} catch (SoapFault $e) {
		die("SOAP fault: ".$e->getMessage());
	}
	if ($result['error'] !== 'OK') {				// Ideone API error
		die('Ideone error: '.$result['error']);
	}
	$link = $result['link'];

	// poll for submission result
	do {
		try {
			$result = $client->__soapCall('getSubmissionStatus',
				array('user' => IDEONE_USER,
					'pass' => IDEONE_PASSWORD,
					'link' => $link));
		} catch (SoapFault $e) {
			die("SOAP fault: ".$e->getMessage());
		}
		if ($result['error'] !== 'OK') {			// Ideone API error
			die('Ideone error: '.$result['error']);
		}
		if ($result['status'] !== 0) {	// wait 3 seconds before trying
			sleep(3);					// trying again
		}
	} while ($result['status'] !== 0);	// not finished running

	// handle runtime/compilation errors
	if ($result['result'] === 11) {
		storeResult($prob, $user, $lang, false, 'Compilation error.');
		showResult("Result: Compilation error.", "", true);
		die();
	} elseif ($result['result'] === 12) {
		storeResult($prob, $user, $lang, false, 'Runtime error.');
		showResult("Result: Runtime error.", "", true);
		die();
	} elseif ($result['result'] === 13) {
		storeResult($prob, $user, $lang, false, 'Time limit (5s) exceeded.');
		showResult("Result: Time limit (5s) exceeded.", "", true);
		die();
	} elseif ($result['result'] === 19) {
		storeResult($prob, $user, $lang, false, 'Illegal system call');
		showResult("Result: Illegal system call", "", true);
		die();
	} elseif ($result['result'] === 20) {
		showResult("Ideone internal error. Please try again later.", "", true);
		die();
	} elseif ($result['result'] !== 15) {	// status is not success
		storeResult($prob, $user, $lang, false, 'Unknown error.');
		showResult("Result: Unknown error.", "", true);
		die();
	}

	// check if output is correct
	try {
		$result = $client->__soapCall('getSubmissionDetails',
			array('user' => IDEONE_USER,
				'pass' => IDEONE_PASSWORD,
				'link' => $link,
				'withSourceCode' => false,
				'withInput' => false,
				'withOutput' => true,
				'withStderr' => false,
				'withCmpinfo' => false));
	} catch (SoapFault $e) {
		die("SOAP fault: ".$e->getMessage());
	}
	if ($result['error'] !== 'OK') {				// Ideone API error
		die('Ideone error: '.$result['error']);
	}
	if (trim($result['output']) === trim(file_get_contents(TEST_DATA_DIR."/$prob.out"))) {
		storeResult($prob, $user, $lang, true, '', $result['time'], $result['memory']);
		showResult("Result: Correct.",
				'Runtime: '.$result['time'].'s, Memory Usage: '
				.round($result['memory'] / 1000, 2).' KB');
		// echo '<span style="color: green">Result: Correct.<h4>Runtime: '.$result['time'].'s.</h4>'
		//		.'<h4>Memory Usage: '.round($result['memory'] / 1000, 2).' KB</h4></span>';
	} else {
		storeResult($prob, $user, $lang, false, 'Incorrect output.');
		showResult("Result: Incorrect output.", "", true);
	}


// show submission form if included
} else {
	$prob = $_GET["problem"];
	if (empty($prob)) return;

	if (isset($_SESSION["user"]) && empty($competition) == empty($team)) {
?>
<h3>Submit your solution (<?php echo $prob; ?>.<span id="ext">java</span>):</h3>
<form id="grader" action="/grader.php" enctype="multipart/form-data">
	<label>Language: <select name="lang" id="lang">
<?php

		foreach ($langs as $id => $lang) {
			echo <<<EOT
	<option value="$id">{$lang["name"]}</option>

EOT;
		}

?>
	</select></label>
	<input type="file" name="file" id="file" accept=".java" required="" />
	<input type="submit" value="Submit" class="btn" />
	<input type="hidden" name="user" value="<?= isset($competition) ? $team : $_SESSION["user"]["email"] ?>" />
	<input type="hidden" name="problem" value="<?= $prob ?>" /><br />
	<small>Powered by <a href="http://ideone.com">ideone.com</a></small>
</form>
<div id="result"></div>
<?php
		if ($result = getResult($prob, isset($competition) ? $team : $_SESSION["user"]["email"])) {
?>
<br />
<h3>Previous submission results</h3>
<?php

			$msg = $result['correct'] ? 'Correct' : $result['err_msg'];
			$stats = $result['correct'] ? "Runtime: {$result['time']}s, "
					.'Memory Usage: '.round($result['mem'] / 1000, 2).' KB' : "";

			showResult("Result: $msg", $stats, !$result['correct']);
		}

?>
<script>
	var exts = {
<?php

		$comma = "";
		foreach ($langs as $id => $lang) {
			$comma = ",";
			echo <<<EOT
		$id: "{$lang["ext"]}"$comma

EOT;
		}

?>
	};

	document.getElementById("lang").onchange = function () {
		var ext = exts[this.options[this.selectedIndex].value];
		document.getElementById("ext").innerHTML = ext;
		document.getElementById("file").accept = "." + ext;
	};

	document.getElementById("grader").onsubmit = function (e) {
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

		xhr.open("POST", "/grader.php");
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
