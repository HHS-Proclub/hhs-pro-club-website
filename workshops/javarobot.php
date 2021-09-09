<?php
$pagetitle = 'Java Robot';
$pagedescription = 'The Official Playground for the Java Robot Workshop!';
include('../includes/header.php');
?>

<h2>What is Java Robot?</h2>
<br/>
<p>The Java Robot is a package used to make/test programs generally involving external input (ex: the keyboard or the mouse). It can press a specific key, move your mouse, and click stuff.</p>

<br/>
<br/>
<br/>

<h2>What Can I Do With Java Robot?</h2>
<p>You can make stuff that would generally involve the need of a mouse such as a spotify song skipper (for example: you can click alt+5 to get it to skip a song.) It can also be used to enter keys, detect pixels, and much, much more!</p>

<br/>
<br/>
<br/>

<h2>Getting Started</h2>
<p>
  Create a new Java file, and add your main method (public static void main). Then, <a href="https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html">view the documentation</a> to see what you can do.
  <br/>
  You can view the challenges below.
</p>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>1. Youtube Ad Auto-Skipper</h2>
<h5>Those Youtube ads can be super annoying! Make a robot that automatically skips every skippable ad that comes your way.</h5>
<h6>HINT: Try this:<br/>
1. Check the color at a specific pixel<br/>
2. If it’s black (the color of the skip button), click there
</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>2. Auto Scroller</h2>
<h5>Create a program that automatically scrolls through a news article (ie on nytimes.com) at a readable rate.</h5>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>3. Go Back!</h2>
<h5>Check if you can go back a page. If you can, click the “go back” button.</h5>
<h6>HINT: This one is very similar to the Youtube Ad Skipper!</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>



<h2>4. Auto Sign In</h2>
<h5>Make it so that, once you run your program, it automatically signs you in.</h5>
<h6>HINT: The username is ‘totallyproclubadmin’ and the password is ‘totallythepassword’.</h6>
<form method="POST">
  <input type="text" name="javarobot-user"/>
  <input type="password" name="javarobot-password"/>
  <input type="submit" value="Submit" class="btn"/>
  <?php
    if($_POST['javarobot-user'] == 'totallyproclubadmin' && $_POST['javarobot-password'] == 'totallythepassword') {
      echo '<p style="color: darkgreen;">Success!</p>';
    } else if($_POST['javarobot-user'] != '') {
      echo '<p style="color: darkred;">Failure...</p>';
    }
  ?>
</form>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>5. Find the Pixel</h2>
<h5>Write a Java Robot program that finds the red pixel.</h5>
<h6>HINT: Find where the gray box is, and loop through the x and the y like a 2D array.</h6>
<br/>
<div class="box-gray news" style="height: 200px;">
  <?php
    $x = rand(30, 500);
    $y = rand(30, 170);

    echo '<div style="
    background-color:red;
    height: 1px;
    width: 1px;
    position: relative;
    left: '.$x.'px;
    top: '.$y.'px;
    "></div>';
  ?>
</div>
<?php
  echo '<p>Solution: ('.$x.', '.$y.')</p>';
?>


<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>6. News Screenshotter</h2>
<h5>Go to the news section of the club website. Make a robot that takes a screenshot of every “news” box.</h5>
<h6>HINT: Find the location of each news section by checking for color (you may need to use a bunch of loops for this). Then, take a screenshot using createScreenCapture(). Google how you can save a BufferedImage to your desktop so you can view your results!</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>7. Snake Auto-Player</h2>
<h5><a href="http://patorjk.com/games/snake/">Click here</a> to view a pre-made snake game. Create an AI that plays snake to the best of its ability. Your ultimate goal should be to do create a perfect snake.</h5>
<h6>HINT: A snake AI is actually extraordinarily difficult, so it’s unlikely you’ll get to creating a perfect snake.<br/>
However, I’d look at this page for a bit on Snake AI:<br/>
<a href="https://github.com/stevennl/Snake">Click here</a>
</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>8. Pacman Auto-Player</h2>
<h5>Create a robot to play Pacman.</h5>
<h6>Go here: <a href= "https://www.google.com/search?q=pacman&rlz=1C1CHBF_enUS745US745&oq=pacman&aqs=chrome.0.69i59j0l5.1199j0j7&sourceid=chrome&ie=UTF-8">Pacman</a>. Try to use Java Robot to beat the Google Doodle!</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>9. Any Auto-Player</h2>
<h5>Find a game with online leaderboards (for example, a Facebook game where you compete against friends) and create an auto-player for that! Try making your auto player get a high score.</h5>

<?php include('../includes/footer.php'); ?>
