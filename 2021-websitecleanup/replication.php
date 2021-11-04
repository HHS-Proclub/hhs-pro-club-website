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
        box-shadow: 0px 1px 0px 0px #eee inset, 35px 0px 0px 6px #dfdfdf inset, -10px 0px 0px 6px #dfdfdf inset;
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
            <a href="img/1.png" target="_blank"><img src="img/11.png"></a>
        </div>
    </div>
    <div class="box one-half last-child">
        <h2>#1</h2>
        Your markup should be like this:
        <pre><code>&lt;h1&gt;Some &lt;i&gt;sample italicized&lt;/i&gt; and unitalicized text&lt;/h1&gt;
&lt;img src=&quot;img.jpg&quot; width=&quot;480px&quot;/&gt; 
&lt;p&gt;&lt;a href=&quot;http://website.com&quot;&gt;This sentence is a link!&lt;/a&gt; 
	But the rest of the text is not a link.
&lt;/p&gt;</code></pre>
    </div>
</div>
<br><br>
<div class="row">
    <div class="box one-half">
        <div class="window">
            <a href="img/2.png" target="_blank"><img src="img/21.png"></a>
        </div>
    </div>
    <div class="box one-half last-child">
        <h2>#2</h2>
        Your markup should be like this:
        <pre><code>&lt;div class=&quot;bar&quot;&gt; Title &lt;/div&gt; 
&lt;div class=&quot;container-fluid&quot;&gt;
&lt;div class=&quot;row&quot;&gt;
	&lt;div class=&quot;col-md-4 left header&quot;&gt;
		&lt;h1&gt;Left Column&lt;/h1&gt; 
	&lt;/div&gt;
	&lt;div class=&quot;col-md-4 right header&quot;&gt; 
		&lt;h1&gt;Right Column&lt;/h1&gt; 
	&lt;/div&gt; 
&lt;/div&gt; 
&lt;div class=&quot;row&quot;&gt; 
	&lt;div class=&quot;col-md-4 left paragraph&quot;&gt;
		Lorem ipsum dolor
	&lt;/div&gt; 
	&lt;div class=&quot;col-md-4 right paragraph&quot;&gt; 
		Consectetur adipiscing elit. &lt;/div&gt;
	&lt;/div&gt;
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
		&lt;div&gt;&lt;ul&gt;
			&lt;li&gt;&lt;a href=&quot;#&quot;&gt;One&lt;/a&gt;&lt;/li&gt;
			&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Two&lt;/a&gt;&lt;/li&gt;
			&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Three&lt;/a&gt;&lt;/li&gt;
			&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Four&lt;/a&gt;&lt;/li&gt;
			&lt;li&gt;&lt;a href=&quot;#&quot;&gt;Five&lt;/a&gt;&lt;/li&gt;
		&lt;/ul&gt;&lt;/div&gt;
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

<div class="row">
    <div class="box one-half">
        <div class="window">
            <a href="img/1.png" target="_blank"><img src="img/11.png"></a>
        </div>
    </div>
    <div class="box one-half last-child">
        <h2>#4</h2>
        Create a cookie clicker project in Javascript!
    </div>
</div>

<?php include('includes/footer.php'); ?>