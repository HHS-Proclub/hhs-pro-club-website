<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$competitions = file_get_contents("content/competitions.json");

if (isset($_POST['competitions'])) {
    if ($data = json_encode($_POST['competitions'])) {
    	file_put_contents('content/competitions.json', $_POST['competitions']);
    	header("Location: /manage-competitions");
        echo '<script>alert("Updated");</script>';
    }
    else {
        echo '<script>alert("Invalid json");</script>';
    }
}

$pagetitle = 'Manage Competitions';
$pagedescription = "";
include 'includes/header.php';
?>

<form method="post">

<textarea rows="100" name="competitions">
<?php echo $competitions; ?>
</textarea>

<input type="submit" value="Update">

</form>

<?php include 'includes/footer.php'; ?>