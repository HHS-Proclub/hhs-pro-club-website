<?php
	// handle profile updates if AJAX
	if ($_SERVER['PHP_SELF'] === '/profile.php') {
		require 'wp-load.php';
		
		if (empty($_POST['username'])
				|| empty($_POST['old_password'])
				|| empty($_POST['new_password'])) {
			die();
		}
		
		$user = get_user_by('login', $_POST['username'])
				or die('1');
		if (!wp_check_password(trim($_POST['old_password']),
				$user->data->user_pass, $user->ID)) {
			die('2');
		}
		
		wp_set_password($_POST['new_password'], $user->ID);
		exit('0');
		
	// show profile
	} else {
		$current_user = wp_get_current_user();
		$name = $current_user->first_name.' '.$current_user->last_name;
		$email = $current_user->user_email;
		$username = $current_user->user_login;
?>
<style>
table.profile th {
	padding-right: 10px;
	font-weight: normal;
	text-align: left;
}

table.info th {
	font-weight: bold;
}
</style>
<script>
jQuery(function ($) {
    $("#change-password").submit(function (e) {
		e.preventDefault();
		if ($("#password").val() !== $("#password-check").val()) {
			alert("Passwords do not match.");
			return false;
		}
		
		var form = this;
		$.post("/profile.php", $(form).serialize(), function (data) {
			switch (parseInt(data, 10)) {
			case 0:
				form.reset();
				alert("Password changed. You have been logged out. "
						+ "Please log in again.");
				window.location.href = "/";
				break;
			case 1:
				alert("Error: user does not exist");
				break;
			case 2:
				alert("Incorrect password entered");
				break;
			default:
				alert("Error: missing data");
				break;
			}
		});
	});
});
</script>

<h3>Account Information</h3>
<table class="profile info">
	<tr><th>Name:</th><td><?php echo $name; ?></td></tr>
	<tr><th>Email:</th><td><?php echo $email; ?></td></tr>
</table>
<br />
<h3>Change your password</h3>
<form id="change-password">
	<table class="profile">
		<tr><th>Current password:</th><td><input type="password" name="old_password" required="" /></td></tr>
		<tr><th>New password:</th><td><input type="password" name="new_password" id="password" required="" /></td></tr>
		<tr><th>Confirm new password:</th><td><input type="password" id="password-check" required="" /></td></tr>
		<tr><td colspan="2"><input type="submit" value="Change password" /></td></tr>
	</table>
	<input type="hidden" name="username" value="<?php echo $username; ?>" />
</form>
<?php } ?>