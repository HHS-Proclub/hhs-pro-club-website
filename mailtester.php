<?php
$firstname = "Kyle";
$username = "PIZZAGUY";

$to = "kfu697@student.fuhsd.org";
$subject = "Welcome to Programming Club!";
$message = "
Hey " . $firstname . ",\n
Thanks for signing up! For future reference, your username is " . $username . ".\n
Please also fill out the Member Survey at http://hhsprogramming.com/survey/ so we can get a better idea of what you'
We look forward to seeing you around this year! Feel free to reply to this email if you have any questions, we'd lov
- HHS Programming";
$headers = 'From: HHS Programming <officers@hhsprogramming.com>';

error_reporting(-1);
ini_set('display_errors', 'On');
set_error_handler("var_dump");

$success = mail($to, $subject, $message, $headers);
print($success);
//phpinfo();
?>
