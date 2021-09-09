/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		int nums = s.nextInt();
		int[] theNums = new int[nums];
		
		for (int i = 0; i < theNums.length; i++) {
			theNums[i] = s.nextInt();
		}
		
		Arrays.sort(theNums);
		System.out.println(theNums[theNums.length-1]);
	}
}