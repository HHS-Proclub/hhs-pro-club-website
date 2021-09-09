/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		
		int sum = n1 + n2 + n3 + n4;
		BigInteger factorial = BigInteger.ONE;
		
		for (int i = 2; i <= sum; i++) {
			factorial = factorial.multiply(new BigInteger (""+i));
		}
		
		System.out.println(factorial);
	}
}