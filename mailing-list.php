<?php 

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

$members_data = file_get_contents('content/users.json');
$members = json_decode($members_data, true);
    
$emails = [];
    
foreach ($members as $member) {
    $emails[] = $member["email"];
}

$emails = array_merge(explode(",", file_get_contents('roundup2021/emails.txt')), $emails);
$emails = array_unique($emails);
$emails = array_filter($emails);

if (($key = array_search('f@f', $emails)) !== false) {
    unset($emails[$key]);
}

$list = implode(", ", $emails);

echo htmlspecialchars($list);

?>
