<?php

define('TEST_DATA_DIR', 'test data');
define('SOLUTIONS_DIR', 'solutions');
define('IDEONE_USER', 'hhsprogramming');
define('IDEONE_PASSWORD', 'hhsprog4ming');

// enabled languages
$langs = array(
	10 => array("name" => "Java", "ext" => "java"),
	116 => array("name" => "Python 3", "ext" => "py"),
	44 => array("name" => "C++", "ext" => "cpp")
);

// grade submission if AJAX
if ($_SERVER["PHP_SELF"] === "/grader.php") {
	if (empty($_POST['user']) || empty($_POST['problem'])
			|| empty($_POST['lang']) || empty($_FILES['file'])
			|| !$_FILES['file']['size']) {
		die();
	}

	// stores grading results in db
	function storeResult($prob, $email, $lang, $correct, $err_msg, $time = 'NULL', $mem = 'NULL') {
		$db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)
				or die('Error connecting to the database');

		$prob = $db->real_escape_string($prob);
		$email = $db->real_escape_string($email);
		$correct = $correct ? 1 : 0;
		$err_msg = $db->real_escape_string($err_msg);

		$result = $db->query('REPLACE INTO challenge_problem_results VALUES '
				."('$prob', '$email', $lang, $correct, '$err_msg', $time, $mem);");
	}

	$user = $_POST['user'];						// submitter
	$prob = $_POST['problem'];					// problem name
	$lang = intval($_POST['lang']);				// source code language (Java - 10, Python 3 - 116)
	$uploaded = $_FILES['file']['tmp_name'];	// uploaded file path

	// check that test data exists for problem
	if (!file_exists(TEST_DATA_DIR."/$prob.in")
			|| !file_exists(TEST_DATA_DIR."/$prob.out")
			|| !is_dir(SOLUTIONS_DIR)) {
		die("Problem $prob does not exist.");
	}

	// store solution in filesystem
	$contents = file_get_contents($uploaded);
	if (!file_exists(SOLUTIONS_DIR."/$prob")) {
		mkdir(SOLUTIONS_DIR."/$prob");
	}
	move_uploaded_file($uploaded, SOLUTIONS_DIR."/$prob/$user.{$langs[$lang]["ext"]}");

	// replace class name for Java
	if ($lang === 10) {
		$contents = str_replace($prob, "Main", $contents, $count);
		if ($count === 0) {
			storeResult($prob, $user, $lang, false, 'Class name is incorrect.');
			die(do_shortcode('[alert heading="Class name is incorrect." type="alert-error" block="false" close="false"][/alert]'));
		}
	}

	// ideone API (http://ideone.com/files/ideone-api.pdf)
	try {
		$client = new SoapClient('http://ideone.com/api/1/service.wsdl');
	} catch (Exception $e) {
		die("SOAP fault: ".$e->getMessage());
	}

	// upload source code to ideone
	try {
		$result = $client->__soapCall('createSubmission',
			array('user' => IDEONE_USER,
				'pass' => IDEONE_PASSWORD,
				'sourceCode' => $contents,
				'language' => $lang,
				'input' => file_get_contents(TEST_DATA_DIR."/$prob.in"),
				'run' => true,
				'private' => true));
	} catch (SoapFault $e) {
		die("SOAP fault: ".$e->getMessage());
	}
	if ($result['error'] !== 'OK') {				// Ideone API error
		die('Ideone error: '.$result['error']);
	}
	$link = $result['link'];

	// poll for submission result
	do {
		try {
			$result = $client->__soapCall('getSubmissionStatus',
				array('user' => IDEONE_USER,
					'pass' => IDEONE_PASSWORD,
					'link' => $link));
		} catch (SoapFault $e) {
			die("SOAP fault: ".$e->getMessage());
		}
		if ($result['error'] !== 'OK') {			// Ideone API error
			die('Ideone error: '.$result['error']);
		}
		if ($result['status'] !== 0) {	// wait 3 seconds before trying
			sleep(3);					// trying again
		}
	} while ($result['status'] !== 0);	// not finished running

	// handle runtime/compilation errors
	if ($result['result'] === 11) {
		storeResult($prob, $user, $lang, false, 'Compilation error.');
		die(do_shortcode('[alert heading="Result: Compilation error." type="alert-error" block="false" close="false"][/alert]'));
	} elseif ($result['result'] === 12) {
		storeResult($prob, $user, $lang, false, 'Runtime error.');
		die(do_shortcode('[alert heading="Result: Runtime error." type="alert-error" block="false" close="false"][/alert]'));
	} elseif ($result['result'] === 13) {
		storeResult($prob, $user, $lang, false, 'Time limit (5s) exceeded.');
		die(do_shortcode('[alert heading="Result: Time limit (5s) exceeded." type="alert-error" block="false" close="false"][/alert]'));
	} elseif ($result['result'] === 19) {
		storeResult($prob, $user, $lang, false, 'Illegal system call');
		die(do_shortcode('[alert heading="Result: Illegal system call" type="alert-error" block="false" close="false"][/alert]'));
	} elseif ($result['result'] === 20) {
		die(do_shortcode('[alert heading="Ideone internal error. Please try again later." type="alert-error" block="false" close="false"][/alert]'));
	} elseif ($result['result'] !== 15) {	// status is not success
		storeResult($prob, $user, $lang, false, 'Unknown error.');
		die(do_shortcode('[alert heading="Result: Unknown error." type="alert-error" block="false" close="false"][/alert]'));
	}

	// check if output is correct
	try {
		$result = $client->__soapCall('getSubmissionDetails',
			array('user' => IDEONE_USER,
				'pass' => IDEONE_PASSWORD,
				'link' => $link,
				'withSourceCode' => false,
				'withInput' => false,
				'withOutput' => true,
				'withStderr' => false,
				'withCmpinfo' => false));
	} catch (SoapFault $e) {
		die("SOAP fault: ".$e->getMessage());
	}
	if ($result['error'] !== 'OK') {				// Ideone API error
		die('Ideone error: '.$result['error']);
	}
	if (trim($result['output']) === trim(file_get_contents(TEST_DATA_DIR."/$prob.out"))) {
		storeResult($prob, $user, $lang, true, '', $result['time'], $result['memory']);
		echo do_shortcode('[alert heading="Result: Correct." '
				.'type="alert-success" block="false" close="false"]Runtime: '
				.$result['time'].'s Memory Usage: '
				.round($result['memory'] / 1000, 2).' KB[/alert]');
		// echo '<span style="color: green">Result: Correct.<h4>Runtime: '.$result['time'].'s.</h4>'
		//		.'<h4>Memory Usage: '.round($result['memory'] / 1000, 2).' KB</h4></span>';
	} else {
		storeResult($prob, $user, $lang, false, 'Incorrect output.');
		echo do_shortcode('[alert heading="Result: Incorrect output." type="alert-error" block="false" close="false"][/alert]');
	}

// show submission form if included
} else {
	$prob = get_post_meta($post->ID, "problem", true);
	if (empty($prob)) return;

	if (is_user_logged_in()) {
		global $current_user;
		get_currentuserinfo();

?>
<script type="text/javascript">
	jQuery(function ($) {
		var exts = {
<?php

		$comma = "";
		foreach ($langs as $id => $lang) {
			$comma = ",";
			echo <<<EOT
			$id: "{$lang["ext"]}"$comma

EOT;
		}

?>
		};

		$("#lang").change(function () {
			var ext = exts[$(this).val()];
			$("#ext").text(ext);
			$("#file").attr("accept", "." + ext);
		});

		$("#grader").submit(function (event) {
			if (window.FormData !== undefined) {	// if HTML 5 file upload supported
				event.preventDefault();				// disable default submit
				$("#result").html("Loading...");
				var data = new FormData(this);
				$.ajax({
					url: "/grader.php",
					type: "POST",
					data: data,
					processData: false,				// required for FormData
					contentType: false,				// to work with JQuery
					success: function (data) {
						var file = $("#file");
						file.replaceWith(file.clone(true));
						$("#result").html(data);
					}
				});
			}
		})
	});
</script>
<h3>Submit your solution (<?php echo $prob; ?>.<span id="ext">java</span>):</h3>
<form id="grader" action="/grader.php" enctype="multipart/form-data">
	<label>Language: <select name="lang" id="lang">
<?php

		foreach ($langs as $id => $lang) {
			echo <<<EOT
	<option value="$id">{$lang["name"]}</option>

EOT;
		}

?>
	</select></label>
	<input type="file" name="file" id="file" accept=".java" required="" />
	<input type="submit" value="Submit" />
	<input type="hidden" name="user" value="<?php echo $current_user->user_email; ?>" />
	<input type="hidden" name="problem" value="<?php echo $prob; ?>" /><br />
	Powered by <a href="http://ideone.com">ideone.com</a>
</form>
<div id="result"></div>
<?php

		if ($db = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME)) {
			$prob = $db->real_escape_string($prob);
			$email = $db->real_escape_string($current_user->user_email);
			$result = $db->query("SELECT * FROM challenge_problem_results "
					."WHERE problem='$prob' AND email='$email'");
			if ($result->num_rows) {
				$row = $result->fetch_assoc();

?>
<h3>Previous submission results</h3>
<?php

				$result = $row['correct'] ? 'Correct' : $row['err_msg'];
				$status = $row['correct'] ? 'success' : 'error';
				$stats = $row['correct'] ? "Runtime: {$row['time']}s Memory "
						.'Usage: '.round($row['mem'] / 1000, 2).' KB' : "";

				echo do_shortcode("Java: [alert heading=\"Result: $result\" type=\"alert-$status\"]{$stats}[/alert]");
			}
		}

	// not logged in
	} else {

?>
<br />You must be logged in to submit a solution.
<?php

	}
}

?>
