/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int max = 0;
			int candies = in.nextInt();
			
			for (int j = 1; candies > 0; j++) {
				candies -= j;
				
				if (candies >= 0)
					max++;
				
			}
			System.out.println(max);
		}
	}
}