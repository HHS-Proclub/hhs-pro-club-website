<?php 
$pagetitle = 'HTML/CSS practice';
$pagedescription = 'Design replication';
include('includes/header.php'); 
?>

<style>
.window {
  width: 100%;
  //height: 200px;
  overflow: hidden;
}
.window:before {
  content: "\a0\a0• • •";
  display: block;
  height: 20px;
  background: #fff;
  color: #888;
  line-height: 20px;
  border: 1px solid #ccc;
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
  box-shadow: 0px 1px 0px 0px #eee inset,
				     35px 0px 0px 6px #dfdfdf inset, 
				     -10px 0px 0px 6px #dfdfdf inset;
}
.window img {
  width: 100%;
}
</style>


    <div class="box one">
		Try to replicate the following designs in HTMl/CSS.
    </div>

    <div class="row">
	    <div class="box one-half">
	    	<div class="window">
	    		<a href="img/1.png" target="_blank"><img src="img/1.png"></a>
	    	</div>
	    </div>
	    <div class="box one-half last-child">
	    	<h2>#1</h2>
			Your markup should be like this:
			<pre><code>&lt;div&gt;
	&lt;h2&gt;&lt;/h2&gt;
	&lt;div class=&quot;box&quot;&gt;&lt;/div&gt;
&lt;/div&gt;</code></pre>
	    </div>
	</div>
<br><br>
    <div class="row">
	    <div class="box one-half">
	    	<div class="window">
	    		<a href="img/2.png" target="_blank"><img src="img/2.png"></a>
	    	</div>
	    </div>
	    <div class="box one-half last-child">
	    	<h2>#2</h2>
	    	Your markup should be like this:
	    	<pre><code>&lt;div&gt;

	&lt;h2&gt;Unfunctional Login&lt;/h2&gt;
	
	&lt;div&gt;
		&lt;input type=&quot;text&quot; placeholder=&quot;Name&quot;&gt;
		&lt;input type=&quot;password&quot; placeholder=&quot;Password&quot;&gt;
		&lt;input type=&quot;submit&quot; class=&quot;button&quot;&gt;
	&lt;/div&gt;

&lt;/div&gt;</code></pre>

	    </div>
	</div>
<br><br>
    <div class="row">
	    <div class="box one-half">
	    	<div class="window">
	    		<a href="img/3.png" target="_blank"><img src="img/3.png"></a>
	    	</div>
	    </div>
	    <div class="box one-half last-child">
	    	<h2>#3</h2>
			Your markup should be like this, but you should add better content:
			<pre><code>&lt;header&gt;
	&lt;h1&gt;asdfasdf&lt;/h1&gt;
&lt;/header&gt;
	
&lt;div&gt;
	
	&lt;div&gt;
		&lt;h2&gt;Sections&lt;/h2&gt;
		&lt;div&gt;
			&lt;ul&gt;
				&lt;li&gt;&lt;a href=&quot;#&quot;&gt;One&lt;/a&gt;&lt;/li&gt;
				&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Two&lt;/a&gt;&lt;/li&gt;
				&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Three&lt;/a&gt;&lt;/li&gt;
				&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Four&lt;/a&gt;&lt;/li&gt;
				&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Five&lt;/a&gt;&lt;/li&gt;
			&lt;/ul&gt;
		&lt;/div&gt;
	&lt;/div&gt;

	&lt;div&gt;
		&lt;h2&gt;One&lt;/h2&gt;
		&lt;div&gt;asdf&lt;/div&gt;

		&lt;h2&gt;Two&lt;/h2&gt;
		&lt;div&gt;asdfasdf&lt;/div&gt;

		&lt;h2&gt;Three&lt;/h2&gt;
		&lt;div&gt;asdfasdfasdf&lt;/div&gt;

		&lt;h2&gt;Four&lt;/h2&gt;
		&lt;div&gt;asdfasdfasdfasdf&lt;/div&gt;

		&lt;h2&gt;Five&lt;/h2&gt;
		&lt;div&gt;asdfasdfasdfasdfasdf&lt;/div&gt;
	&lt;/div&gt;

&lt;/div&gt;</code></pre>
	    </div>
	</div>

<?php include('includes/footer.php'); ?>
