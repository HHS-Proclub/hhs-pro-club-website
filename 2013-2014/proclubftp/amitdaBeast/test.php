<!DOCTYPE html>

<html>
	
	
	<head>
		<title>This is not a title</title>
	</head>
	
	<body>
		<form action = "" method = "post">
			<input name="field1"  type ="text"  placeholder="field1"/>
			<input name="field2"  type="text"   placeholder="field1"/>
			<input name="field3"  type="submit" value="Click Here"  placeholder="field1"/>
		</form>
	</body>

</html>



<?php
$input1 = $_POST["field1"];
$input2 = $_POST["field2"];

if($input1 === $input2 && !empty($input1))
{
	echo "<h1>The 2 inputs are the same</h1>";

}
else if(!empty($input1))
	echo "The 2 inputs are not the same";

?>


