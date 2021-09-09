<?php

/*
if (!isset($_GET["dev"])) {
	header("Location: /roundup/");
	die();
}
*/

session_start();

?>
<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,700|Ubuntu:400,700' rel='stylesheet' type='text/css'>
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="/css/style.css">
<?php if (false/*isset($_GET["dev"])*/) { ?>
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

<!--	
	<script>
		/* Changes background and foreground colours  for all elements on the page */
		function r() {
			return Math.floor(Math.random() * 255);
		}
		 
		function lemon() {
			with(this.style) {
				color = ['rgb(', [r(), r(), r()].join(','), ')'].join('');
				backgroundColor = ['rgb(', [r(), r(), r()].join(','), ')'].join('');
			}
		}
		 
		function rocks() {
			Array.prototype.forEach.call(document.all, function(item) {
				setTimeout(function() {
					lemon.call(item);
				}, Math.random() * 100 + 100);
			});
			setTimeout(rocks, Math.random() * 500 + 100);
		}

		if(Math.random() < 0.5) {
			setTimeout(rocks, 4200);
		}
	</script>
-->
</head>

<body>

<div class="photo"></div>
<div class="overlay"></div>

<header>
	<div class="container">

			<a href="/" class="logo">
				<img src="/img/logo-white.png">
				<!-- <img src="/img/troll face.png"> -->
			</a>

		<div class="vcenter">
			<ul class="nav">

			<?php
			$links_data = file_get_contents('content/links.json');
			$links = json_decode($links_data, true);

			if (isset($_SESSION["user"])) {
				unset($links["Login"]);
				unset($links["Join"]);
				$links["Logout"] = "/logout/";
			}

			foreach ($links as $name=>$link) {
				echo '<li' . ($link==substr($_SERVER['PHP_SELF'],0,-4).'/'||$_SERVER['PHP_SELF']=='/index.php'&&$link=='/'?' class="current" ':'') . '><a href="' . $link . '">' . $name . '</a></li>';
			}
			?>

			</ul>
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
