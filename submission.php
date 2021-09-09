<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$pagetitle = 'Problem Submission';
$pagedescription = "";
include('includes/header.php');
?>