<?php
    echo md5("orange" . $_SERVER['REMOTE_ADDR']) . "<br/>";

    if (isset($_GET['cmd']) && strlen($_GET['cmd']) <= 5) {
        echo "Executing: " . ($_GET['cmd']) . "<br/>";
    } else if (isset($_GET['reset'])) {
        echo "Executing: " . ('/bin/rm -rf ' . $sandbox). "<br/>";
    }

?>