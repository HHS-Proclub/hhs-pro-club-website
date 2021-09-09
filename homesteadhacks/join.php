<?php
// handle registration
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	header("Content-Type: application/json");

	// get users
	$users = json_decode(file_get_contents("hackathonContent/users.json"), true);
	$new_user = $_POST;

	// check for duplicate emails and usernames
	foreach ($users as $username => $userdata) {

		if ($new_user["email"] === $userdata["email"]) {
			die('{"status": "email"}');
		} elseif ($new_user["username"] === $username) {
			die('{"status": "username"}');
		}
	}

	// add new user
	$username = $new_user["username"];
	unset($new_user["username"]);
	$new_user["password"] = sha1($new_user["password"]);
    $new_user["officer"] = false;
    $new_user["username"] = $username;
	$users[$username] = $new_user;
	// write useres to file
	file_put_contents("hackathonContent/users.json", json_encode($users, JSON_PRETTY_PRINT));

	// authenticate user
	session_start();
	$_SESSION["user"] = array_merge(array("username" => $username),
									$users[$username]);

	exit('{"status": "success"}');
}

$pagetitle = "Join";
$pagedescription = "Create your team account";
include "hackathonIncludes/header.php";

?>

<link rel="stylesheet" href="/css/join.css">

<center>
<form id="join-form" method="post">
	<table>
		<tr><td>Username:</td><td>
			<input type="text" name="username" placeholder="Team Name" required />
		</td></tr>
        <tr><td>School:</td><td>
            <input type="text" name="school" placeholder="School(s)" required />
        </td></tr>
		<tr><td>Contact Email:</td><td>
			<input type="email" name="email" placeholder="Email" required />
		</td></tr>
		<tr><td>Password:</td><td>
			<input type="password" name="password" placeholder="Password" required />
		</td></tr>
		<tr><td>Retype password:</td><td>
			<input type="password" id="password-check" placeholder="Retype Password" required />
		</td></tr>
	</table>
	<br />
	<input type="submit" class="btn" value="Join" />
</form>
</center>

<script src="/hackathonJS/join.js"></script>
