<?php
session_start();
if (!isset($_SESSION["user"]) || empty($_SESSION["user"]["officer"])) {
    die("Sorry, you do not have permission to view this page.");
}

$problems = json_decode(file_get_contents('content/problems.json', true));

if (isset($_POST['del']) && isset($_POST['pr'])) {
    unset($problems->{$_POST['pr']});
    return file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
}

if (isset($_POST['state']) && isset($_POST['pr'])) {
		$problems->{$_POST['pr']}->state = $_POST['state'];
    return file_put_contents('content/problems.json', json_encode($problems, JSON_PRETTY_PRINT));
}

$results = json_decode(file_get_contents("content/problem-results.json"), true);
$users = json_decode(file_get_contents("content/users.json"), true);
$users_names = array();

foreach ($users as $user) {
    $users_names[$user['email']] = htmlspecialchars($user['first'] . ' ' . $user['last']);
}

foreach ($problems as $id => &$problem) {
    $problem->results = [];
    if ($results[$id]) {
        foreach ($results[$id] as $email => $result) {
						$safeEmail = htmlspecialchars($email);
						$resultScore = $result['correct'] ? 100 : 0;
						if (array_key_exists('score', $result)) $resultScore = $result['score'];
						$hintUsed = false;
						if ($results['metadata'] && $results['metadata'][$id] && $results['metadata'][$id][$email] &&
							  array_key_exists('hintUsed', $results['metadata'][$id][$email])) {
							$hintUsed = $results['metadata'][$id][$email]['hintUsed'];
						}
						if (isset($users_names[$email])) {
							if (array_key_exists($users_names[$email], $problem->results) &&
								  $problem->results[$users_names[$email]]['score'] >= $resultScore) continue;
            	$problem->results[$users_names[$email]] = array (
								'email' => $safeEmail,
								'lang' => $result['lang'],
								'correct' => $result['correct'],
								'score' => $resultScore,
								'hint_used' => $hintUsed,
								'job_id' => $result['job_id'],
								'timestamp' => $result['timestamp']
							);
            }
            else {
              $problem->results[$safeEmail] = array (
								'email' => $safeEmail,
								'lang' => $result['lang'],
								'correct' => $result['correct'],
								'score' => $resultScore,
								'hint_used' => $hintUsed,
								'job_id' => $result['job_id'],
								'timestamp' => $result['timestamp']
							);
            }
        }
				
				// Add hint usage information
				if ($results['metadata'] && $results['metadata'][$id]) {
					foreach ($results['metadata'][$id] as $email => $metadata) {
						if (array_key_exists('hintUsed', $metadata) && $metadata['hintUsed']) {
							if (isset($users_names[$email])) {
								$username = $users_names[$email];
							} else {
								$username = $email;
							}
							if (!array_key_exists($username, $problem->results)) {
								$problem->results[$username] = array (
									'email' => $email,
									'correct' => false,
									'score' => -1,
									'hint_used' => true,
									'timestamp' => date('c')
								);
							}
						}
					}
				}
    }

		// Sort array by score
		uasort($problem->results, function($a, $b) {
			if ($a['score'] == $b['score']) {
				return ($a['timestamp'] < $b['timestamp']) ? -1 : 1;
			} else {
				return $b['score'] - $a['score'];
			}
		});
}

$pagetitle = 'Manage Problems';
$pagedescription = "View source code by clicking on results";
include('includes/header.php');
?>

<style>
    table {
        width: 100%;
    }
    td {
        line-height: 1;
    }
    .success, .fail {
        font-size: 12px;
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
        <td><a href="/problem?problem=<?php echo $pr; ?>&getAll" target="_blank"><?php echo $pr ?></a></td>
        <td><?php echo $problem->title; ?></td>
        <td id="<?php echo $pr; ?>">
            <select class="stateSel">
                <?php if ($problem->state != 'up' && $problem->state != 'down'): ?>
                    <option value="<?php echo $problem->state; ?>" selected><?php echo $problem->state; ?></option>    
                <?php endif; ?>
                <option value="up"<?php echo $problem->state==='up' ? ' selected': ''; ?>>up</option>
                <option value="down"<?php echo $problem->state==='down' ? ' selected': ''; ?>>down</option>
            </select>
        </td>
        <td>
        <?php 
        if ($problem->results) {
            foreach ($problem->results as $name => $result): ?>
						    <a href="<?php
								echo "/solutions/" . $pr . "/" . $result['email'] . ".";
								$currLang = "NO-SUBMISSION";
								if ($result['lang'] == 10) $currLang = "java";
								else if ($result['lang'] == 44) $currLang = "cpp";
								else if ($result['lang'] == 116) $currLang = "py";
								echo $currLang;
								?>" target="_blank">
                    <span class="<?php echo $result['correct'] ? 'success' : 'fail'; ?>">
                        <?php echo $name . ' (' . ($result['score'] == -1 ? 'DNS' : $result['score']);
												  if ($result['hint_used']) {
														echo ', Hint';
													}
													echo ')';
												?><br>
                    </span>
								</a>
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
				if (!confirm('Are you sure you want to delete this problem?')) return;
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
