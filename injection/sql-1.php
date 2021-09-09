<?php 
$pagetitle = 'SQL Injection: Level 1';
$pagedescription = 'Learn SQL Injection';
include('../includes/header.php'); 
?>
    <h2>What is SQL Injection?</h2>
    <div class="box one">
		The idea behind and SQL injection is to enter valid input which changes the SQL Query to do something in your favor. If you are unfamiliar with the SQL language, we recommend you take a quick look <a href="https://www.w3schools.com/sql/">here</a>. Behind the scenes, the programmer has created a query with a prebuilt structure. He is inserting your inputs into the query before it executes. The trick to SQL injection is to insert something which changes the query. First try entering a random username and password.
    </div>

    <?php

        $dbFile = './sql-1.sqlite';
        if(!isset($_POST['username']) or !isset($_POST['pass'])){
            if (file_exists($dbFile)) {
                unlink($dbFile);
            }
            initSQLiteDB($dbFile);
            
        ?>
            <br/><h3 style="background:#eee; padding:10px;">
                <b>Goal: </b>Gain access to the 'admin' account.
            </h3><br/><br/>
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
            </form></center><br/>


            <h2>Hint</h2> 
            <div class="box one">
                This is a classic example of SQL Injection. Consider what a typical login query might look like. How could you exploit that just by inputting text into the text field? What characters are meaningful in SQL? 
            </div>

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
            if(!$result){
                echo "<br/><div style='margin-righ  t:10%;margin-left:10%;background:#eee; padding:5px 10px 5px 10px;'><h3><b>Uh oh!</b> There was an error in your query. Perhaps double check your single quotation marks? <a href='http://hhsprogramming.com/injection/sql-1.php'>Try again</a>?</h3></div>";
            } else { 
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