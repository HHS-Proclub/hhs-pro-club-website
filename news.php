<?php
$pagetitle = 'News';
$pagedescription = 'Latest updates';
include('includes/header.php');
?>

<?php
$news_data = file_get_contents('content/news.json');
$news = json_decode($news_data, true);

// Sort news posts by date (most recent to oldest)
usort($news, function($a, $b) {
    $dateA = strtotime($a['year'] . '-' . $a['month'] . '-' . $a['date']);
    $dateB = strtotime($b['year'] . '-' . $b['month'] . '-' . $b['date']);
    return $dateB - $dateA; // Most recent dates first
});

$total = count($news);

// Display the first post
$post = $news[0];
echo '<div class="box-gray news">';
echo '    <h2>' . $post['title'] . '</h2>';
echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
echo $post['content'];
echo '</div>';

?>

<div class="cols-wrapper">

<?php
// Display the remaining posts
for ($i = 1; $i < $total; $i++) {
    $post = $news[$i];
    echo '<div class="box-gray news">';
    echo '    <h2>' . $post['title'] . '</h2>';
    echo '    <h4>' . $post['month'] . '/' . $post['date'] . '/' . $post['year'] . '</h4>';
    echo $post['content'];
    echo '</div>';
}
?>

</div>

<?php include('includes/footer.php'); ?>
