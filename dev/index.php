<?php
$pagetitle = 'HHS Programming Club';
include('includes/header.php');
?>

<div class="row">
	<div class="box one-half">
		Welcome to HHS Programming Club! <br/><br/> Are you a new coder interested in learning how to program? Maybe, you're an experienced programmer looking to enter competitions? Regardless, Homestead's Programming Club is perfect for you! <br/><br/> Here we teach members new programming concepts while aiding them through individualized projects, competitions, and of course, hosting fun socials and events!<br/><br/><br/>
		<div class="button-wrapper">
			<a href="join" class="btn">Become a member!</a>
			<a href="survey" class="btn">Take the survey!</a>
		</div>
	</div>
	<div class="box-gray one-half last-child">
		LATEST NEWS<br><br>
		<?php
    	$news_data = file_get_contents('content/news.json');
    	$news = json_decode($news_data, true);
    	$post = $news[0];
	    echo '    <h2>' . $post['title'] . '</h2>';
	    echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
	    echo $post['content']
	    ?>
	</div>
</div>


<?php include('includes/footer.php'); ?>