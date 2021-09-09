<!DOCTYPE html>
<html>
  <head>
    <title>Login Test</title>
    <link href="style.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <div class="header">
      <h1>Login</h1>
    </div>
    <div>
	  <?php
		$username = $_POST['username'];
		$password = $_POST['password'];
		$street_name = $_POST['street_name'];
		$city = $_POST['city'];
		$country = $_POST['country'];
		
		echo "<p><a href='index.html' />Home</a></p>";
		echo "<h2>Login status</h2>";
		if ($password == "joshua")
		{
			echo "<p>Success!<p>";
		}
		else
		{
			echo "<p>No success ... :(</p>";
		}
	  ?>
    </div>
  </body>
</html>