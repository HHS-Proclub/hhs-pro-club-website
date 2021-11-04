<?php 
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$pagetitle = 'Admin';
$pagedescription = 'so you no longer go url hunting';
include('includes/header.php'); 
?>

<b>Admin Tasks</b>
<ul>
    <li><a href="/post-problems/">Post challenge problems</a></li>
    <li><a href="/manage-problems/">Manage challenge problems</a></li>
		<!-- <li><a href="http://judgelite.westus2.cloudapp.azure.com/" target="_blank">View recent submissions</a> (Secret key: PRO_SECRET_L1GHTJUDG3)</li> -->
    <li><a href="/post-news/">Post General News</a></li>
    <li><a href="/post-gwc/">Post GWC News</a></li>
    <li><a href="/mailing-list/">Mailing List</a></li>
    <li><a href="/users/">User Database</a></li>
    <li><a href="/offset-user/">Add Leaderboard Points</a></li>
</ul>

<b>Workshop archive - 2016</b>
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

<b>Workshop archive - 2015</b>
<ul>
    <?php 
    $workshops = json_decode(file_get_contents('content/workshop-archive2015.json'), true);
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
