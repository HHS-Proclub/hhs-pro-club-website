<?php
if (isset($_POST['email'])) {
    file_put_contents('emails.txt', $_POST['email'].',', FILE_APPEND);
}
?>

<!doctype html>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='http://fonts.googleapis.com/css?family=Oswald:400|Open+Sans:400' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/style.css">
    <title>Email Roundup</title>
</head>

<body>

<div class="photo"></div>
<div class="photo-overlay"></div>

<div class="wrapper">
    <div class="container">
        <img src="img/logo.png" class="logo">
        <h1>Coding. Competitions. Socials. Interested?</h1>
        <form autocomplete="off" method="post" id="emailForm">
            <input type="email" id="email" name="email" placeholder="Email" autocomplete="off" autofocus>
            <input type="submit" id="submit-btn" value="Submit">
        </form>
    </div>
</div>

<script type="text/javascript" src="js/script.js"></script>

</body>

</html>
