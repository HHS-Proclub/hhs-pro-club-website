<?php

$table_prefix = "hhsprog_";

function get_query_time($start_time) {
	return 'Query took '.(microtime(true) - $start_time).'s';
}

function query_to_html($db, $db_name, $query) {
	$start_time = microtime(true);
	
	$db->select_db($db_name);
	$result = $db->query($query);

	// success message
	if ($result === true) {
		$html = '<div style="color: green">Success</div>';

	// results table
	} else if ($result) {
		$fields = "<tr><th>".implode("</th><th>", array_map(function ($field) { return $field->name; }, $result->fetch_fields()))."</th></tr>";
		$rows = "";


		while ($row = $result->fetch_row()) {
			$row = implode("</td><td>", $row);
			$rows .= <<<EOT
		 <tr><td>$row</td></tr>
EOT;
		}

		$html = <<<EOT
<table>
	<thead>
		$fields
	</thead>
	<tbody>
$rows
	</tbody>
</table>
EOT;

	// error message
	} else {
		$html = '<div style="color: red">Error: '.$db->error.'</div>';
	}
	
	return $html."<br />".get_query_time($start_time);
}

session_start();

// handle login form
if (!empty($_POST["username"]) && !empty($_POST["password"])) {
	$_SESSION["mysql_username"] = $_POST["username"];
	$_SESSION["mysql_password"] = $_POST["password"];
}

// handle logout form
if (!empty($_POST["logout"])) {
	session_unset();
}

// connect to db
$db = new mysqli("localhost", $_SESSION["mysql_username"], $_SESSION["mysql_password"]);

// handle query form
if (isset($_POST["query"])) {
	if (!empty($_POST["query"]) && !$db->connect_errno) {
		echo query_to_html($db, $_POST["database"], $_POST["query"]);
	}
	exit();
}

?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<script>
		var xhr = new XMLHttpRequest();
	</script>
</head>
<body>
<?php

// query form
if (!$db->connect_errno) {

?>
	<form>
		Database: <select name="database">
			<option value="information_schema">information_schema</option>
<?php

	$result = $db->query("SHOW DATABASES LIKE '$table_prefix%'");
	while ($row = $result->fetch_row()) {

?>
			<option value="<?= $row[0] ?>"><?= $row[0] ?></option>
<?php

	}

?>
		</select><br /><br />
		<textarea name="query" id="queryBox" cols="80" rows="5" autofocus ></textarea>
		<script>
			document.getElementById("queryBox").addEventListener("keydown", function (e) {
				if (e.keyCode == 13 && e.ctrlKey) this.form.querySelector("input[type=submit]").click();
			});
		</script><br />
		<input type="submit" value="Query" />
	</form>
	<script>
		document.getElementById("queryBox").form.addEventListener("submit", function (e) {
			e.preventDefault();
			xhr.open("POST", "");
			xhr.onload = function () {
				document.getElementById("result").innerHTML = "<br />" + this.responseText;
			};
			document.getElementById("result").innerHTML = "<br />Loading...";
			xhr.send(new FormData(this));
			document.getElementById("queryBox").select();
		});
	</script>
	<div id="result">
	</div>
	<br />
	<form method="post">
		<input type="submit" name="logout" value="Log out" />
	</form>
<?php

// 	login form
} else {

?>
	<form method="post">
		<label>Username: <input type="text" name="username" /></label><br />
		<label>Password: <input type="password" name="password" /></label><br />
		<input type="submit" value="Log In" />
	</form>
<?php

}

?>
</body>
</html>
