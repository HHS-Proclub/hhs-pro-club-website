<?php

define('TEST_DATA_DIR', 'test-data');
define('SOLUTIONS_DIR', 'solutions');
define('IDEONE_USER', 'hhsprogramming');
define('IDEONE_PASSWORD', 'hhsprog4ming');
define('RESULTS_DB', 'content/problem-results.new.json');

$results = json_decode(file_get_contents(RESULTS_DB), true);

// enabled languages
// TODO: read from db
$langs = array(
	"java" => 10,
	"py" => 116,
	"cpp" => 44
);

// prints out grading result as HTML
function showResult($result, $description = "", $error = false) {
	
}

// stores grading results in db
function storeResult($prob, $email, $lang, $correct, $err_msg = "", $time = NULL, $mem = NULL) {
	global $results;
	
	if (!isset($results[$prob])) $results[$prob] = array();

	$result = array("lang" => $lang,
	                "correct" => $correct,
	                "timestamp" => date("c"));
	if (!empty($err_msg)) $result["err_msg"] = $err_msg;
	if (!is_null($time)) $result["time"] = $time;
	if (!is_null($mem)) $result["mem"] = $mem;
	
	$results[$prob][$email] = $result;
	print_r($result);
	echo "<br />";
flush();
	file_put_contents(RESULTS_DB, json_encode($results, JSON_PRETTY_PRINT));
}

$problems = scandir("solutions/");

for ($i = 2; $i < count($problems); $i++) {
	$prob = $problems[$i];
	echo "$prob<br />";
flush();
	
	$files = scandir("solutions/$prob");
	for ($j = 2; $j < count($files); $j++) {
		$uploaded = $files[$j];
		$user = substr($uploaded, 0, strrpos($uploaded, "."));
		$lang = $langs[substr($uploaded, strrpos($uploaded, ".") + 1)];

		if ($results[$prob] && $results[$prob][$user]) continue;

		$contents = file_get_contents("solutions/$prob/$uploaded");
		echo " $uploaded<br />";
flush();

		// check that test data exists for problem
		if (!file_exists(TEST_DATA_DIR."/$prob.in")
				|| !file_exists(TEST_DATA_DIR."/$prob.out")
				|| !is_dir(SOLUTIONS_DIR)) {
			echo ("Missing test data for problem $prob.");
flush();
		}

		// replace class name for Java
		if ($lang === 10) {
			$contents = str_replace("public class", "class", $contents, $count);
			if ($count === 0) {
				storeResult($prob, $user, $lang, false, 'Class name is incorrect.');
				showResult("Class name is incorrect.", "", true);
			}
		}

		// ideone API (http://ideone.com/files/ideone-api.pdf)
		try {
			$client = new SoapClient('http://ideone.com/api/1/service.wsdl');
		} catch (Exception $e) {
			echo ("SOAP fault: ".$e->getMessage());
flush();
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
			echo ("SOAP fault: ".$e->getMessage());
flush();
		}
		if ($result['error'] !== 'OK') {				// Ideone API error
			echo ('Ideone error: '.$result['error']);
flush();
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
				echo ("SOAP fault: ".$e->getMessage());
flush();
			}
			if ($result['error'] !== 'OK') {			// Ideone API error
				echo ('Ideone error: '.$result['error']);
flush();
			}
			if ($result['status'] !== 0) {	// wait 3 seconds before trying
				sleep(3);					// trying again
			}
		} while ($result['status'] !== 0);	// not finished running

		// handle runtime/compilation errors
		if ($result['result'] === 11) {
			storeResult($prob, $user, $lang, false, 'Compilation error.');
			showResult("Result: Compilation error.", "", true);
			continue;
		} elseif ($result['result'] === 12) {
			storeResult($prob, $user, $lang, false, 'Runtime error.');
			showResult("Result: Runtime error.", "", true);
			continue;
		} elseif ($result['result'] === 13) {
			storeResult($prob, $user, $lang, false, 'Time limit (5s) exceeded.');
			showResult("Result: Time limit (5s) exceeded.", "", true);
			continue;
		} elseif ($result['result'] === 19) {
			storeResult($prob, $user, $lang, false, 'Illegal system call');
			showResult("Result: Illegal system call", "", true);
			continue;
		} elseif ($result['result'] === 20) {
			showResult("Ideone internal error. Please try again later.", "", true);
			continue;
		} elseif ($result['result'] !== 15) {	// status is not success
			storeResult($prob, $user, $lang, false, 'Unknown error.');
			showResult("Result: Unknown error.", "", true);
			continue;
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
			echo ("SOAP fault: ".$e->getMessage());
flush();
		}
		if ($result['error'] !== 'OK') {				// Ideone API error
			echo ('Ideone error: '.$result['error']);
flush();
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
	}
	
	echo "<br />";
flush();
}

?>
