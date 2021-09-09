<?php
$target_dir = "uploads/";
$target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
$uploadOk = 1;
$imageFileType = pathinfo($target_file,PATHINFO_EXTENSION);
// Check if image file is a actual image or fake image
if(isset($_POST["submit"])) {
$check = getimagesize($_FILES["fileToUpload"]["tmp_name"]);
$uploadOk = 1;

// Check if file already exists
if (file_exists($target_file)) {
echo "<p>Error: File already exists.</p>";
$uploadOk = 0;
}

// Check file size
if ($_FILES["fileToUpload"]["size"] > 50000000) {
echo "<p>Error: Your file is too large. [Max size: 50MB]</p>";
$uploadOk = 0;
}

// Check if $uploadOk is set to 0 by an error
if ($uploadOk == 0) {
echo "<p>Error: Your file was not uploaded.</p>";
// if everything is ok, try to upload file
} else {
if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $target_file)) {
echo "<p>The file ". basename( $_FILES["fileToUpload"]["name"]). " has been uploaded.</p>
<p>You can re-download your file by visiting <a href='uploads/".basename($_FILES["fileToUpload"]["name"])."'>this link</a>, or going to the link <a href='uploads/".basename($_FILES["fileToUpload"]["name"])."'>http://hhsprogramming.com/did/uploads/".basename($_FILES["fileToUpload"]["name"])."</a></p>";
} else {
echo "<p>Error: There was an error uploading your file.<p/>";
}
}
}
?>
