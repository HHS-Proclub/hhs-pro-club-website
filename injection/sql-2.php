<?php 
$pagetitle = 'SQL Injection: Level 2';
$pagedescription = 'Learn SQL Injection';
include('../includes/header.php'); 
?>
    <h2>What is Web Injection?</h2>
    <div class="box one">
		Almost every other week we hear something in the news about a large company or a popular website having a vulnerability. This workshop serves to instruct on a two of the many techniques used by hackers and security enthusiasts alike when penetrating a website: XSS and SQL Injection. <a href="https://github.com/FallibleInc/security-guide-for-developers/blob/master/vulnerabilities-stats.md">Popular estimates</a> of depict that nearly 25% of websites are vulnerable to one of these two attacks. In order to build web applications immune to these attacks, it is important to first learn a little bit about how these attacks work.
    </div>

    <?php

        $dbFile = './sql-2.sqlite';
        if(!isset($_POST['username']) or !isset($_POST['pass'])){
            if (file_exists($dbFile)) {
                unlink($dbFile);
            }
            initSQLiteDB($dbFile);
            
        ?>
            <br/><h3 style="background:#eee; padding:10px;">
                <b>Goal: </b>Find the credentials to the 'admin' account.
            </h3><br/><br/>

            <center><form action="" method="post">
                <table>
                    <tr>
                        <td>Search: </td>
                        <td>
                            <input type="text" name="search">
                        </td>
                    </tr>
                </table>
                    <br/><br/>
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
                This one is a little trickier. If I try to use the same SQL injection as last time, I see that it doesn't work! It seems like the programmer is <i>escaping strings</i> or turning the illegal characters I was using last time into legal characters for SQL to interpret. So instead of confusing SQL into allowing me in, I'm just getting a broken query.<br/><br/>
                
                It looks like they didn't do that for the search box about fruit though. I wonder if I could somehow access the username/password information in my search box query... 
            </div>

        <?php
        } else {
            
            $db = new SQLite3($dbFile);
            $u = SQLite3::escapeString ($_POST['username']);
            $p = SQLite3::escapeString ($_POST['pass']);
            
            $f = $_POST['search'];
            
            $query2  = "SELECT name, descr FROM fruits WHERE name LIKE '%$f%'";
            echo  "<b>Search Query Result</b>"
                . "<div style='background:#eee;padding:5px 10px 5px 10px;'>"
                . "<span style='color:#444;'>SELECT name, descr FROM fruits WHERE name LIKE '%</span>"
                . "<span style='color:#e74c3c;'><b>$f</b></span>"
                . "<span style='color:#444;'>%'</span>"
                . "</div><br/>";
            
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
                echo "<br/><div style='margin-righ  t:10%;margin-left:10%;background:#eee; padding:5px 10px 5px 10px;'><h3><b>Uh oh!</b> There was an error in your query. Perhaps double check your single quotation marks? <a href='http://hhsprogramming.com/injection/sql-2.php'>Try again</a>?</h3></div>";
            } else { 
                $data = array();
                while ($res = $result->fetchArray(1)){
                    array_push($data, $res);
                }


                if(count($data) == 0){
                    echo  "<center><div style='background:#eee;width:400px;height:100px;padding-top:25px;'>"
                        . "<h3>Login Failure! <a href='http://hhsprogramming.com/injection/sql-2.php'>Try again?</a></h3>"
                        . "</div></center><br/>";
                } else {
                    echo  "<center><div style='background:#eee;width:400px;height:100px;padding-top:25px;'>"
                        . "<h3>Login Success! <a href='http://hhsprogramming.com/injection/'>Continue!</a></h3>"
                        . "</div></center><br/>";
                }
            }
                        
            $result = $db->query($query2);
            if(!$result){
                echo "<br/><div style='margin-righ  t:10%;margin-left:10%;background:#eee; padding:5px 10px 5px 10px;'><h3><b>Uh oh!</b> There was an error in your SEARCH query. We were unable to get you any results for that <a href='http://hhsprogramming.com/injection/sql-2.php'>Try again</a>?</h3></div>";
            } else { 
                echo "<br/><br/><b>Search Results:</b><br/>"
                    . "<center><table style='border-collapse: collapse; border-style: hidden;'>";
                $data = array();
                while ($res = $result->fetchArray(1)){
                    array_push($data, $res);
                }
                
                

                if(count($data) == 0){
                    echo  "<h3>No Results Found!</h3>";
                } else {
                    foreach($data as $result) {
                        echo "<tr ><td style='border: 2px solid lightgray;'>" . $result['name'] . "</td><td >" . $result['descr'] . "</td></tr>";
                    }
                    
                }
                
                echo "</table></center>";
            }
            
            
        }
    ?>
	
<?php include('../includes/footer.php'); ?>

<?php 

    function initSQLiteDB($file){
        $db = new SQLite3($file);

        $db->exec('CREATE TABLE users (ID INT PRIMARY KEY NOT NULL, username TEXT NOT NULL, pass TEXT NOT NULL)');
       
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (1, 'admin', 'P455W0RD!')   ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (2, 'Soham', 'isCool')   ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (3, 'DJ', 'Khal3d')    ");
        $db->exec(" INSERT INTO users (ID, username, pass) VALUES (4, 'Pr0gr4mm1ng', 'Club') ");    
        
        
        
        $db->exec('CREATE TABLE fruits (ID INT PRIMARY KEY NOT NULL, name TEXT NOT NULL, descr TEXT NOT NULL)');
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (1, 'orange', 'Oranges are orange')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (2, 'apple', 'Apples are red')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (3, 'banana', 'Bananas are yellow')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (4, 'blueberry', 'Blueberries are blue')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (5, 'peach', 'Peaches are peach')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (6, 'strawberry', 'Strawberries are pink')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (7, 'raspberry', 'Raspberry are purple')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (8, 'grapefruit', 'Grapefruit are light orange')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (9, 'lemon', 'Lemons are yellow')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (10, 'lime', 'Limes are green')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (11, 'cantaloupe', 'Cantaloupes are yellow')   ");
        
        $db->exec(" INSERT INTO fruits (ID, name, descr) VALUES (12, 'watermelon', 'Watermelons are tasty')   ");

    }

?>