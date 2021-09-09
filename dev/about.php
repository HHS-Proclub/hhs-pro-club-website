<?php 
$pagetitle = 'About';
$pagedescription = 'Who we are and what we do';
include('includes/header.php'); 
?>
    <h2>What is Programming Club?</h2>
    <div class="box one">
		HHS Programming Club is a club for anyone with an interest in
		programming. From the beginner programmer to the coding enthusiast, we
		encourage everyone to join, learn from others, and share their own
		experiences.  Our biweekly challenge problems will test your skills and
		prepare you for competitions with fellow coders at other schools. But
		for those not interested in competing or for those who would like more
		preparation, we will offer after-school tutorials where you can learn
		various skills in programming or get help with a program you are trying
		to make. So if you have even the slightest interest in programming, or
		would like to know about programming, join the club now!
    </div>

    <div class="row">
	    <div class="box one-half">
	    	<h2>Meetings</h2>
	    	Club meetings are usually held on Wednesdays after-school in Mr. Shelby's room, A211.
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
	        echo '<div class="box one-third officer">';
	        echo '  <img src="' . $officer['photo'] . '" class="box one">';
	        echo '  <div class="box one">';
	        echo '      <h3>' . $officer['name'] . '</h3>';
	        echo '      <h4>' . $officer['position'] . '</h4>';
	        echo $officer['description'];
	        echo '  </div>';
	        echo '</div>';
	        if ($i==2) {
	        	echo '</div>
	        		  <div class="row">';
	        }
	        $i++;
	    }
	    
	    ?>
	</div>
	
<?php include('includes/footer.php'); ?>
