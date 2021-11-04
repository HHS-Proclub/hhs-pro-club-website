<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$problems = json_decode(file_get_contents('content/problems.json'), true);
$problem = $problems[$_GET['pr']];
if (!$problem) die($_GET['pr'] . ' does not exist.');

if (isset($_POST['pr']) && isset($_POST['title']) && isset($_POST['state'])) {
    $prob = $_POST['pr'];
    unset($_POST['pr']);
    if (isset($_FILES['inputFile'])) {
        move_uploaded_file($_FILES['inputFile']['tmp_name'], 'test-data/' . $prob . '.in');
        unset($_POST['inputFile']);
    } 
    if (isset($_FILES['outputFile'])) {
        move_uploaded_file($_FILES['outputFile']['tmp_name'], 'test-data/' . $prob . '.out');
        unset($_POST['outputFile']);
    }
		// Change this maybe!!!
    foreach ($_POST as $key => $value) $_POST[$key] = $_POST[$key]; //str_replace("\r\n", "<br>", $_POST[$key]);
    $problems[$prob] = $_POST;
    file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
    header("Location: /manage-problems");
}

$pagetitle = 'Edit Problem';
$pagedescription = $_GET['pr'];
include('includes/header.php');
?>

<style>
.shorter {
    height: 100px;
}
</style>

        <form method="post" enctype="multipart/form-data">
            <div class="box one-half">
                <p>
                    <label for="pr">PR</label><br>
                    <input type="hidden" name="pr" value="<?php echo $_GET['pr']; ?>">
                    <input type="text" name="pr" placeholder="PRA8, PRB5, etc" value="<?php echo $_GET['pr']; ?>" disabled>
                </p>
                <p>
                    <label for="title">Title</label><br>
                    <input type="text" name="title" value="<?php echo $problem['title']; ?>" required>
                </p>
                <p>
                    <label for="type">Type</label><br>
                    <input type="radio" name="type" value="Beginner"<?php echo $problem['type']=='Beginner' ? ' checked' : ''; ?>> Beginner<br>
                    <input type="radio" name="type" value="Intermediate"<?php echo $problem['type']=='Intermediate' ? ' checked' : ''; ?>> Intermediate<br>
                    <input type="radio" name="type" value="Advanced"<?php echo $problem['type']=='Advanced' ? ' checked' : ''; ?>> Advanced
                </p>
                <p>
                    <label for="state">State</label><br>
                    <input type="radio" name="state" value="up"<?php echo $problem['state']=='up' ? ' checked' : ''; ?>> up<br>
                    <input type="radio" name="state" value="down"<?php echo $problem['state']=='down' ? ' checked' : ''; ?>> down<br>
                    <input type="radio" name="state"> other: <input type="text" value="<?php echo $problem['state']!='up' && $problem['state']!='down' ? $problem['state'] : ''; ?>">
                    <script>
                        document.currentScript.previousElementSibling
                                .addEventListener("blur", function () {
                            this.previousElementSibling.value = this.value;
                        });
                    </script>
                </p>
                <p>
                    <label for="blurb">Blurb</label><br>
                    <input type="text" name="blurb" value="<?php echo $problem['blurb']; ?>" required>
                </p>
                <p>
                    <label for="description">Description</label><br>
                    <textarea name="description" required><?php echo $problem['description']; ?></textarea>
                </p>
								<p>
							      <label for="hints">Hints (Leave blank for no hints)</label>
									  <textarea name="hints" class="shorter"><?php echo $problem['hints']; ?></textarea>
								</p>
            </div>
            <div class="box one-half last-child">
                <p>
                    <label for="inputForm">Input format</label><br>
                    <textarea name="inputForm" class="shorter" required><?php echo $problem['inputForm']; ?></textarea>
                </p>
                <p>
                    <label for="sampleInput">Sample input</label><br>
                    <textarea name="sampleInput" class="shorter" required><?php echo $problem['sampleInput']; ?></textarea>
                </p>
                <p>
                    <label for="outputForm">Output format</label><br>
                    <textarea name="outputForm" class="shorter" required><?php echo $problem['outputForm']; ?></textarea>
                </p>
                <p>
                    <label for="sampleOutput">Sample output</label><br>
                    <textarea name="sampleOutput" class="shorter" required><?php echo $problem['sampleOutput']; ?></textarea>
                </p>
                <p>
                    <label for="inputFile">Input test case (PRname.in)</label>
                    <input type="file" name="inputFile">
                </p>
                <p>
                    <label for="outputFile">Test case output (PRname.out)</label>
                    <input type="file" name="outputFile">
                </p>
            </div>
            <!-- ohlook tis a center tag -->
            <center><input type="submit" class="btn" value="Update"></center>
        </form>

<?php include('includes/footer.php'); ?>
