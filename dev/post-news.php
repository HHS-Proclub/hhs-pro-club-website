<?php

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
	die("Sorry, you do not have permission to view this page.");
}

if (isset($_POST['title']) && isset($_POST['day']) && isset($_POST['content'])) {
	list($_POST['year'], $_POST['month'], $_POST['date']) = split('[/.-]', $_POST['day']);
	unset($_POST['day']);
	$news_data = file_get_contents('content/news.json');
	$news = json_decode($news_data, true);
    array_unshift($news, $_POST);
    $news_f = fopen("content/news.json","r+");
    fwrite($news_f, json_encode($news, JSON_PRETTY_PRINT));
    fclose($news_f);
    header("Location: /news");
}

$pagetitle = 'Post News';
$pagedescription = "Yeah, now there's a gui for it";
include('includes/header.php');
?>

	<div class="box-gray one-half">
		<form method="post">
			<p>
				<label for="title">Title</label><br>
				<input type="text" name="title">
			</p>
			<p>
				<label for="day">Date</label><br>
				<input type="date" name="day" placeholder="DD/MM/YYYY">
			</p>
			<p>
				<label for="content">Content</label><br>
				<textarea name="content"></textarea>
			</p>
			<!-- ohlook tis a center tag -->
			<center><input type="submit" class="btn" value="Post"></center>
		</form>
	</div>

<?php include('includes/footer.php'); ?>