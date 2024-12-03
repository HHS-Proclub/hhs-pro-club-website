<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	header("Content-Type: application/json");

	// check captcha
	$curl = curl_init();
  curl_setopt($curl, CURLOPT_POST, 1);
  curl_setopt($curl, CURLOPT_POSTFIELDS, [
    "secret" => "6LdS1ZAqAAAAANqYh0eLgJ7AkHMV8azT-JgFiqZY",
    "response" => $_POST["g-recaptcha-response"]
  ]);
	curl_setopt($curl, CURLOPT_URL, "https://www.google.com/recaptcha/api/siteverify");
  curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
  $result = json_decode(curl_exec($curl), true);
  curl_close($curl);
	if (!$result["success"]) die('{"status": "captcha"}');

	$username = $_POST["forgot-username"];
	$email = $_POST["forgot-email"];

	// get users
	$users = json_decode(file_get_contents("content/users.json"), true);

	// check if user exists
	if (isset($users[$username]) && $users[$username]["email"] === $email) {
		// send the email
		$to = $email;
		$subject = "Account Password Reset";
		$message = "
Hey " . $users[$username]["first"] . ",\n
You recently requested to reset your password. Please follow the below link to reset your password:\n" .
"https://hhsprogramming.com/resetpw?reset-token=" . sha1($username . "-CONNECT-" . $users[$username]["password"]) .
"\n- HHS Programming";
    $headers = "From: HHS Programming <noreply@hhsprogramming.com>";
		mail($to, $subject, $message, $headers);

		exit('{"status": "success"}');
	}
	// header("Location: /");
	
	die('{"status": "invalid"}');
}

$pagetitle = 'Forgot Password';
$pagedescription = 'Reset your password';

include('includes/header.php');

?>

<center>
<form id="forgot-form" method="post">
	<div class="row login-input">
		<label><i class="fa fa-user fa-fw"></i></label>
		<input type="text" id="forgot-username" name="forgot-username" placeholder="Username">
	</div>
	<div class="row login-input">
		<label><i class="fa fa-envelope fa-fw"></i></label>
		<input type="text" id="forgot-email" name="forgot-email" placeholder="Email">
	</div>
	<div class="row login-input">
		<div class="g-recaptcha" data-sitekey="6LdS1ZAqAAAAAMjhLu2j98I3I5Xop_Dx1ZVc5GYY"></div>
	</div>
	<input type="submit" class="one btn" value="Send Reset Link">
</form>
</center>

<script src="/js/forgotpw.js"></script>
<script src="https://www.google.com/recaptcha/api.js" async defer></script>

<?php include('includes/footer.php'); ?>
