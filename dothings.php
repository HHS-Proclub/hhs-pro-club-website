<?php

$users = json_decode(file_get_contents("content/users.json"), true);
$new_users = [];
foreach ($users as $username => $userdata) {
  // Only allow English names
  if (preg_match('/^[a-zA-Z0-9._@ ]+$/', $username)) {
    $new_users[$username] = $userdata;
  }
}
file_put_contents("content/users.json", json_encode($new_users, 
JSON_PRETTY_PRINT));

?>
