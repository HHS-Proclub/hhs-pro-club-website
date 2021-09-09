<?php

if (!empty($_POST['first'])
		&& !empty($_POST['last'])
		&& !empty($_POST['email'])) {
			
	include_once $_SERVER['DOCUMENT_ROOT'].'/wp-config.php';
	
	$db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)
			or die('Error connecting to the database');
	
	$first = $db->real_escape_string($_POST['first']);
	$last = $db->real_escape_string($_POST['last']);
	$email = $db->real_escape_string($_POST['email']);
	
	$result = $db->query('REPLACE INTO mailing_list VALUES '
						."('$first', '$last', '$email');")
			or die('Email already exists');
	
	exit("Thanks for your interest in our club, $first! We'll let you know "
		."when our first meeting will be");
}

?>
<!DOCTYPE html>
<html>
<head>
	<link href='http://fonts.googleapis.com/css?family=Inconsolata:400,700' rel='stylesheet' type='text/css'>
	<link rel="shortcut icon" href="/favicon.ico">
	<meta name="viewport" content="width=device-width">
	<style>
		@font-face {
			font-family: 'Circuit';
			src: url('/fonts/circuit.eot');
			src: local('Circuit'), url('/fonts/circuit.woff') format('woff'), url('/fonts/circuit.ttf') format('truetype'), url('/fonts/circuit.svg') format('svg');
			font-weight: normal;
			font-style: normal;
		}

		body {
			background: url(/roundup_images/green_programming_background2.jpg) no-repeat center center fixed;
			-moz-background-size: cover;
			background-size: cover;
			font-family: Inconsolata, sans-serif;
		}

		#logo {
			width: 454px;
			margin: 0 auto;
			display: block;
		}

		#about-content {
			width: 45%;
			//background-color: #E01B5D, 0.5;
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			margin-left: 5%;
			margin-top: 25px;
			font-size: 24px;
			color: #fff;

			background: rgba(168,255,189,0.2);
			padding: 10px 20px;
		}

		#about-content h1 {
			font-family: Circuit, sans-serif;
			font-size: 48px;
			font-weight: normal;
			margin-top: 0;
		}

		#email-signup {
			width: 450px;
			height: 400px;
			margin-left: -225px;
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			padding-left: 40px;
			padding-top: 10px;
			color: white;
			font-size: 18px;
			font-family: Circuit, sans-serif;
			position: fixed;
			left: 75%;
			top: 200px;
		}

		#email-signup h1 {
			font-size: 36px;
		}
		
		#email-signup form {
			width: 390px;
			overflow: auto;
		}

		#email-signup input {
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			line-height: 1em;
			outline: none;
		}

		#email-signup input[type=text], #email-signup input[type=email] {
			color: white;
			font-size: 18px;
			padding: 13px 5px;
			background: #7cc576;
			border: 3px solid #005e20;
			-webkit-border-radius: 10px;
			-moz-border-radius: 10px;
			border-radius: 10px;
			
		}

		#email-signup input[type=text] {
			width: 182px;
			margin-left: 26px;
		}
		
		#email-signup input[type=text]:first-child {
			margin-left: 0;
		}

		#email-signup input[type=email] {
			width: 390px;
		}

		#email-signup ::-webkit-input-placeholder { color: white; font-family: Circuit, sans-serif; line-height: 1em; }
		#email-signup ::-moz-placeholder { color: white; font-family: Circuit, sans-serif; line-height: 1em; }
		#email-signup :-ms-input-placeholder { color: white; font-family: Circuit, sans-serif; line-height: 1em; }
		#email-signup input:-moz-placeholder { color: white; font-family: Circuit, sans-serif; line-height: 1em; }

		#email-signup input[type=submit] {
			float: right;
			color: white;
			font-family: Circuit, sans-serif;
			font-size: 18px;
			padding: 13px 35px;
			background: #005e20;
			border: 3px solid #005e20;
			-webkit-border-radius: 10px;
			-moz-border-radius: 10px;
			border-radius: 10px;
			cursor: pointer;
		}
		
		#email-signup input[type=submit]:hover {
			background: #00802c;
			border-color: #00802c;
		}
		
		@media (max-width: 899px) {
			#about-content {
				width: 90%;
			}
			#email-signup {
				margin: 0 auto;
				position: static;
			}
		}
		
		::-webkit-scrollbar {
    width: 12px;
}
 
/* Track */
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
    -webkit-border-radius: 10px;
    border-radius: 10px;
}
 
/* Handle */
::-webkit-scrollbar-thumb {
    -webkit-border-radius: 10px;
    border-radius: 10px;
    background: rgba(16,181,2,0.8); 
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.5); 
}
::-webkit-scrollbar-thumb:window-inactive {
	background: rgba(16,181,2,0.4); 
}
		
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="//malsup.github.io/min/jquery.form.min.js"></script>
	<script>
		$(function () {
			$("#mailing-list-form").ajaxForm({
				type: "POST",
				success: function (data) {
					alert(data);
				},
				error: function () {
					alert("Could not connect to the server.");
				}
			});
		});
	</script>
</head>
<body>
	<img id="logo" src="/roundup_images/new_logo.png" />
	
	<div id="email-signup">
		<h1>join our mailing list</h1>
		<form id="mailing-list-form">
			<input name="first" type="text" placeholder="first name" required /><input name="last" type="text" placeholder="last name" required />
			<br /><br />
			<input name="email" type="email" placeholder="email" required />
			<br /><br />
			<input type="submit" value="submit" />
		</form>
		<br />
		be the first to know about our first meeting and when our official
		website is up and running
	</div>
	
	<div id="about-content">
		<h1>Who are we?</h1>

		We program stuff.<br /><br />

		<img src="/roundup_images/harker1.jpeg" width="400px" height="300px" />

		<br /><br />

		We compete in stuff.<br /><br />

		<img src="/roundup_images/harker2.jpeg" width="400px" height="300px" /><br><br>

		We have fun socials.<br /><br />
		
		HHS Programming Club is a club for anyone with an interest in
		programming. From the beginner programmer to the coding enthusiast, we
		encourage everyone to join, learn from others, and share their own
		experiences.  Our biweekly challenge problems will test your skills and
		prepare you for competitions with fellow coders at other schools. But
		for those not interested in competing or for those who would like more
		preparation, we will offer after-school tutorials where you can learn
		various skills in programming or get help with a program you are trying
		to make. So if you have even the slightest interest in programming, or
		would like to know about programming, join the club now!
	</div>

<body>
</html>