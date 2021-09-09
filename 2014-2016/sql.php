<?php

$table_prefix = "hhsprog_";

/******************
 * FUNCTIONS
 ******************/

// Returns result of query as an HTML table or message
function query_to_html($db, $db_name, $query) {
	$start_time = microtime(true);

	$db->select_db($db_name);
	if (!$db->multi_query($query)) {
		// error message
		return '<div style="color: red">Error: '.$db->error.'</div>';
	}

	$html = [];
	$affected = 0;

	do {
		$result = $db->store_result();

		// results table
		if ($result) {
			$fields = "<tr><th>".implode("</th><th>",
					array_map(function ($field) { return $field->name; },
					$result->fetch_fields()))."</th></tr>";
			$rows = "";

			foreach ($result as $row) {
				$row = implode("</td><td>", $row);
				$rows .= "\n\t\t<tr><td>$row</td></tr>";
			}
			$result->free();

			$html[] = <<<EOT
<table>
	<thead>
		$fields
	</thead>
	<tbody>$rows
	</tbody>
</table>
EOT;

		// success message
		} else {
			$html[] = '<div style="color: green">Success</div>';
		}

		$affected += $db->affected_rows;
	} while ($db->next_result());

	$html[] = "$affected rows in ".(microtime(true) - $start_time)."s";

	return implode("<br />\n", $html);
}


// Returns tables in database as HTML options
function get_tables_as_options($db, $db_name) {
	$html = "";

	$db->select_db($db_name);
	$result = $db->query("SHOW TABLES");

	while ($row = $result->fetch_row()) {
		$html .= "<option value=$row[0]>$row[0]</option>\n";
	}

	return $html;
}

// Returns columns of table as HTML options
function get_columns_as_options($db, $db_name, $table) {
	$html = "";

	$db->select_db($db_name);
	$result = $db->query("SHOW COLUMNS IN $table");

	while ($row = $result->fetch_row()) {
		$html .= "<option value=$row[0]>$row[0]: $row[1]</option>\n";
	}

	return $html;
}

/******************
 * FORM HANDLING
 ******************/

session_start();

// handle login form
if (!empty($_POST["username"]) && !empty($_POST["password"])) {
	$_SESSION["mysql_username"] = $_POST["username"];
	$_SESSION["mysql_password"] = $_POST["password"];
	header("Location: ");
	exit();
}

// handle logout form
if (!empty($_POST["logout"])) {
	unset($_SESSION["mysql_username"]);
	unset($_SESSION["mysql_password"]);
	header("Location: ");
	exit();
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

// handle get columns
if (isset($_GET["database"]) && isset($_GET["table"])) {
	if (!empty($_GET["table"]) && !$db->connect_errno) {
		echo get_columns_as_options($db, $_GET["database"], $_GET["table"]);
	}
	exit();

// handle get tables
} else if (isset($_GET["database"])) {
	if (!$db->connect_errno) {
		echo get_tables_as_options($db, $_GET["database"]);
	}
	exit();
}

/******************
 * CONTENT
 ******************/

?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<style>
		body {
			font-family: "Open Sans", sans-serif;
		}
	</style>
</head>
<body>
<?php

// query form
if (!$db->connect_errno) {

?>
	<form>
		Database: <select id="database-select" name="database">
<?php

	$result = $db->query("SHOW DATABASES LIKE '$table_prefix%'");
	while ($row = $result->fetch_row()) {

?>
			<option value="<?= $row[0] ?>"><?= $row[0] ?></option>
<?php

	}

	if ($table_prefix) {

?>
			<option value="information_schema">information_schema</option>
<?php

	}

?>
		</select><br />
		<br />

		<select id="table-select" size="4"></select>
		<select id="column-select" size="4"></select><br />
		<br />

		<textarea name="query" id="query-box" cols="80" rows="5" autofocus></textarea><br />
		<script>
			document.getElementById("query-box").addEventListener("keydown", function (e) {
				if (e.keyCode == 13 && e.ctrlKey) this.form.querySelector("input[type=submit]").click();
			});
		</script>
		<input type="submit" value="Query" />
		<br />
	</form>

	<div id="result"></div>

	<script>
		(function () {
			var xhr = new XMLHttpRequest();

			var queryBox = document.getElementById("query-box");
			var databaseSelect = document.getElementById("database-select");
			var tableSelect = document.getElementById("table-select");
			var columnSelect = document.getElementById("column-select");

			var updateTables = function () {
				xhr.open("GET", "?database=" + encodeURIComponent(databaseSelect.value));
				xhr.onload = function () {
					tableSelect.innerHTML = this.responseText;
					columnSelect.innerHTML = "";
				};
				xhr.send();
			};

			var updateColumns = function () {
				xhr.open("GET", "?database=" + encodeURIComponent(databaseSelect.value)
						+ "&table=" + encodeURIComponent(tableSelect.value));
				xhr.onload = function () {
					columnSelect.innerHTML = this.responseText;
				};
				xhr.send();
			};

			databaseSelect.addEventListener("change", updateTables);
			window.addEventListener("load", updateTables);

			tableSelect.addEventListener("change", updateColumns);

			queryBox.form.addEventListener("submit", function (e) {
				e.preventDefault();

				var query = queryBox.value;

				if (/UPDATE|DELETE/i.test(query) && !confirm(
						"It appears you are trying to run an UPDATE or DELETE query: \n\n"
						+ "\"" + query + "\""
						+ "\n\nWould you like to continue?", "Yes", "No")) {
					return;
				}

				xhr.open("POST", "");
				xhr.onload = function () {
					document.getElementById("result").innerHTML = "<br />" + this.responseText;
					if (/CREATE|ALTER|DROP/i.test(query)) updateTables();
				};
				document.getElementById("result").innerHTML = "<br />Loading...";
				xhr.send(new FormData(this));

				document.getElementById("query-box").select();
			});
		})();
	</script>

	<br />
	<form method="post">
		<input type="submit" name="logout" value="Log out" />
	</form>
<?php

// 	login form
} else {

?>
	<form method="post">
		<label>Username: <input type="text" name="username" autofocus/></label><br />
		<label>Password: <input type="password" name="password" /></label><br />
		<input type="submit" value="Log In" />
	</form>
<?php

}

?>
</body>
</html>
