<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$useroffsets = json_decode(file_get_contents("content/useroffsets.json"), true);
	$offset = $_POST;
	$username = $offset["email"];
	$useroffsets[$username]["email"] = $offset["email"];
	$useroffsets[$username]["officer"] .= $_SESSION["user"]["first"] . "(" . $offset["offset"] . "), ";

	$useroffsets[$username]["points"] += $offset["offset"];
	file_put_contents("content/useroffsets.json", json_encode($useroffsets, JSON_PRETTY_PRINT));

}

?>

<link rel="stylesheet" href="/css/join.css">

<center>
<form id="increment_points" method="post">
	<table>
		
		<tr><td>Email:</td><td>
			<input type="email" name="email" placeholder="Email" required />
		</td></tr>
			<tr><td>Offset:</td><td>
			<input type="text" name="offset" placeholder="Offset" required />
		</td></tr>
	
	</table>
	<br />
	<input type="submit" class="btn" />
</form>
</center>

<script src="/js/join.js"></script>
