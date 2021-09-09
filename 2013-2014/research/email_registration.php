<?php

$username = "hhsprog_wrdp1";
$password = "DffJst3jqZwfOWn";
$hostname = "localhost"; 

//connection to the database
$dbhandle = mysql_connect($hostname, $username, $password) 
 or die("Unable to connect to MySQL");


//select a database to work with
$selected = mysql_select_db("hhsprog_wrdp1",$dbhandle) 
  or die("Could not select examples");
  
  $email= $_POST['email'];

//execute the SQL query and return records

$query = "insert into research VALUES ('".$email."')";

$result = mysql_query($query);

//close the connection
mysql_close($dbhandle);


echo '<meta HTTP-EQUIV="REFRESH" content="0; url=http://hhsprogramming.com/research.php?success">';



?>