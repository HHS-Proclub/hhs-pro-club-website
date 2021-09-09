<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$pagetitle = 'Users';
$pagedescription = "database";
include('includes/header.php');
?>

<style>
    table {
        width: 100%;
    }
    td {
        padding: 5px 8px;
    }
    thead tr {
        background: #222;
        color: #eee;
    }
    tbody tr {
        background: #eee;
    }
</style>

<table>
    <thead>
        <tr>
            <td></td>
            <td>Username</td>
            <td>First name</td>
            <td>Last name</td>
            <td>Grade</td>
            <td>Email</td>
            <td>Asb</td>
        </tr>

    </thead>


<?php
$users = json_decode(file_get_contents('content/users.json'),true);
$i = 1;
foreach ($users as $username=>$user):
?>

<tr>
    <td><?php echo $i++; ?></td>
    <td><?php echo $username; ?></td>
    <td><?php echo $user['first']; ?></td>
    <td><?php echo $user['last']; ?></td>
    <td><?php echo $user['grade']; ?></td>
    <td><a href="mailto:<?php echo $user['email']; ?>" target="_blank"><?php echo $user['email']; ?></a></td>
    <td><?php echo $user['asb']; ?></td>
</tr>

<?php endforeach; ?>
</table>



<?php
foreach ($users as $username=>$user):
    echo $user['first'] . ' ' . $user['last']; ?>
    <br>
<?php
endforeach;
?>

<?php include('includes/footer.php'); ?>
