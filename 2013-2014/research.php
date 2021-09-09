<html>


<body>


<img id="logo" src="/research/banner_text.png" />

<div id="form">

<?php

if (isset($_GET['success'])) {
  
  echo "<b><font face='verdana' color='#fff' size='5'>Thank you! Your email has been added to the mailing list.</font></b>";
  
}
else
{


?>

<form action="http://hhsprogramming.com/research/email_registration.php" method="post">

<input type="text" id="email" placeholder="Sign up for our mailing list" name="email" />
<input type="submit" id="submit" />



</form>

<?php

}

?>

<br>



</div>





</body>






<style>

body
{
background-color: #5E99F7;
}

img#logo
{
	width: 900px;
	height: 250px;
	position: absolute;
   	top: 10%;
   	left: 50%;
   	margin-left: -460px; /* Half the width */
}

div#form
{
	position: fixed;
	width: 100%;
	bottom: 30%;
	left: 50%;
	margin-left: -480px;
}

input#email
{
	width: 800px;
	height: 50px;
	font-size: 28px;
	-webkit-border-radius: 10px;
	border-radius: 10px;
	color: #5E99F7;
}



input#submit{
	-moz-box-shadow:inset 0px 1px 0px -50px #fcfcfc;
	-webkit-box-shadow:inset 0px 1px 0px -50px #fcfcfc;
	box-shadow:inset 0px 1px 0px -50px #fcfcfc;
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #63b8ee), color-stop(1, #468ccf) );
	background:-moz-linear-gradient( center top, #63b8ee 5%, #468ccf 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#63b8ee', endColorstr='#468ccf');
	background-color:#63b8ee;
	-webkit-border-top-left-radius:10px;
	-moz-border-radius-topleft:10px;
	border-top-left-radius:10px;
	-webkit-border-top-right-radius:10px;
	-moz-border-radius-topright:10px;
	border-top-right-radius:10px;
	-webkit-border-bottom-right-radius:10px;
	-moz-border-radius-bottomright:10px;
	border-bottom-right-radius:10px;
	-webkit-border-bottom-left-radius:10px;
	-moz-border-radius-bottomleft:10px;
	border-bottom-left-radius:10px;
	text-indent:0;
	border:1px solid #ffffff;
	display:inline-block;
	color:#14396a;
	font-family:Arial;
	font-size:15px;
	font-weight:bold;
	font-style:normal;
	height:50px;
	line-height:50px;
	width:113px;
	text-decoration:none;
	text-align:center;
	text-shadow:1px 1px 0px #7cacde;
	cursor: pointer;
}
input#submit:hover {
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #468ccf), color-stop(1, #63b8ee) );
	background:-moz-linear-gradient( center top, #468ccf 5%, #63b8ee 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#468ccf', endColorstr='#63b8ee');
	background-color:#468ccf;
}input#submit {
	position:relative;
	top:1px;
}

</style>

</html>