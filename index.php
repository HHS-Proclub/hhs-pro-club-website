<?php
# header("Location: https://bit.ly/hhs-proclub-2021");
$pagetitle = 'Home';
$pagedescription = 'Welcome!';
include('includes/header.php');
?>


<div class="row">
	<div class="one-half">
		<h2>Welcome to Programming Club!</h2>

		<br/>

		Welcome to HHS Programming Club!

		<br/>
		<br/>
		<br/>

		<a href="join.php" class="btn">Make an account</a>
<!--		<a href="https://discord.gg/82Ef6eA" class="btn">Join our Discord</a> -->
		<br/>
		<br/>
<!--        <a href="news.php" class="btn">View all Workshops</a> -->
<!--		<a href="https://docs.google.com/forms/d/e/1FAIpQLSfBCq8qwg0mS35ZPxaOCynNyJ4-RGtvh1xkPlDModje1da8Zw/viewform" class="btn">Order a T-Shirt!</a> -->
	</div>
    <div class="box box-gray one-half last-child">
        <h2>News</h2>
		<?php
		   $news_data = file_get_contents('content/news.json');
		   $news = json_decode($news_data, true);

		   $total = count($news);

		   $post = $news[0];
		   echo '    <h3>' . $post['title'] . '</h3>';
		   echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
		   echo $post['content'];
		   ?>
    </div>

</div>

<?php include('includes/footer.php'); ?>
