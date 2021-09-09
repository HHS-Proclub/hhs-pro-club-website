/* package whatever; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class PRB4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int i = sc.nextInt();
		
		for(int x = 1; x <= i; x++) {
			System.out.println(j*x);
		}
	}
}