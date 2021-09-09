<?php 
session_start();
if (($_SESSION["user"]['officer']) != TRUE) {
    die("Sorry, you do not have permission to view this page.");
}

$pagetitle = 'Admin';
$pagedescription = 'post probs/news';
include('hackathonIncludes/header.php');
?>

<b>Post Probs</b>
<ul>
    <li><a href="/post-problems.php">Post challenge problems</a></li>
    <li><a href="/post-ctf.php">Post CTF problems</a></li>
    <li><a href="/post-news/">Post Activity</a></li>
    <li><a href="/offset-user/">Offset User</a></li>
</ul>
