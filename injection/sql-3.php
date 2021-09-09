<?php 
$pagetitle = 'SQL Injection: Level 3';
$pagedescription = 'Learn SQL Injection';
include('../includes/header.php'); 
?>
    <h2>What is Web Injection?</h2>
    <div class="box one">
		Almost every other week we hear something in the news about a large company or a popular website having a vulnerability. This workshop serves to instruct on a two of the many techniques used by hackers and security enthusiasts alike when penetrating a website: XSS and SQL Injection. <a href="https://github.com/FallibleInc/security-guide-for-developers/blob/master/vulnerabilities-stats.md">Popular estimates</a> of depict that nearly 25% of websites are vulnerable to one of these two attacks. In order to build web applications immune to these attacks, it is important to first learn a little bit about how these attacks work.
    </div>

    <?php

        $dbFile = './sql-1.sqlite';
        if(!isset($_POST['username']) or !isset($_POST['pass'])){
            if (file_exists($dbFile)) {
                unlink($dbFile);
            }
            initSQLiteDB($dbFile);
            
        ?>
            <center><form action="" method="post">
                <table>
                    <tr>
                        <td>User</td>
                        <td><input type="text" name="username"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="pass"></td>
                    </tr>
                </table>
                <input type="submit" value="Submit" name="submit">
            </form></center>

        <?php
        } else {
            
            $db = new SQLite3($dbFile);
            $u = $_POST['username'];
            $p = $_POST['pass'];
            
            $query  = "SELECT username, pass FROM users WHERE username='$u' AND pass='$p'";
            echo  "<b>Query Result</b>"
                . "<div style='background:#eee;padding:5px 10px 5px 10px;'>"
                . "<span style='color:#444;'>SELECT username, pass FROM users WHERE username=' </span>"
                . "<span style='color:#e74c3c;'><b>$u</b></span>"
                . "<span style='color:#444;'> ' AND pass=' </span>"
                . "<span style='color:#e74c3c;'><b>$p</b></span>"
                . "<span style='color:#444;'> '</span>"
                . "</div><br/>";
            
            
            $result = $db->query($query);
            $data = array();
            while ($res = $result->fetchArray(1)){
                array_push($data, $res);
            }
            
            
            if(count($data) == 0){
                echo  "<center><div style='background:#eee;width:400px;height:100px;padding-top:25px;'>"
                    . "<h3>Login Failure! <a href='http://hhsprogramming.com/injection/sql-1.php'>Try again?</a></h3>"
                    . "</div></center><br/>";
            } else {
                echo  "<center><div style='background:#eee;width:400px;height:100px;padding-top:25px;'>"
                    . "<h3>Login Success! <a href='http://hhsprogramming.com/injection/'>Continue!</a></h3>"
                    . "</div></center><br/>";
            }
            
        }
    ?>
	
<?php include('../includes/footer.php'); ?>

<?php 

    function initSQLiteDB($file){
        $db = new SQLite3($file);

        $db->exec('CREATE TABLE users (ID INT PRIMARY KEY NOT NULL, username TEXT NOT NULL, pass TEXT NOT NULL)');
       
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (1, 'admin', 'S3cr3t')   ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (2, 'Soham', 'isCool')   ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (3, 'Coder', 'isFun')    ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (4, 'User1', 'asdfasdf') ");    
    }

?>