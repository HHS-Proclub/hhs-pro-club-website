/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			int n = in.nextInt();
			int k = in.nextInt();
			
			for (int j = 0; j < n; j++) {
				in.nextInt();
				in.nextInt();
			}
			
			long total = r*c;
			long factRect = factorial(total);
			long factNeeds = factorial(k);
			
			long denom = factNeeds * factorial(total - n);
			long comb = factRect / (denom == 0 ? factNeeds : denom );
			System.out.println(comb / k);
		}
	}
	
	public static long factorial (long n) {
		if (n < 3) return n;
		else return n * factorial(n-1);
	}
}