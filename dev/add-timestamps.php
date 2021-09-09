<?php

$langs = array(
	10 => array("name" => "Java", "ext" => "java"),
	116 => array("name" => "Python 3", "ext" => "py"),
	44 => array("name" => "C++", "ext" => "cpp")
);

$results = json_decode(file_get_contents("../problem-results.json"), true);
$problems = scandir("../solutions/");

for ($i = 2; $i < count($problems); $i++) {
	$problem = $problems[$i];
	echo "$problem<br />";
	
	if (!array_key_exists($problem, $results)) continue;
	
	$files = scandir("../solutions/$problem");
	for ($j = 2; $j < count($files); $j++) {
		$file = $files[$j];
		$email = substr($file, 0, strrpos($file, "."));
		$timestamp = date("c", filemtime("../solutions/$problem/$file"));
		
		$results[$problem][$email]["timestamp"] = $timestamp;
		echo "$email - $timestamp<br />";
	}
	
	echo "<br />";
}

file_put_contents("../problem-results.new.json", json_encode($results, JSON_PRETTY_PRINT));

?>
