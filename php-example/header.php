<style>
body {
    font-family: sans-serif;
	line-height: 1.3;
}
header {
	background: #f5f5f5;
	padding: 20px;
}
.container {
	max-width: 500px;
}
</style>

<header>

	

	<a href="http://hhsprogramming.com/php-example/"><h1>Fruit</h1></a>
	<?php
	for ($i = 1; $i < 4; $i++) {
		echo '<a href="fruit' . $i . '.php">Example ' . $i . '</a> | ';
	}
	?>

</header>
