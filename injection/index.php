<?php
$pagetitle = 'Injection';
$pagedescription = 'Learn SQL Injection';
include('../includes/header.php');
?>
    <h2>What is Web Injection?</h2>
    <div class="box one">
		Almost every other week we hear something in the news about a large company or a popular website having a vulnerability. This workshop serves to instruct on a two of the many techniques used by hackers and security enthusiasts alike when penetrating a website: XSS and SQL Injection. <a href="https://github.com/FallibleInc/security-guide-for-developers/blob/master/vulnerabilities-stats.md">Popular estimates</a> of depict that nearly 25% of websites are vulnerable to one of these two attacks. In order to build web applications immune to these attacks, it is important to first learn a little bit about how these attacks work.
    </div>

    <div class="row">
	    <div class="box one-half">
	    	<h2>SQL Injection</h2>
	    	Structured Query Language (a.k.a. SQL) is a commonly used language for accessing a database and displaying information on the interface. SQL Injection can be used to login as other users, run OS level commands, and display private information.
            <br/><br/>
            It is a code injection technique where specific SQL queries are entered into an input field. This can allow the attacker to spoof their identity, modify/view existing data, and cause various other security threats. This type of injection exploits a vulnerability when using SQL, that must be specifically accounted for when writing code for your website. The exploitation most commonly uses string literal escape characters in SQL queries to access the database. This works because SQL treats the input as part of the query, not an actual string, so it can run whatever the attacker wants, and potentially leave out later checks for things like passwords.To fix this, you would escape the quotes so that SQL knows to treat the input as a string.
            <br/><br/>
            Find out more in our tutorial series:
            <br/><br/>
            <a href="./sql-1.php" class="btn">SQL 1</a>
            <a href="./sql-2.php" class="btn">SQL 2</a>
            <a href="./sql-3.php" class="btn">SQL 3</a>
	    </div>
	    <div class="box one-half last-child">
	        <h2>XSS Injection</h2>
	        Cross-site scripting (XSS) is an injection attack that allows an attacker to execute malicious code in another user's browser. Most often, attackers aim to run JavaScript on an administrator's account to gain access rights or on a regular user's account to gain private information.
            <br/><br/>
            Similar to SQL injection, XSS Injection also utilizes input fields to access information. Instead of SQL queries, however, it uses HTML script tags to exploit a site. Similar to SQL injection, if the user input doesn’t escape the input strings, it may be vulnerable to XSS injection, as the attacker may put a script tag to run their own code in the site. XSS injections can also appear in the query part of a URL, where when the search parameter is displayed in the code, the script tag will subsequently run. However, XSS injections are not just limited to input fields and queries; they can show up in anything a website may parse such as logs, emails, etc. The way to fix it is simple; escape the string so that the website doesn’t think it’s JavaScript code that it needs to execute.
            <br/><br/>
            Find out more in our tutorial series:
            <br/><br/>
            <a href="./xss-1.php" class="btn">XSS 1</a>
            <a href="./xss-2.php" class="btn">XSS 2</a>
            <a href="./xss-3.php" class="btn">XSS 3</a>
	    </div>
	</div>

<?php include('../includes/footer.php'); ?>
