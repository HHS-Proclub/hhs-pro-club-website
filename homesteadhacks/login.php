<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	header("Content-Type: application/json");

	$username = $_POST["username"];
	$password = sha1($_POST["password"]);

	// get users
	$users = json_decode(file_get_contents("hackathonContent/users.json"), true);

	// authenticate user
	if (isset($users[$username]) && $users[$username]["password"] === $password) {
		session_start();
		$temp = array_merge(array("email" => $username),
		                                $users[$username]);
		                                
		$temp["username"]  = $username;
		$_SESSION["user"]  = $temp;
		exit('{"status": "success"}');
	}
	// header("Location: /");
	
	die('{"status": "invalid"}');
}

$pagetitle = 'Login';
$pagedescription = 'Access your account';

include('hackathonIncludes/header.php');

?>

<center>
<form id="login-form" method="post">
	<div class="row login-input">
		<label><i class="fa fa-user fa-fw"></i></label>
		<input type="text" id="username" name="username" placeholder="Username">
	</div>
	<div class="row login-input">
		<label><i class="fa fa-lock fa-fw"></i></label>
		<input type="password" id="password" name="password" placeholder="Password">
	</div>
	<input type="submit" class="one btn" value="Login">
</form>
</center>

<script src="hackathonJS/login.js"></script>

