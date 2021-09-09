<?php
$pagetitle = 'Make Your Own Game';
$pagedescription = 'Programming Club\'s third workshop!';
include('../includes/header.php');
?>
<style>
.hidden {
	visibility:hidden;
}
</style>

<h2>What are we doing?</h2>
<br/>
<p>Through a proclub-coded template, we are creating an awesome two-player game! This workshop is very open-ended, and you can do anything you want with it. However, we will be providing resources and challenges to guide you through if you have less experience!</p>

<br/>
<br/>
<br/>

<h2>How do I get started?</h2>
<p>You can get started by downloading our zip file by <a href="https://github.com/hhs-programming-club/MakeYourOwnGame">clicking here</a>. You can download this zip file from Github by clicking on the green button that says "clone or download" on the right side of the screen, and selecting "Download Zip".
<br/><br/>
Unzip the zip file, then drag everything from the zip file's src folder into your src folder. Then, drag core.jar into your project folder (NOT the src folder) and right click -> build path -> add to build path.
</p>

<br/>
<br/>
<br/>

<h2>The Classes, Explained.</h2>
<p>There are five classes located in the zip file.</p>
<h4>Main.java</h4>
<p>Main.java is the class that is executed when the program is run. Don't worry about the code in it for now; a lot of it is pretty complex.</p>
<br/>
<h4>DrawingSurface.java</h4>
<p>DrawingSurface.java is the main class we're going to do everything in. Here the key ideas in this class:</p>
<h5>Fields/Constructor</h5>
<p>The fields and constructors are located at the top of this class. The fields are an ArrayList of keys, which checks for which keyboard key is pressed. The next two fields are player objects. Finally, there's the bullet ArrayList, which stores every bullet in the game.There's a field that represents a platform, or a barrier, which we will be (potentially) adding in later on. The final two fields are unused; it's up to you how you want to use them!</p>
<p>In the constructor, we are just initializing these fields to their default/initial states.</p>
<h5>draw()</h5>
<p>This method is called 30 times per second (or 30 frames per second). Here, we are drawing every object on screen, and we are checking for key presses for player movement.</p>
<h5>keyPressed(), keyReleased(), checkKey()</h5>
<p>These three methods handle key presses. All pressed keys are stored in an ArrayList, and the player moves based on this ArrayList (as seen in the draw method).</p>
<br/>
<h4>Player.java</h4>
<p>The Player.java class is a player object. It has an x, y, width, height, and direction currently; you may want to add new fields to it in the future (such as health)!</p>
<p>So far, the player's methods include methods to move, scale, draw, and shoot. You will probably add to these methods in the future, like collision with barrier objects.</p>
<br/>
<h4>Bullet.java</h4>
<p>This object represents the individual bullet on screen. The code that manages the movement is in the draw() method (since it's called 30 times/second).</p>
<br/>
<h4>Barrier.java</h4>
<p>The Barrier.java class is a barrier object. It was an x, y, width, and height, and like the player, it can only move. You will add to this in the future.</p>

<br/>
<br/>
<br/>

<h2>What's Next?</h2>
<p>Obviously, this game is incomplete! Your job is to complete this game.
<br/>
There are so many things you can do! Do you want to make it a two player top-down shooter game? Do you want to implement enemies? It's totally up to you! This workshop is 100% open ended.
<br/>
However, if you want us to guide you a bit more, we've written up a bunch of challenges that would guide you toward creating an awesome two-player shooter game.</p>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>1. Add Movement!</h2>
<h5>Make it so that the player moves after each key is pressed.</h5>
<br/>
<a href="javascript:revealClick('reveal1')" id="reveal1button" class="btn">Reveal Hint</a>
<br/>
<h6 class="hidden" id="reveal1">There are two things that you have to do in order to make this movement proper.
1) Set the direction of the player to face the way you pressed. You can do this with player.setDirection(), with a parameter of Player.RIGHT, Player.LEFT, etc.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>2. Colors!</h2>
<h5>Change the color of the players and the bullet so that it's actually distinguishable.</h5>
<br/>
<a href="javascript:revealClick('reveal2')" id="reveal2button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal2">HINT: You will be working in the draw() method. You may need to find a way to distinguish between the two players (maybe add a parameter in the draw() method?).</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>3. Bullet Delay</h2>
<h5>Add a delay to shooting bullets so that players can't just hold down the space bar.</h5>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>4. Make the Game Make More Sense</h2>
<h5>Currently, p1 can only shoot up; p2 can only shoot down. This makes for a lot of broken gameplay. Modify the game so that the game makes sense.</h5>
<h6>This challenge is very open-ended! It's totally up to you.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>5. Add Bullet Collision</h2>
<h5>Make it so that, when the bullets collide with each player, they disappear from the screen.</h5>
<br/>
<a href="javascript:revealClick('reveal3')" id="reveal3button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal3">HINT: The shooting is already done for you. You can check collision with each bullet and if it collides with the player in the DrawingSurface class.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>6. Health</h2>
<h5>Add health to each player and display this health.</h5>
<br/>
<a href="javascript:revealClick('reveal4')" id="reveal4button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal4">HINT: Try making a new field in the player class, and a method that subtracts health. You should also find a way to display this. Finally, have the player die (implemented in the previous challenge) once the health hits 0.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>7a. Background</h2>
<h5>Add a background image to the game so that it's not that boring white.</h5>
<br/>
<a href="javascript:revealClick('reveal5')" id="reveal5button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal5">HINT: Try taking a look at the Processing documentation for images by <a href="https://processing.org/reference/">clicking here</a>. Processing is the framework we're using to render the drawings and such. You can search for "image" on that page. You will be drawing the images in the draw() method in DrawingSurface.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>



<h2>7b. Graphics</h2>
<h5>Replace the ugly, drawn squares and circles with actual images.</h5>
<br/>
<a href="javascript:revealClick('reveal6')" id="reveal6button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal6">HINT: Try taking a look at the Processing documentation for images by <a href="https://processing.org/reference/">clicking here</a>. Processing is the framework we're using to render the drawings and such. You can search for "image" on that page. You will be drawing the images in the draw() methods in your class.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>8. Powerups!</h2>
<h5>Add powerups to the game.</h5>
<br/>
<h6>TIP: This challenge is open ended, and 100% up to you!</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>9. Barriers</h2>
<br/>
<h5>Implement barriers into the game! Make them functional, and give them a cool texture!</h5>
<br/>
<a href="javascript:revealClick('reveal7')" id="reveal7button" class="btn">Reveal Hint</a>
<h6 class="hidden" id="reveal7">HINT: You will need to work with collision for this, whether it's with the player, or with the bullet. This means you'll probably have to update the Player class and the Bullet class along with the Barrier and the DrawingSurface class.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<h2>10. Artificial Intelligence</h2>
<br/>
<h5>Remove the second player, replacing it with an enemy with an AI of any type.</h5>
<h6>TIP: This challenge is open-ended! Be creative.</h6>

<br/>
<br/>
<hr/>
<br/>
<br/>

<script>
	function revealClick(string){
		$("#" + String(string)).css("visibility", "visible")
		$("#" + String(string) + "button").remove()
	}
</script>


<?php include('../includes/footer.php'); ?>
