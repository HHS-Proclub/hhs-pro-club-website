<?php


/*if (!isset($_GET["dev"])) {
	header("Location: /roundup2016/");
	die();
}*/


session_start();

?>
<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="shortcut icon" type="image/png" href="img/logo-green.png" />
    <link rel="apple-touch-icon" type="image/png" href="img/logo-green.png" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700|Ubuntu:400,700|Miriam+Libre:400,700' rel='stylesheet' type='text/css'>
	<link href="https://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="/css/style.css">
<?php if (/*false*/isset($_GET["dev"])) { ?>
	<script>
		onload = function () {
			var links = document.getElementsByTagName("a");

			for (var i = 0; i < links.length; i++) {
				var link = links[i];
				if (/^\/.*$/.test(link.getAttribute("href"))) link.href += "?dev";
			}
		};
	</script>
<?php } ?>

	<title>HHS Programming<?php if (isset($pagetitle)) echo ' - '.$pagetitle;  ?></title>

</head>

<body>

<div class="photo"></div>
<div class="overlay"></div>

<!-- <header>
	<div class="container">

			<a href="/" class="logo">
				<img src="/img/logo-white.png"> -->
				<!-- <img src="/img/troll face.png"> -->
			<!-- </a>

		<div class="vcenter">
			<ul class="nav"> -->

			<?php
			// $links_data = file_get_contents('content/links.json');
			// $links = json_decode($links_data, true);

			// if (isset($_SESSION["user"])) {
			// 	unset($links["Login"]);
			// 	unset($links["Join"]);
			// 	$links["Logout"] = "/logout/";
			// }
			// if (isset($_SESSION["user"]["officer"])) {
			// 	$links["Admin"] = "/admin/";
			// }

			// foreach ($links as $name=>$link) {
			// 	echo '<li' . ($link==substr($_SERVER['PHP_SELF'],0,-4).'/'||$_SERVER['PHP_SELF']=='/index.php'&&$link=='/'?' class="current" ':'') . '><a href="' . $link . '">' . $name . '</a></li>';
			// }
			?>

			<!-- </ul>
		</div>

	</div>
</header> -->
<header>

	<div class="container">
		
	
		<a href="/"><img src="/img/logo-white.png" class="logo"></a>

<div class="nav-wrapper">
			<ul class="top-nav">
				<?php if (!isset($_SESSION["user"])): ?>
				<li><a href="#" id="loginToggle">Login</a></li>
				<li><a href="/join.php">Join</a></li>
				<?php else: ?>
				<li><a href="/logout.php">Logout</a></li>
					<?php if (isset($_SESSION["user"]['officer'])): ?>
						<li><a href="/admin.php">Admin</a></li>
					<?php endif; ?>
				<li>Logged in as <b><?php echo $_SESSION['user']['first'] . ' ' . $_SESSION['user']['last']; ?></b></li>
				<?php endif; ?>
			</ul>
			<ul class="nav">
				<?php 
				$links_data = file_get_contents('/home3/hhsprog/public_html/content/links.json');
				$links = json_decode($links_data, true);
				$links = array_reverse($links);
				foreach ($links as $name=>$link) {
					echo '<li' . ($link==$_SERVER['PHP_SELF']||$_SERVER['PHP_SELF']=='/index.php/'&&$link=='/'?' class="current" ':'') . '><a href="' . $link . '">' . $name . '</a></li>';
				}
				?>
			</ul>
			<div class="login">
				<form method="post" id="login-form">
					<div class="login-input">
						<label for="username" class="login-label">
							<i class="fa fa-fw fa-user"></i>
						</label>
						<input type="text" placeholder="Username" name="username">
					</div>
					<div class="login-input">
						<label for="password" class="login-label">
							<i class="fa fa-fw fa-lock"></i>
						</label>
						<input type="password" placeholder="Password" name="password">
					</div>
					<div class="login-input">
						<input type="submit" class="btn" value="Login">
					</div>
				</form>
			</div>
		</div>
		</div>
	</header>


<div class="page-title">
	<div style="height:0">&nbsp;</div>
	<div class="container">
		<h1>
			<?php if (isset($pagetitle)) echo $pagetitle;  ?>
			<?php if (isset($pagedescription)) echo '<small>// '.$pagedescription.'</small>';  ?>
		</h1>
	</div>
</div>

<div class="container">
	<div style="height:0">&nbsp;</div>
	<div class="content">

<script src="/js/login.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- yay we load jquery just to do this one slideToggle -->
<script>	
var loginOpened;
$('#loginToggle').on('click',function() {
	$('.login').slideToggle();
	loginOpened = !loginOpened;
	if (loginOpened) {
		$('#loginToggle').html('[x]');
		$('#loginToggle').css('color','#eb4c4c');
	}
	else {
		$('#loginToggle').html('Login');
		$('#loginToggle').css('color','#0b9976');		
	}
});
</script>
