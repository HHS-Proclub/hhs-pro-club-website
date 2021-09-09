<?php

// handle registration
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	header("Content-Type: application/json");

	// get users
	$users = json_decode(file_get_contents("content/users.json"), true);
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
	if (isset($new_user["asb"])) $new_user["asb"] = true;
	$users[$username] = $new_user;
	
	// write useres to file
	file_put_contents("content/users.json", json_encode($users, JSON_PRETTY_PRINT));

	// authenticate user
	session_start();
	$_SESSION["user"] = array_merge(array("username" => $username),
									$users[$username]);

	exit('{"status": "success"}');
}

$pagetitle = "Join";
$pagedescription = "Become a member";
include "includes/header.php";

?>

<link rel="stylesheet" href="/css/join.css">

<center>
<form id="join-form" method="post">
	<table>
		<tr><td>Name:</td><td>
			<input type="text" name="first" placeholder="First" required />
			<input type="text" name="last" placeholder="Last" required />
		</td></tr>
		<tr><td>Grade:</td><td>
			<select name="grade" required>
				<option disabled selected value="">Choose a grade</option>
				<option value="9">9</option>
				<option value="10">10</option>
				<option value="11">11</option>
				<option value="12">12</option>
			</select>
		</td></tr>
		<tr><td>Email:</td><td>
			<input type="email" name="email" placeholder="Email" required />
		</td></tr>
		<tr><td>ASB card?</td><td>
			<input type="checkbox" name="asb" />
		</td></tr>
		<tr><td colspan="2"><br /><td></tr>
		<tr><td>Username:</td><td>
			<input type="text" name="username" placeholder="Username" required />
		</td></tr>
		<tr><td>Password:</td><td>
			<input type="password" name="password" placeholder="Password" required />
		</td></tr>
		<tr><td>Retype password:</td><td>
			<input type="password" id="password-check" placeholder="Retype Password" required />
		</td></tr>
	</table>
	<br />
	<input type="submit" class="btn" />
</form>
</center>

<script src="/js/join.js"></script>

<?php include 'includes/footer.php' ?>
