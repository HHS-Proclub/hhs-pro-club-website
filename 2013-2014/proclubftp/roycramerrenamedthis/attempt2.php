<!doctype HTML>

<html>

	<head>
		<title>This is a title apparently.</title>
	</head>
	
	<body>
	
		<p>Hello peeps!</p>
		<form action = "" method="post">
		
			<input name="field1" type="text" placeholder="whoa hint text!"/>
			<input name="field2" type="text" placeholder="whoa hint text!"/>
			<input name="field3" type="submit" value="Click me too" placeholder="congratulations"/>
		
		</form>
	
	</body>
	
</html>



<?php

	$input1=$_POST["field1"];
	$input2=$_POST["field2"];
	
	if (!empty($input1)){
		if($input1===$input2)
			echo "<h1>Wow man, it appears as though these two inputs are the same. Clearly something must have gone horribly wrong.</h1>";
		else
			echo input1." and ".input2." are not the same! This is severely disappointing!";
	}
?>