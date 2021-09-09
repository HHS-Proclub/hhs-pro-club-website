<?php 
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$pagetitle = 'Admin';
$pagedescription = 'so you no longer go url hunting';
include('includes/header.php'); 
?>

<b>Weekly things</b>
<ul>
    <li><a href="/post-problems/">Post challenge problems</a></li>
    <li><a href="/manage-problems/">Manage challenge problems</a></li>
    <li><a href="/post-news/">Post news</a></li>
    <li><a href="/mailing-list/">Mailing list</a></li>
    <li><a href="/users/">User database</a></li>
</ul>

<b>Workshop archive - 2015</b>
<ul>
    <?php 
    $workshops = json_decode(file_get_contents('content/workshop-archive.json'), true);
    foreach ($workshops as $workshop):
    ?>
    <li>
        <?php echo $workshop['name']; ?>
        <ul>
            <?php foreach ($workshop['links'] as $link): ?>
            <li><a href="<?php echo $link['url']; ?>" target="_blank"><?php echo $link['name']; ?></a></li>
            <?php endforeach; ?>
        </ul>
    </li>
    <?php endforeach; ?>
</ul>

<b>Workshop archive - 2014</b>
<ul>
    <?php 
    $workshops = json_decode(file_get_contents('content/workshop-archive2014.json'), true);
    foreach ($workshops as $workshop):
    ?>
    <li>
        <?php echo $workshop['name']; ?>
        <ul>
            <?php foreach ($workshop['links'] as $link): ?>
            <li><a href="<?php echo $link['url']; ?>" target="_blank"><?php echo $link['name']; ?></a></li>
            <?php endforeach; ?>
        </ul>
    </li>
    <?php endforeach; ?>
</ul>

<?php include('includes/footer.php'); ?>
