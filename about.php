<?php 
$pagetitle = 'About';
$pagedescription = 'Who we are and what we do';
include('includes/header.php'); 
?>

<style>
t.semibold {
    font-weight: 600
}
</style>

    <h2>What is Programming Club?</h2>
    <div class="box one">
    Homestead Programming Club is a group of passionate and dedicated problem-solvers. Officers host workshops which cover fun and interesting applicatory topics that correspond to the Intro to Java and APCS curriculums. There are annual committee projects (ex: smart mirror using RaspberryPi, mobile app using Swift and Android, etc), where previous experience is definitely not mandatory to join--any necessary knowledge will be provided to complete the project. We also post weekly challenge problems to test our member's skills and prepare them for programming competitions. Programming Club includes an affiliated chapter of Girls Who Code, in which dedicated officers lead an introductory course throughout the school year on a programming language, such as Python. Whether you want to use your expertise to make an impact on campus or learn the basics, Programming Club has a spot for you!

    </div>

    <div class="row">
	    <div class="box one-half">
	    	<h2>Meetings</h2>
	    	<t class="semibold">General Meetings</t> – Tuesday Lunch in room I5 (weekly) <br>
        <t class="semibold">Girls Who Code</t> – Monday Lunch in room I5 (weekly)
	    </div>
	    <div class="box one-half last-child">
	    	<h2>Contact</h2>
	    	Questions? Comments? Feel free to email us at <a href="mailto:officers@hhsprogramming.com">officers<span style="display:none">asdf</span>@hhsprogramming.com</a>.
	    </div>
	</div>
    
    <div class="row">
    	<div class="box one"><h2>Officers</h2></div>
	    <?php
	    $officers_data = file_get_contents('content/officers.json');
	    $officers = json_decode($officers_data, true);
	    
	    $i = 0;
	    foreach ($officers as $officer) {
	        echo '<div class="box one-fourth officer">';
	        echo '  <img src="' . $officer['photo'] . '" class="box one">';
	        echo '  <div class="box one">';
	        echo '      <h3>' . $officer['name'] . '</h3>';
	        echo '      <h4>' . $officer['position'] . '</h4>';
	        echo $officer['description'];
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
