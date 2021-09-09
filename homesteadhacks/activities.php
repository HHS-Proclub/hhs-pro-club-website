<?php
$pagetitle = 'Activities';
$pagedescription = 'Various Workshops/Competitions';
include('hackathonIncludes/header.php');
?>

 <?php
    $news_data = file_get_contents('hackathonContent/news.json');
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
