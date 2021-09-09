<?php
include 'header.php';
?>

<div class="container">

	<p>
		List of fruit created by PHP:
		<ul>

		<?php
		$fruits = array('Blueberries', 'Peaches', 'Pluots');
		for ($i = 0; $i < count($fruits); $i++) {
			echo '<li>' . $fruits[$i] . '</li>';
		}
		?>

		</ul>
	</p>

	<p>
		List of fruit created by JavaScript:
		<ul id="fruitList">
		</ul>
	</p>

	<script>
	var fruits = ['Blueberries', 'Peaches', 'Pluots'];
	var fruitList = document.getElementById('fruitList')
	for (var i = 0; i < fruits.length; i++) {
		fruitList.innerHTML += '<li>' + fruits[i] + '</li>';
	}
	</script>

	<p>
		Check the source code of this page by clicking <b>ctrl + u</b>.
	</p>
	<p>
		Notice how the PHP code isn't shown, only the result of the PHP code. PHP is run on the server before the web page is loaded in the web browser, and the web browser only receives what the PHP outputs with <code>echo</code>.
	</p>
	<p>
		Conversely, notice how the JavaScript code is displayed in the source, but not the result of the JavaScript (the actual list) because JavaScript is only run after the page is loaded.
	</p>
	<p>
		In this example, both PHP and JavaScript are valid ways for the task. This is not always the case. For example, databases cannot and should not be handled by JavaScript, because users (and hackers) should not be able to see the internals of how data (often private user data) is stored.
	</p>

</div>
