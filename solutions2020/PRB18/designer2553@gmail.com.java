/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int words = in.nextInt();
		
		Main: for (int w = 0; w < words; w++) {
			String word = in.next();
			
			for (int a = 0; a < word.length()-1; a++) {
				for (int b = a+2; b <= word.length(); b++) {
					String sub = word.substring(a, b);
					
					if (sub.substring(0, sub.length()/2).equals(sub.substring(sub.length()/2))) {
						System.out.println("not square-free");
						continue Main;
					}
				}
			}
			
			System.out.println("square-free");
		}
	}
}