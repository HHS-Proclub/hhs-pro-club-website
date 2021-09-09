<?php

/************************************************
 * Autograder form and handler
 *
 * Test data files: ${TEST_DATA_DIR}/<problem_id>.{in|out}
 * Submitted solutions: ${SOLUTIONS_DIR}/<problem_id>/<email>.<ext>
 *
 * Author: Simon Deng <simonsdeng@gmail.com>
 * Edited by Kyle Fu <kfu697@student.fuhsd.org>
 ************************************************/

define('TEST_DATA_DIR', 'test-data');
define('SOLUTIONS_DIR', 'solutions');
define('IDEONE_USER', 'hhsprogramming');
define('IDEONE_PASSWORD', 'hhsprog4ming');
define('RESULTS_DB', 'content/problem-results.json');

// enabled languages
// TODO: read from db
$langs = [
	10 => ["name" => "Java", "ext" => "java"],
	116 => ["name" => "Python 3", "ext" => "py"],
	44 => ["name" => "C++", "ext" => "cpp"]
];

/*******************
 * FUNCTIONS
 *******************/

// prints out grading result as HTML
function showResult($result, $description = "", $error = false) {
	$color = $error ? "red" : "green";
	echo "<div style=\"color: $color\">$result<br /><small>$description</small></div>";
}

// stores grading results in db
function storeResult($prob, $email, $lang, $correct, $err_msg = "", $time = NULL, $mem = NULL) {
	$results = json_decode(file_get_contents(RESULTS_DB), true);
	if (!isset($results[$prob])) $results[$prob] = [];

	$result = [
		"lang" => $lang,
		"correct" => $correct,
		"timestamp" => date("c")
	];

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

/******************
 * AJAX HANDLING
 ******************/

// grade submission if AJAX
if ($_SERVER["PHP_SELF"] === "/grader.php") {
	if (empty($_POST['user'])
			|| empty($_POST['problem'])
			|| empty($_POST['lang'])
			|| empty($_FILES['file'])) {
		die();
	}

	$user = $_POST['user'];						// submitter
	$prob = $_POST['problem'];					// problem name
	$lang = intval($_POST['lang']);				// source code language
	$uploaded = $_FILES['file']['tmp_name'];	// uploaded file path

	// Using JudgeLite or ideone?
	if (true) {
		// JudgeLite ;)
		// IMPORTANT: The results of the submission are NOT processed in this file! Look in judgelite_webhook.php for that!

		// Find extension based on language type
		$codeType = $langs[$lang]['ext'];
		if ($codeType == 'py') {
			$codeType = 'python';
		}

		// Setup curl request for submitting code to JudgeLite
		$judgeURL = 'http://judgelite.westus2.cloudapp.azure.com/api/submit';
		$judgeSecret = 'PRO_SECRET_L1GHTJUDG3';
		$contents = file_get_contents($uploaded);

		$runBonus = empty($_POST['run-bonus']) ? 'off' : $_POST['run-bonus'];

		$cFile = new CURLFile($uploaded);
		$cFile->setPostFilename($_FILES['file']['name']);

		$fields = array(
			'secret_key' => urlencode($judgeSecret),
			'problem_id' => $prob,
			'type' => $codeType,
			'code' => $cFile,
			//'code' => '@' . $uploaded . ';filename=' . $_FILES['file']['name'],
			'username' => $user,
			'run_bonus' => $runBonus
		);

		$ch = curl_init();
		curl_setopt($ch, CURLOPT_URL, $judgeURL);
		curl_setopt($ch, CURLOPT_POSTFIELDS, $fields);
		curl_setopt($ch, CURLOPT_TIMEOUT, 15);
		curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
		// die(var_dump($fields));

		// Send curl request
		$resultRaw = curl_exec($ch);
		curl_close($ch);

		// Make sure the curl request worked
		if ($resultRaw === false) {
			die('Internal error: Request failed (could not connect to JudgeLite).');
		}

		// Parse the result
		$result = json_decode($resultRaw, true);

		if (is_null($result)) {
			die('Internal error: Request failed (invalid JSON returned).');
		}

		if (array_key_exists('error', $result)) {
			showResult($result['error'], '', true);
		} else {
			// Return the JSON to let Javascript do the client-side stuff
			echo json_encode($result);
    }
	} else {
		// Ideone
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
			$result = $client->__soapCall('createSubmission', [
					'user' => IDEONE_USER,
					'pass' => IDEONE_PASSWORD,
					'sourceCode' => $contents,
					'language' => $lang,
					'input' => str_replace("\r\n", "\n", file_get_contents(TEST_DATA_DIR."/$prob.in")),
					'run' => true,
					'private' => true
			]);
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
				$result = $client->__soapCall('getSubmissionStatus', [
						'user' => IDEONE_USER,
						'pass' => IDEONE_PASSWORD,
						'link' => $link
				]);
			} catch (SoapFault $e) {
				die("SOAP fault: ".$e->getMessage());
			}
			if ($result['error'] !== 'OK') {			// Ideone API error
				die('Ideone error: '.$result['error']);
			}
			if ($result['status'] !== 0) {
				sleep(1);					// wait 1 second before trying again
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
			$result = $client->__soapCall('getSubmissionDetails', [
					'user' => IDEONE_USER,
					'pass' => IDEONE_PASSWORD,
					'link' => $link,
					'withSourceCode' => false,
					'withInput' => false,
					'withOutput' => true,
					'withStderr' => false,
					'withCmpinfo' => false
			]);
		} catch (SoapFault $e) {
			die("SOAP fault: ".$e->getMessage());
		}
		if ($result['error'] !== 'OK') {				// Ideone API error
			die('Ideone error: '.$result['error']);
		}
		if (trim($result['output']) === str_replace("\r\n", "\n", trim(file_get_contents(TEST_DATA_DIR."/$prob.out")))) {
			storeResult($prob, $user, $lang, true, '', $result['time'], $result['memory']);
			showResult("Result: Correct.",
					'Runtime: '.$result['time'].'s, Memory Usage: '
					.round($result['memory'] / 1000, 2).' KB');
			// echo '<span style="color: green">Result: Correct.<h4>Runtime: '.$result['time'].'s.</h4>'
			//		.'<h4>Memory Usage: '.round($result['memory'] / 1000, 2).' KB</h4></span>';
		} else {
			//DEBUG
			//$debugg = fopen("zzzz.txt", "w");
			//$debugv = trim($result['output']);
			//$strlnn = strlen($debugv);
			//for($i = 0;$i < $strlnn;$i++)
			//{
			//fwrite($debugg, ord($debugv[$i]));
			//}
			//fwrite($debugg, "\n\n");
			//$debugv = str_replace("\r\n", "\n", trim(file_get_contents(TEST_DATA_DIR."/$prob.out")));
			//$strlnn = strlen($debugv);
			//for($i = 0;$i < $strlnn;$i++)
			//{
			//fwrite($debugg, ord($debugv[$i]));
			//}
			//fclose($debugg);
			//DEBUG
			storeResult($prob, $user, $lang, false, 'Incorrect output.');
			showResult("Result: Incorrect output.", "", true);
		}
	}


	/******************
	 * FORM
	 ******************/

	// show submission form if included
} else {
	$prob = $_GET["problem"];
	if (empty($prob)) return;

	if (isset($_SESSION["user"]) && empty($competition) == empty($team)) {

		?>
			<h3>Submit your solution (<?= $prob ?>.<span id="ext">java</span>):</h3>
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
			<input type="hidden" name="user" id="input-user" value="<?= isset($competition) ? $team : $_SESSION["user"]["email"] ?>" />
			<input type="hidden" name="problem" id="input-problem" value="<?= $prob ?>" /><br />
			<label for="run-bonus" id="run-bonus-group"><input type="checkbox" name="run-bonus" id="run-bonus"> Run on bonus test cases?<br /></label>
			<small>Powered by <a href="https://github.com/Giantpizzahead/judgelite">JudgeLite</a></small>
			</form>
			<div id="result"></div>
			<?php
			if ($result = getResult($prob, isset($competition) ? $team : $_SESSION["user"]["email"])) {
				if (array_key_exists('score', $result)) {
					// JudgeLite
					?>
					<script>
					let currURLParams = new URLSearchParams(window.location.search);
					if (!currURLParams.has("job_id")) {
					  window.history.replaceState(null, null, `?problem=${currURLParams.get("problem")}&job_id=<?= $result["job_id"] ?>`);
					  document.querySelector("#submission-result-box .loader").style.display = "block";
					  showSubmitStatus();
					}
					</script>

				<?php } else {
					// Ideone
					?>
					<br />
					<h3>Previous submission results</h3>
					<?php

					$msg = $result['correct'] ? 'Correct' : $result['err_msg'];
				$stats = $result['correct'] ? "Runtime: {$result['time']}s, "
					.'Memory Usage: '.round($result['mem'] / 1000, 2).' KB' : "";

				showResult("Result: $msg", $stats, !$result['correct']);
				}
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
			// document.getElementById("result").innerHTML = "<br />Loading...";
			document.getElementById("result").innerHTML = "<br />Submitting...";

			var xhr = new XMLHttpRequest();

			xhr.onload = function () {
				// clears file upload field
				document.getElementById("file").value = "";
				
				if (this.response.includes("job_id")) {
					// JudgeLite success; show results
					let resp = JSON.parse(this.response);
					// Add job_id to URL parameters, keeping the current problem ID
					let currURLParams = new URLSearchParams(window.location.search);
					window.history.replaceState(null, null, `?problem=${currURLParams.get("problem")}&job_id=${resp["job_id"]}`);
					document.querySelector("#submission-result-box .loader").style.display = "block";
					showSubmitStatus();
					// Smooth scroll to top of page
					window.scrollTo({ top: 0, behavior: "smooth" });
					document.getElementById("result").innerHTML = "<br />Submitted!";
				} else {
					// Either not JudgeLite, or submission failed
					document.getElementById("result").innerHTML = "<br />" + this.response;
				}
			};

			xhr.onerror = function (e) {
				// clears file upload field
				document.getElementById("file").value = "";
				document.getElementById("result").innerHTML = "<br />An error occurred. Please try submitting again.";
			}

			xhr.open("POST", "/grader.php");

			let submitFormData = new FormData(this);
			if (!submitFormData.has("run-bonus")) submitFormData.append("run-bonus", "off");
			xhr.send(submitFormData);
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
