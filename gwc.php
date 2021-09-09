<?php
$pagetitle = 'Girls Who Code';
$pagedescription = 'Closing the Gender Gap';
include('includes/header.php');
?>

 <?php
    $news_data = file_get_contents('content/gwc.json');
    $news = json_decode($news_data, true);

    $total = count($news);

    $post = $news[0];
    echo '<div class="box-gray news">';
    echo '    <h2>' . $post['title'] . '</h2>';
    echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
    echo $post['content'];
    echo '</div>';
    ?>

    <div class="cols-wrapper">

    <?php

    // idk

    for ($i=1; $i<$total; $i++) {
    	$post = $news[$i];
        echo '<div class="box-gray news">';
        echo '    <h2>'. $post['title'] . '</h2>';
        echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
        echo $post['content'];
        echo '</div>';
        $i++;
    }

    for ($i=2; $i<$total; $i++) {
    	$post = $news[$i];
        echo '<div class="box-gray news">';
        echo '    <h2>'. $post['title'] . '</h2>';
        echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
        echo $post['content'];
        echo '</div>';
        $i++;
    }

    ?>
</div>

<div class="row">
    	<div class="box one"><h2>Members</h2></div>
	    <?php
	    $members_data = file_get_contents('content/gwc-members.json');
	    $members = json_decode($members_data, true);
	    
	    $i = 0;
	    foreach ($members as $member) {
	        echo '<div class="box one-fourth officer">';
	        echo '  <img src="' . $member['photo'] . '" class="box one">';
	        echo '  <div class="box one">';
	        echo '      <h3>' . $member['name'] . '</h3>';
	        echo '      <h4>' . $member['grade'] . '</h4>';
	        echo $member['description'];
	        echo '  </div>';
	        echo '</div>';
	        if ($i==3) {
	        	echo '</div>
	        		  <div class="row">';
	        }
	        $i++;
	    }
	    
	    ?>
	</div>

<?php include('includes/footer.php'); ?>
