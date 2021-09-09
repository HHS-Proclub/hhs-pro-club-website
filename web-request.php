<?php

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

if (isset($_POST['title']) && isset($_POST['content']) && isset($_POST['officer']) && isset($_POST['deadline'])) {
	$news_data = file_get_contents('content/webrequests.json');
	$news = json_decode($news_data, true);
    array_unshift($news, $_POST);
    $news_f = fopen("content/webrequests.json","r+");
    fwrite($news_f, json_encode($news, JSON_PRETTY_PRINT));
    fclose($news_f);
}

$pagetitle = 'Website Request';
$pagedescription = "Make Arjun's life easier";
include('includes/header.php');
?>

	<div class="box-gray one-half">
		<form method="post">
			<p>
				<label for="title">Title</label><br>
				<input type="text" name="title" required>
			</p>
			<p>
				<label for="officer">Officer Name</label><br>
				<input type="text" name="officer" required>
			</p>
			<p>
				<label for="deadline">Hard Deadline (if any)</label><br>
				<input type="text" name="deadline">
			</p>
			<p>
				<label for="content">Request</label><br>
				<textarea name="content" required></textarea>
			</p>
			<!-- ohlook tis a center tag -->
			<center><input type="submit" class="btn" value="Submit"></center>
		</form>
	</div>

<?php include('includes/footer.php'); ?>
