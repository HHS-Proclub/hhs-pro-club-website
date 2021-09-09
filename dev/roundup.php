<?php

if (isset($_POST['email'])) {
    file_put_contents('roundup.txt', $_POST['email'].',', FILE_APPEND);
}

?>

<!doctype html>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='http://fonts.googleapis.com/css?family=Oswald:400|Open+Sans:400' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="/css/roundup.css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <title>HHS Programming</title>
</head>

<body>

<div class="photo"></div>
<div class="photo-overlay"></div>

<div class="logo-wrapper">
    <img src="/img/logo-white-text.png" class="logo">
</div>

<div class="wrapper">
    <div class="container">
        <img src="/img/logo-white-text.png" class="logo">
        <h1>Coding. Competitions. Socials. Interested?</h1>
        <form autocomplete="off">
            <input type="email" id="email" name="email" placeholder="Email" autocomplete="off">
            <input type="submit" id="submit" value="Submit">
        </form>
    </div>
</div>

</body>

</html>

<script type="text/javascript">
$(document).ready(function() {
    $('#submit').on('click',function(e) {
        var input = $('#email').val();
        if(input.indexOf('@')==-1 || input.indexOf('.')==-1) {
            $('#email').val('Invalid email!');
            $('#email').css('background','rgba(200,0,0,0.7)');
            $('#email').css('color','#fff');
            setTimeout(function() {
                $('#email').val('');
                $('#email').css('background','rgba(255,255,255,0.9)');
                $('#email').css('color','#222');
            },1000);
        }
        else {
            $.ajax({
                url: '/roundup.php',
                method: 'post',
                data: {
                    email: input
                },
                success: function() {
                    $('#email').val('Added!');
                    $('#email').css('background','rgba(0,0,0,0.7)');
                    $('#email').css('color','#fff');
                    setTimeout(function() {
                        $('#email').val('');
                        $('#email').css('background','rgba(255,255,255,0.9)');
                        $('#email').css('color','#222');
                    },1000);
                }
            })
        }
        e.preventDefault();
    });
});
</script>
