<?php 

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

$members_data = file_get_contents('../users.json');
$members = json_decode($members_data, true);

$emails = [];

foreach ($members as $member) {
	$emails[] = $member["email"];
}

//$emails = array_merge($emails, explode(",", file_get_contents('roundup.txt')));
$emails = array_unique($emails);
$emails = array_filter($emails);

$list = implode(", ", $emails);

echo $list;

?>
