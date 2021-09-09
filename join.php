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
	file_put_contents("content/users.bak.json", json_encode($users, JSON_PRETTY_PRINT));


	// email
	$to = $new_user['email'];
	$subject = "Welcome to Programming Club!";
	$message = "
Hey " . $new_user['first'] . ",\n
Thanks for signing up! For future reference, your username is " . $username . ".\n
Please also fill out the Member Survey at http://hhsprogramming.com/survey/ so we can get a better idea of what you're interested in.\n
We look forward to seeing you around this year! Feel free to reply to this email if you have any questions, we'd love to answer them.\n
- HHS Programming";
	$headers = 'From: HHS Programming <hello@hhsprogramming.com>';
	mail($to, $subject, $message, $headers);

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
		<tr><td>Programming Level:</td><td>
			<select name="level" required>
				<option disabled selected value="">Choose a level</option>
				<option value="1">Intro or below</option>
				<option value="2">AP or above</option>
			</select>
		</td></tr>
		<tr><td>Email:</td><td>
			<input type="email" id="email" name="email" placeholder="Email" required />
		</td></tr>
		<tr><td>ASB?</td><td>
			<input type="checkbox" name="asb" />
		</td></tr>
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
	<input type="submit" class="btn" value="Join" />
</form>
</center>

<script src="/js/join.js"></script>

<?php include 'includes/footer.php' ?>
