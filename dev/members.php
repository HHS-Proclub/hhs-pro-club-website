<?php 
$pagetitle = 'Members';
$pagedescription = 'The community';
include('includes/header.php'); 
?>

<?php 
$members_data = file_get_contents('../users.json');
$members = json_decode($members_data, true);

$i = 0;
foreach ($members as $member) {
	if ($i%2==0)
		echo '<div class="box-gray one-half">';
	else
		echo '<div class="box-gray one-half last-child">';
	echo $member['first'] . ' ' . $member['last'];
	echo '</div>';
	$i++;
}

?>

<?php include('includes/footer.php'); ?>