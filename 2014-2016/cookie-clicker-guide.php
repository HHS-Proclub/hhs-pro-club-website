<?php 
$pagetitle = 'Cookie Clicker Guide';
$pagedescription = 'Javascript project';
include('includes/header.php'); 
?>

<style>
	.one {
		margin-bottom: 15px;
	}
	pre {
		margin: 10px 0;
	}
</style>

	<div class="box one">
		Cookie Clicker is a game in which the player clicks a cookie to gain more cookies.
	</div>

    <div class="box one">
		<h2>1.) Setup</h2>
		Begin by creating the basic files needed:
		<ul>
			<li>index.html - where all the html will go to define the structure of the game</li>
			<li>script.js - for JavaScript</li>
			<li>style.css - css will make your game look nice</li>
		</ul>
    </div>

    <div class="box one">
    	<h2>2.) Basic html</h2>
    	In index.html, put the basic tags of any webpage:
    	<pre><code>&lt;!DOCTYPE&gt;
&lt;html&gt;
	&lt;head&gt;&lt;/head&gt;
	&lt;body&gt;&lt;/body&gt;
&lt;/html&gt;</code></pre>
    	Additionally, add script.js and style.css, with the &lt;script&lt; and &lt;link&lt; tags respectively, to load the files into the page. Put the link tag in the head tag and the javascript at the very bottom of the page.
    	<pre><code>&lt;link rel=&quot;stylesheet&quot; href=&quot;style.css&quot;&gt;
&lt;script src=&quot;script.js&quot;&gt;&lt;/script&gt;</code></pre> 
    </div>

    <div class="box one">
    	<h2>3.) Cookie Button</h2>
    	The most basic element the game needs is the main cookie button. Find a picture of your favorite type of cookie online, and copy the image url. Insert the image in the body tags. To easily keep track of this cookie in javascript, add an id to the image.
    	<pre><code>&lt;img src=&quot;cookie.png&quot; id="cookie"&gt;</code></pre>
    </div>

    <div class="box one">
    	<h2>4.) Clicking the Cookie</h2>
    	Something should happen each time the cookie is clicked. Create a variable in javascript to keep track of how many times the cookie has been clicked.
    	<pre><code>var cookieCount = 0;</code></pre>
    	The corresponding javascript event for a click is <b>onclick</b>. To specify what happens onclick for a specific element, in this case, the cookie, use the document.getElementById() function to get the cookie and store it in a variable.
    	<pre><code>var cookie = document.getElementByGetElementById("cookie");</code></pre>
    	What happens on the <b>onclick</b> event is a property of the cookie element, and is a function. The function is called every time the onclick event fires, which is every time the cookie is clicked. You can read more about the onclick event <a href="" target="_blank">here</a>.
    	<pre><code>cookie.onclick = function() {

}</code></pre>
		What should happen every time the cookie is clicked? The variable <b>clicks</b> that was defined earlier should be increased by one. For testing purposes, also alert the variable to make sure the code is working.
		<pre><code>cookie.onclick = function() {
	cookieCount++;
	alert(cookieCount);
}</code></pre>
		<i>At this point, make sure you understand everything done so far.</i>
    </div>

    <div class="box one">
    	<h2>5.) Displaying counts</h2>
    	Create an element in index.html to display how many cookies the player currently has.
    	<pre><code>&lt;p&gt;
    &lt;span id="count"&gt;0&lt;/span> cookies
&lt;/p&gt;</code></pre>
    	The text inside an html element is also a property of an html element in javascript. Again, first get the element with document.getElementById() and store it in a variable.
    	<pre><code>var countElement = document.getElementById("count");
    cookie.onclick = function() {
	cookieCount++;
}<code></pre>
    	The property is called <b>innerHTML</b>. Set the property to the value of the <b>count</b> variable every time the cookie is clicked.
    	<pre></code>cookie.onclick = function() {
	cookieCount++;
	countElement.innerHTML = cookieCount;
}</code></pre>
		Be sure to test your code!
    </div>

    <div class="box one">
    	<h2>6.) Cookies per second</h2>
    	In Cookie Clicker, items can be bought to passively gain cookies per second. The first type of item that can be bought is a cursor. Add some markup for this functionality:
    	<pre><code>&lt;div class="item" id="cursor">
	Cursors: &lt;span id="cursorCount">0&lt;/span>&lt;br>
	Cursor Cost: &lt;span id="cursorCost">10&lt;/span>&lt;br>
	&lt;input type="button" id="buyCursorBtn" value="Buy Cursor">
&lt;/div></code></pre>
		Store the values of cookies per second (cps), cursorCount, and cursorCost in variables:
		<pre><code>var cps = 0;
var cursorCount = 0;
var cursorCost = 0;</code></pre> 
		Just like adding an onclick function to the cookie, add an onclick function to the button to buy a cursor:
		<pre><code>document.getElementById("buyCursorBtn").onclick = function() {
	
}</code></pre>
		When the button is clicked, the cost of the cursor, which is 10 cookies, should be subtracted from the total cookies, and cursorCount should be increased by one. Additionally, cookies per second should increase.
		<pre><code>document.getElementById("buyCursorBtn").onclick = function() {
	if (cookieCount >= cursorCost) {
		cookieCount -= cursorCost;
		cursorCount++;
		cps++;
	}
}</code></pre>
		To passively add cookies per second to the total cookie count, use the <b>setInterval()</b> function. This function takes two arguments, the first one being a function, and the second being time in milliseconds of how often the function should run. In this case, every second, which is 1000 milliseconds, the value of cps should be added to cookieCount. Write this code outside of the onclick function, because cookies should be added continuously and not just onclick.
		<pre><code>setInterval(function() {
	cookieCount += cps;
},1000);</code></pre>
		So far, all of the variables are being updated in javascript, but the values on the html page have not been updated. Update the values displayed in the html elements by setting the innerHTML property.
		<pre><code>cursorCountElement = document.getElementById("cursorCount");
setInterval(function() {
	cookieCount += cps;
	countElement.innerHTML = cookieCount;
},1000);
document.getElementById("buyCursorBtn").onclick = function() {
	cookieCount -= cursorCost;
	countElement.innerHTML = cookieCount;
	cursorCount++;
	cursorCountElement.innerHTML = cursorCount;
	cps++;
}</code></pre>

	<i>Test your code and make sure you understand everything.</i>

    </div>

    <div class="box one">
    	<h2>7.) CSS</h2>
		So far, the game has been looking incredibly plain, for the exception of the picture of a delicious cookie. Add css to style.css to make everything look more legit, and add html if you need to.
    </div>

    <div class="box one">
    	
    </div>

<?php include('includes/footer.php'); ?>
