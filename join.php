<?php
// handle registration
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	header("Content-Type: application/json");

	// check captcha
	$curl = curl_init();
	curl_setopt($curl, CURLOPT_POST, 1);
	curl_setopt($curl, CURLOPT_POSTFIELDS, [
		"secret" => "6LeL1ZAqAAAAAMjXaJT0nqSrJ_qn7xSqsFrO1JBg",
		"response" => $_POST["g-recaptcha-response"]
	]);
	curl_setopt($curl, CURLOPT_URL, "https://www.google.com/recaptcha/api/siteverify");
	curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
	$result = json_decode(curl_exec($curl), true);
	curl_close($curl);
	if (!$result["success"]) die('{"status": "captcha"}');

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
	$username = htmlspecialchars($new_user["username"]);
	unset($new_user["username"]);
	unset($new_user["g-recaptcha-response"]);
	$new_user["username"] = htmlspecialchars($new_user["username"]);
	$new_user["first"] = htmlspecialchars($new_user["first"]);
	$new_user["last"] = htmlspecialchars($new_user["last"]);
	$new_user["email"] = htmlspecialchars($new_user["email"]);
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
We look forward to seeing you around this year! Feel free to reply to this email if you have any questions, we would love to answer them.\n
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
		<!-- to stop russian haxors -->
		<tr><td>Captcha:</td><td>
			<div class="g-recaptcha" data-sitekey="6LeL1ZAqAAAAANiwZLVAJ2-O0zT6oKL1ruS6vMvh"></div>
		</td></tr>
	</table>
	<br />
	<input type="submit" class="btn" value="Join" />
</form>
</center>

<script src="/js/join.js"></script>
<script src="https://www.google.com/recaptcha/api.js" async defer></script>

<?php include 'includes/footer.php' ?>
