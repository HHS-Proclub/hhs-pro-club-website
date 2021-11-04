<?php

// get users
$users = json_decode(file_get_contents("content/users.json"), true);

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$token = $_POST["reset-token"];
} else {
	$token = $_GET["reset-token"];
}

// find which user this is for
foreach ($users as $username => $data) {
	$targetHash = sha1($username . "-CONNECT-" . $data["password"]);
	if ($token === $targetHash) {
		// this is the user
		$targetUser = $username;
		break;
	}
}
if (!isset($targetUser)) {
	header("Location: /");
	exit;
}

// if got to this point, the token is valid; let the user reset their password
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$password1 = $_POST["reset-password1"];
	$password2 = $_POST["reset-password2"];

	// password cannot be empty
	if ($password1 === "" || !isset($_POST["reset-password1"])) {
		header("Content-Type: application/json");
		die('{"status": "notempty"}');
	}
	// make sure passwords match
	if ($password1 !== $password2) {
		header("Content-Type: application/json");
		die('{"status": "donotmatch"}');
	}

	// set the new password
	$users[$username]["password"] = sha1($password1);

	// save users to file
	file_put_contents("content/users.json", json_encode($users, JSON_PRETTY_PRINT));
	file_put_contents("content/users.bak.json", json_encode($users, JSON_PRETTY_PRINT));

	exit('{"status": "success"}');
}

$pagetitle = 'Reset Password';
$pagedescription = 'Just don\'t use "superman"';

include('includes/header.php');

?>

<center>
<form id="reset-form" method="post">
	<div class="row login-input">
		<label><i class="fa fa-lock fa-fw"></i></label>
		<input type="password" id="reset-password1" name="reset-password1" placeholder="New Password" required>
	</div>
	<div class="row login-input">
		<label><i class="fa fa-lock fa-fw"></i></label>
		<input type="password" id="reset-password2" name="reset-password2" placeholder="Confirm Password" required>
	</div>
	<input type="hidden" id="reset-token" name="reset-token">
	<input type="submit" class="one btn" value="Reset Password">
</form>
</center>

<script src="/js/resetpw.js"></script>

<?php include('includes/footer.php'); ?>
