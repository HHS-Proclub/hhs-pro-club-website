/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kboard = new Scanner(System.in);
		int a = Integer.parseInt(kboard.nextLine());
		int b = Integer.parseInt(kboard.nextLine());
		int c = Integer.parseInt(kboard.nextLine());
		int[] d = {a, b, c};
		int n = Integer.parseInt(kboard.nextLine());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			Arrays.sort(d);
			ans += d[2];
			d[2] -= 1;
		}
		System.out.println(ans);
	}
}