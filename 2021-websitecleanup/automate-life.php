<?php 
$pagetitle = 'Automate Life';
$pagedescription = 'Automate life with the power of programming';
include 'includes/header.php'; 
?>

<style>
    code {
        padding: 3px;
        background: #eee;
    }
    
    ol>li {
        margin-bottom: 10px;
    }
</style>

<br>

<h2>Java Robot</h2>
<p> What is the Java Robot? Java Robot allows you to control your mouse and keyboard using code, and without any user interaction. 
<ol>
    <li>
        Open up Eclipse and create a new Java Project
    </li>
    <li>
        Import the Java Robot using these lines of code: <br> 
		<code> import java.awt.AWTException<br>
import java.awt.Robot;<br>
import java.awt.event.KeyEvent; </code> 
    </li>
    <li>
        Experiment with the different methods available, <a href = "https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html"> here. </a>
    </li>
</ol>
<h2> Confused? Here are some methods explained: </h2> <br>
	<code>Robot robot = new Robot(); </code> <p> Creates a Robot that will act on the screen. This is necessary for all commands moving forward. </p>
	<code>robot.mouseMove(x, y); </code> <p> Moves the mouse to the spot x pixels from the left of the screen and y pixels from the top of the screen.</p>
	<code>robot.mousePress(code); </code> <p> Replace code with InputEvent.BUTTON1_MASK to press left click, InputEvent.BUTTON2_MASK to press middle click, and InputEvent.BUTTON3_MASK to press right click.</p>
	<code>robot.mouseRelease(code); </code> <p> Replace code with InputEvent.BUTTON1_MASK to release left click, InputEvent.BUTTON2_MASK to release middle click, and InputEvent.BUTTON3_MASK to release right click.</p>
	<code>robot.keyPress(code); </code> <p> Replace code with the keycode of the key you want to press. A list of keycodes can be found <a href = "http://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html"> here. </a></p>
	<code>robot.keyRelease(code); </code> <p> Replace code with the keycode of the key you want to release. A list of keycodes can be found <a href = "http://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html"> here. </a></p>
	<code>robot.delay(ms); </code> <p> If a certain action takes the computer time, you may want to set a delay before doing an action. For example, if a webpage is loading, you would want to wait for it to completely load before attempting to click a button. </p>
	<code>robot.getPixelColor(x, y); </code> <p> Returns the color of the pixel x pixels from the left of the screen and y pixels from the top.</p>
	
<h2> Debugging </h2>
	<p> To easily get the x and y coordinates at a certain area on your screen, you can use this code. </p>
	<code>   
	while(true){ <br>
	int mouseY = MouseInfo.getPointerInfo().getLocation().y; <br>
        int mouseX = MouseInfo.getPointerInfo().getLocation().x; <br>
		System.out.println(mouseX + ", " mouseY); <br>
	}<br>
	</code>
	<p> This code, when run, will constantly print out the x and y coordinates of your mouse. </p>
<br><br>
<h2> Things to Try </h2>
<li> Create a program that randomly types a word after a certain amount of time </li>
<li> Create a program that automatically hits next episode on Netflix or plays the next video on Youtube</li>
<li> Create a program that automatically skips Youtube ads </li>
<li> Create a program that spams Facebook messages with text or the "Like" </li>
<li> Create a program that automatically extracts a zipped folder, and deletes the zip file after extraction. </li>
<br>
<h2> A Powerful Python Alternative </h2>
<p> If you are familiar with Python, you may want to check out pyautogui, a module that is more powerful than the Java Robot and even has image recognition capabilities. For more information check out this <a href= "http://pyautogui.readthedocs.io/en/latest/cheatsheet.html"> link. </a> </code>

<?php include('includes/footer.php'); ?>
