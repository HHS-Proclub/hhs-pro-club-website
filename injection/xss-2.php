<?php
$pagetitle = 'XSS Injection: Level 2';
$pagedescription = 'Learn XSS Injection';
include('../includes/header.php');
?>
    <h2>Task 2</h2>
    <div class="box one">
        Try to redirect a page with the following line of code
        <br/><br/>
        &lt;script type="text/javascript"&gt;&lt;!--window.location="url"//--&gt;&lt;/script&gt;
        <br/><br/>
        It should automatically leads you to whatever the url is.
    </div>



<?php include('../includes/footer.php'); ?>
