<?php

define("RESULTS_DB", "content/problem-results.json");

// Only process valid metadata requests
if (!array_key_exists("metadata", $_POST)) {
	die();
}

// Open database
$results = json_decode(file_get_contents(RESULTS_DB), true);
if (!isset($results[$prob])) $results[$prob] = [];

// Add metadata if not done already
if (!array_key_exists("metadata", $results)) {
	$results["metadata"] = [];
}
// Add problem if not done already
if (!array_key_exists($_POST["problem_id"], $results["metadata"])) {
	$results["metadata"][$_POST["problem_id"]] = [];
}
// Add user if not done already
if (!array_key_exists($_POST["username"], $results["metadata"][$_POST["problem_id"]])) {
	$results["metadata"][$_POST["problem_id"]][$_POST["username"]] = [];
}

if ($_POST["metadata"] == "hint-used") {
	// Only track hint usage if user has not gotten the problem correct
	if (!array_key_exists($_POST["username"], $results[$_POST["problem_id"]]) ||
	  	!$results[$_POST["problem_id"]][$_POST["username"]]["correct"]) {
		$results["metadata"][$_POST["problem_id"]][$_POST["username"]]["hintUsed"] = true;
	}
}

// Update database
$tempfile = tempnam(sys_get_temp_dir(), "problem-results.json");
file_put_contents($tempfile, json_encode($results, JSON_PRETTY_PRINT));
rename($tempfile, RESULTS_DB);
?>
