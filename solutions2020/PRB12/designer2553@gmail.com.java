/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		
		for (int i = 0; i < times; i++) {
			String str = in.next();
			System.out.println(str.substring(0, str.length()/2));
		}
	}
}