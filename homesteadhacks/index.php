
<?php
    $pagetitle = 'Home';
    $pagedescription = 'Welcome!';
    @include('hackathonIncludes/header.php');
    ?>


<div class="row">
<div class="one-half">

<br/>

<h2>Welcome to HomesteadHacks!</h2>

<br/>

Official website for Homestead's 1st Hackathon!

<br/>
<br/>

<a href="about.php" class="btn">Information</a> &nbsp
<a href="https://docs.google.com/forms/d/e/1FAIpQLSd5-f8PGSUDb9H6b8xDkWZO9igI33kEt2sT54Sg0uPZlHv9yA/viewform?usp=sf_link" class="btn">Interested?</a>

<br/>
<br/>
</div>
<div class="box box-gray one-half last-child">
<h2>News</h2>
<?php
    $news_data = file_get_contents('hackathonContent/news.json');
    $news = json_decode($news_data, true);
    
    $total = count($news);
    
    $post = $news[0];
    echo '    <h3>' . $post['title'] . '</h3>';
    echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
    echo $post['content'];
    ?>
</div>


</div>

<div class="row">
<br>
<h2>OUR SPONSORS</h2>
<img src="/hackathonIMG/18techlogo.png" alt="18tech" height="200">
<img src="/hackathonIMG/wolframlogo.jpg" alt="wolfram" height="200">
<img src="/hackathonIMG/balsamiqlogo.svg" alt="balsamiq" height="150">
</div>
