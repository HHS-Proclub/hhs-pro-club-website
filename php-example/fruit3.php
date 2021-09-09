<?php
include 'header.php';
?>

<p>
	<?php
	if (!isset($_GET['fruit'])) {
		$fruit = 'nothing';
	}
	else {
		$fruit = $_GET['fruit'];
	}	
	?>
	The best fruit is: <?php echo $fruit; ?>
</p>

<p>
	Try the following links:
	<ul>
		<li>
			<a href="fruit3.php?fruit=apple">fruit3.php?fruit=apple</a>
		</li>
		<li>
			<a href="fruit3.php?fruit=orange">fruit3.php?fruit=banana</a>
		</li>
		<li>
			<a href="fruit3.php?fruit=asdf">fruit3.php?fruit=asdf</a>
		</li>
	</ul>
</p>