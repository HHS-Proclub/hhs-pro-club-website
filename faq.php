<?php 
$pagetitle = 'Challenge Problems FAQ';
$pagedescription = 'Any questions you may have about how to do challenge problems';
include('includes/header.php'); 
?>


<!DOCTYPE html>
<html>
<head>

	<title>Challenge Problems FAQ</title>
	<link rel = "stylesheet" type="text/css" href="custom.css" />
</head>
<body>
	<h1>Challenge Problem Frequently Asked Questions</h1> 

	<h3> Input and Output Format: </h3>
	<h4> &emsp; For Input: Use a scanner </h5>
	<h4> &emsp; For Output: Use a print statement to print information to the screen. </h5>
	<pre>
	<code>
	<i>

import java.util.Scanner;

public class HelloWorld { 
	
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in); <b> // This is input </b>
		  System.out.println("Please Print out your first name...");  <b> // This is output </b>
		  String fname = in.next();
	;}
} 
</i>
</code>
</pre>
	<br>
	<h3> Common Bugs: </h3>
	<ul>
		<p> Make sure to only output the solution. Do not include any System.out.println() statements unless it's a part of the answer.</p>
		<p> Do not include any package statements at the top of your class</p>
		<p> Make sure your class is named correctly</p>
	</ul>
	<br>
	<h3> Here is a common error you may encounter: </h3>
	<ul>
		<p> <b> Runtime Error: </b> This commonly occurs with <i> IndexOutOfBounds </i> exceptions where the index of the String or an array does not exist.  </p>
	</ul>
	<br>

	<h2> Here is an example piece of code for Java, Python, and C++ </h2>
	<h3> Java: </h3>

	<pre>
	<code>
import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.print(x*3);
	}

}

	</code>
	</pre>

	<h3> Python: </h3>
	<pre>
	<code>
	
	x = input();
	print(int(x)*3);

	</code>
	</pre>
	<h3> C++: </h3>

	<pre>
	<code>
#include &lt;iostream&gt;
using namespace std;

int main()
{
    int firstNumber, sumOfTwoNumbers;
    
    cout << "";
    cin >> firstNumber;

    // sum of two numbers in stored in variable sumOfTwoNumbers
    sumOfTwoNumbers = firstNumber + firstNumber + firstNumber;

    // Prints sum 
    cout << sumOfTwoNumbers;     

}

		
	</code>
	</pre>


	<br>
	<h4> If you have any other questions, feel free to email the officers at <i>officers@hhsprogramming.org </i></h4>
 
</body>
</html>

<?php include('includes/footer.php'); ?>