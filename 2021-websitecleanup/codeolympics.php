<?php
// header("Location: /roundup2016");
$pagetitle = 'Code Olympics';
$pagedescription = 'Compete and win prizes!';
include('includes/header.php');




$target_dir = "uploads/";
$target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
$uploadOk = 1;
$imageFileType = pathinfo($target_file,PATHINFO_EXTENSION);
// Check if image file is a actual image or fake image
if(isset($_POST["submit"])) {
    
    if($imageFileType != "java") {
        echo "Error: only .java files are allowed.";
    $uploadOk = 0;
    }
    // Check if file already exists
    if (file_exists($target_file)) {
    echo "Error: file already exists.";
    $uploadOk = 0;
    }
    
    
    // Check if $uploadOk is set to 0 by an error
    if ($uploadOk == 0) {
    echo "Error: your file was not uploaded.";
        // if everything is ok, try to upload file
    } else {
        if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $target_file)) {
            echo "The file ". basename( $_FILES["fileToUpload"]["name"]). " has been uploaded.";
        } else {
            echo "Error: upload failed.";
        }
    }
}
?>

    <div class="row">
        <!--<div class="box one-half">
		Welcome to HHS Programming Club! <br/><br/> Are you a new coder interested in learning how to program? Maybe, you're an experienced programmer looking to enter competitions? Regardless, Homestead's Programming Club is perfect for you! <br/><br/> Here we teach members new programming concepts while aiding them through individualized projects, competitions, and of course, hosting fun socials and events!<br/><br/><br/>
		<div class="button-wrapper">
			<a href="join" class="btn">Become a member!</a>
			<a href="https://goo.gl/forms/q3EOsqEh7s0I26cA2" class="btn">Take the survey!</a>
		</div>
	</div>
	<div class="box-gray one-half last-child">
		LATEST NEWS<br><br>
		
	</div>-->

        <br/>
        <div class="row">
            <div class="box one-half">
                <h1>Beginner Round 1</h1>
                <a href="https://docs.google.com/document/d/1Y4MP2hzZAbUiUYmduNuf7sFjZHYEVvuGtyk0pPGaGdw">Round 1 Problems</a>
                <!--<a href="https://docs.google.com/document/d/1s3gdAyWTYzvh8oOfRo56LsgQOA9BblCjS81hfrov_T0">Round 2 Problems</a>-->
                <!--<a href="https://docs.google.com/document/d/1Y4MP2hzZAbUiUYmduNuf7sFjZHYEVvuGtyk0pPGaGdw">Round 3 Problems</a>-->
                <p>Remember to name your file <b>(TeamName)BegR(Round #)P(Problem #).java</b>!<br/>
                Example: PumpkinPiBegR1P1.java<br/></p>
                <h4>Good luck!</h4>
            </div>
            <div class="box-gray one-half last-child">
                <form method="post" enctype="multipart/form-data">
                    <h2>Beginner Round 1 Problem 1:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
                <form method="post" enctype="multipart/form-data">
                    <br/>
                    <h2>Beginner Round 1 Problem 2:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
                <form method="post" enctype="multipart/form-data">
                    <br/>
                    <h2>Beginner Round 1 Problem 3:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
            </div>
        </div>

        <h1>---</h1>

        <div class="row">
            <div class="box one-half">
                <h1>Advanced Round 1</h1>
                <a href="https://docs.google.com/document/d/1kr4Tnniru0IEg7fSGk-_vvWKayAlDIsYLz1IdyUO_EA">Round 1 Problems</a>
                <!--<a href="https://docs.google.com/document/d/133V8TjvuSk5xYmsGV7pjFaLe0a3Oz5CfTvGqyb71B7Q">Round 2 Problems</a>-->
                <!--<a href="https://docs.google.com/document/d/1hZ-og1xmIoICMLrxsKxjuExZvynaca7-TThvwtY-3v4">Round 3 Problems</a>-->
                <p>Remember to name your file <b>(TeamName)AdvR(Round #)P(Problem #).java</b>!<br/>
                Example: PumpkinPiAdvR1P1.java<br/></p>
                <h4>Good luck!</h4>
            </div>
            <div class="box-gray one-half last-child">
                <form method="post" enctype="multipart/form-data">
                    <h2>Advanced Round 1 Problem 1:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
                <form method="post" enctype="multipart/form-data">
                    <br/>
                    <h2>Advanced Round 1 Problem 2:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
                <form method="post" enctype="multipart/form-data">
                    <br/>
                    <h2>Advanced Round 1 Problem 3:</h2>
                    <input type="file" name="fileToUpload" id="fileToUpload">
                    <input type="submit" value="Upload File" name="submit" class="btn">
                </form>
            </div>
        </div>
    </div>


    <!---->



    <?php include('includes/footer.php'); ?>