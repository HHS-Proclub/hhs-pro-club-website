/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner (System.in);
		int[] arr = {in.nextInt(), in.nextInt(), in.nextInt()};
		int n = in.nextInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			Arrays.sort(arr);
			sum += arr[arr.length-1];
			arr[arr.length-1]--;
		}
		
		System.out.println(sum);
	}
}