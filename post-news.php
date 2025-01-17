<?php

session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

if (isset($_POST['title']) && isset($_POST['day']) && isset($_POST['content'])) {
    // Split the 'day' field into day, month, and year
    list($day, $month, $year) = preg_split('[/.-]', $_POST['day']);

    // Create the news entry
    $news_entry = [
        'title' => $_POST['title'],        // Title of the news post
		'content' => $_POST['content'],    // Content of the news post
		'year' => intval($year),           // Extracted year
		'month' => intval($month),         // Extracted month
        'date' => intval($day)             // Extracted day
        
           

    ];

    // Read the existing JSON file
    $news_data = file_get_contents('content/news.json');
    $news = json_decode($news_data, true);

    // Add the new entry to the beginning of the array
    array_unshift($news, $news_entry);

    // Write the updated array back to the JSON file
    $news_f = fopen("content/news.json", "r+");
    fwrite($news_f, json_encode($news, JSON_PRETTY_PRINT));
    fclose($news_f);

    // Redirect to the news page after saving
    header("Location: /news");
    exit;
}

// Page metadata
$pagetitle = 'Post News';
$pagedescription = "Yeah, now there's a GUI for it";
include('includes/header.php');
?>

<div class="box-gray one-half">
    <form method="post">
        <p>
            <label for="title">Title</label><br>
            <input type="text" name="title" required>
        </p>
        <p>
            <label for="day">Date</label><br>
            <input type="date" name="day" required>
        </p>
        <p>
            <label for="content">Content</label><br>
            <textarea name="content" placeholder="Write content here (you can include HTML links like <a href='URL'>text</a>)" required></textarea>
        </p>
        <center><input type="submit" class="btn" value="Post"></center>
    </form>
</div>

<?php include('includes/footer.php'); ?>

