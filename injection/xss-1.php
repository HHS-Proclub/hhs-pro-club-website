<?php
$pagetitle = 'XSS Injection: Level 1';
$pagedescription = 'Learn XSS Injection';
include('../includes/header.php');
?>
    <h2>Task 1</h2>
    <div class="box one">
        Find a website that can be exposed by xss injection.
        <br/><br/>
        To do so, first find a website that has any form of user input such as a login box.
        <br/><br/>
        Enter the following code: &lt;script&gt;alert('XSS')&lt;/script&gt;
        <br/><br/>
        If a text box appears with the word XSS, then this site can be subject to xss injection.
    </div>



<?php include('../includes/footer.php'); ?>
