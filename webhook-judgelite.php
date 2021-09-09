<?php

define("RESULTS_DB", "content/problem-results.json");
define("JUDGELITE_SECRET_KEY", "PRO_SECRET_L1GHTJUDG3");

// Make the sure the POST actually came from JudgeLite
if (!array_key_exists("secret_key", $_POST) || $_POST["secret_key"] != JUDGELITE_SECRET_KEY) {
	die();
}

// Put result into database
$results = json_decode(file_get_contents(RESULTS_DB), true);
if (!isset($results[$prob])) $results[$prob] = [];

$score = intval($_POST["score"]);

$result = [
  "lang" => 0,
	"correct" => $_POST["verdict"] == "AC" || $_POST["verdict"] == "AC*",
	"score" => $score,
	"job_id" => $_POST["job_id"],
	"timestamp" => date("c")
];

$results[$_POST["problem_id"]][$_POST["username"]] = $result;

// Update database
$tempfile = tempnam(sys_get_temp_dir(), "problem-results.json");
file_put_contents($tempfile, json_encode($results, JSON_PRETTY_PRINT));
rename($tempfile, RESULTS_DB);
?>
