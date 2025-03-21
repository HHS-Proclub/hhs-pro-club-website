<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$problems = json_decode(file_get_contents('content/problems.json', true));

if (isset($_POST['del']) && isset($_POST['pr'])) {
    unset($problems->$_POST['pr']);
    return file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
}

if (isset($_POST['state']) && isset($_POST['pr'])) {
    $problems->$_POST['pr']->state = $_POST['state'];
    return file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
}

$results = json_decode(file_get_contents("content/problem-results.json"), true);
$users = json_decode(file_get_contents("content/users.json"), true);
$users_names = array();

foreach ($users as $user) {
    $users_names[$user['email']] = $user['first'] . ' ' . $user['last'];
}

foreach ($problems as $id => &$problem) {
    $problem->results = new stdClass;
    if ($results[$id]) {
        foreach ($results[$id] as $email => $result) {
            $problem->results->$users_names[$email] = $result['correct'];
        }
    }
}

$pagetitle = 'Manage Problems';
$pagedescription = "";
include('includes/header.php');
?>

<style>
    table {
        width: 100%;
    }
    .success {
        color: green;
    }
    .fail {
        color: red;
    }
</style>

<table>
    <thead>
        <tr>
            <td>PR</td>
            <td>Title</td>
            <td>State</td>
            <td>Results</td>
            <td>Actions</td>
        </tr>
    </thead>
    <tbody>
    <?php foreach ($problems as $pr => &$problem): ?>
    <tr>
        <td><a href="/problems/<?php echo $pr; ?>/" target="_blank"><?php echo $pr ?></a></td>
        <td><?php echo $problem->title; ?></td>
        <td id="<?php echo $pr; ?>">
            <select class="stateSel">
                <option value="up"<?php echo $problem->state=='up' ? ' selected': ''; ?>>up</option>
                <option value="down"<?php echo $problem->state=='down' ? ' selected': ''; ?>>down</option>
            </select>
        </td>
        <td>
        <?php 
        if ($problem->results) {
            foreach ($problem->results as $name => $correct): ?>
                <span class="<?php echo $correct ? 'success' : 'fail'; ?>">
                    <?php echo $name; ?><br>
                </span>
            <?php endforeach; 
        }
        ?>
        </td>
        <td id="<?php echo $pr ?>"><a href="/edit-problem/<?php echo $pr; ?>/">Edit</a> / <a href="#" class="del">Delete</a></td>
    </tr>
    <?php endforeach; ?>
    </tbody>
</table>

<script>
var dels = document.getElementsByClassName('del');
for (var i=0; i<dels.length; i++) {
    dels[i].addEventListener('click', function(e) {
        e.preventDefault();
        var pr = e.target.parentNode.id;
        var xhr = new XMLHttpRequest();
        xhr.onload = function() {
           var row = document.getElementById(pr).parentNode;
           row.parentNode.removeChild(row);
        }
        xhr.open('POST', '');
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.send('del=1&pr='+pr);
    });
}
    

var selects = document.getElementsByClassName('stateSel');
for (var i=0; i<selects.length; i++) {
    selects[i].addEventListener('change', function(e) {
        e.preventDefault();
        var pr = e.target.parentNode.id;
        var state = this.value;
        var xhr = new XMLHttpRequest();
        /*xhr.onload = function() {
            console.log(this);
        }*/
        xhr.open('POST', '');
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.send('state='+state+'&pr='+pr);
    });
}
</script>
