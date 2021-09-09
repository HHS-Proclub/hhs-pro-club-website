<?php
	// handle registration if AJAX
	if ($_SERVER['PHP_SELF'] === '/register.php') {
		require 'wp-load.php';
		
		if (empty($_POST['first'])
				|| empty($_POST['last'])
				|| empty($_POST['email'])
				|| empty($_POST['username'])
				|| empty($_POST['password'])) {
			die();
		}
		
		$username = sanitize_user($_POST['username']);
		$password = trim($_POST['password']);
		$email = apply_filters('user_registration_email', $_POST['email']);

		if (username_exists($username)) {
			die('1');
		}
		if (email_exists($email)) {
			die('2');
		}
		
		do_action('register_post', $username, $email, new WP_Error());
		
		$userdata = array('user_login' => $username,
				'user_pass' => $password,
				'user_email' => $email,
				'first_name' => $_POST['first'],
				'last_name' => $_POST['last']);
		
		if (is_wp_error(wp_insert_user($userdata))) {
			$userdata['ID'] = get_user_by('login', $username)->ID;
			wp_update_user($userdata);
		}
		
		if ($db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)) {
			$first = $db->real_escape_string($_POST['first']);
			$last = $db->real_escape_string($_POST['last']);
			$email = $db->real_escape_string($email);
			
			$db->query("REPLACE INTO mailing_list VALUES "
					."('$first', '$last', '$email');");
		}
		exit('0');
		
	// show registration form if included
	} else {
?>
<style>
#registration-form label {
	padding-right: 20px;
	text-align: right;
}

#first, #last {
	width: 10em;
}

#email {
    width: 20em;
}

#username, #password, #password-check {
	width: 15em;
}
</style>
<script type="text/javascript">
jQuery(function ($) {
	$("#registration-form").submit(function (e) {
		e.preventDefault();
		if ($("#password").val() !== $("#password-check").val()) {
			alert("Passwords do not match.");
			return false;
		}
		
		$.post("/register.php", $(this).serialize(), function (data) {
			switch (parseInt(data, 10)) {
			case 0:
				window.location.href = "/thank-you/";
				break;
			case 1:
				alert("Username has already been taken.");
				break;
			case 2:
				alert("An account for this email already exists.");
				break;
			default:
				alert("Error: missing data");
				break;
			}
		});
	});
});
</script>

<form id="registration-form">
<table>
<tbody>
	<tr>
		<td><label for="first">Name:</label></td>
		<td>
			<input type="text" name="first" id="first" placeholder="First" required="" />
			<input type="text" name="last" id="last" placeholder="Last" required="" />
		</td>
	</tr>
	<tr>
		<td><label for="email">Email:</label></td>
		<td><input type="email" name="email" id="email" required="" /></td>
	</tr>
	<tr>
		<td><label for="username">Username:</label></td>
		<td><input type="text" name="username" id="username" required="" /></td>
	</tr>
	<tr>
		<td><label for="password">Password:</label></td>
		<td><input type="password" name="password" id="password" required="" /></td>
	</tr>
	<tr>
		<td><label for="password-check">Retype Password:</label></td>
		<td><input type="password" id="password-check" required="" /></td>
	</tr>
	<tr>
		<td></td><td><input type="submit" value="Register"/></td>
	</tr>
</tbody>
</table>
</form>
<?php } ?>