/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for (int c = 0; c < cases; c++) {
			String n = in.next();
			byte[] bs = n.getBytes();
			
			int a = 0;
			while (a < bs.length-1) {
				if (bs[a] < bs[a+1]) break;
				a++;
			}
			
			if (a >= bs.length-1) {
				Arrays.sort(bs);
				String s = (char)bs[0] + new String(bs);
				System.out.println(s);
			} else {
				int b = a+1;
				while (b < bs.length) {
					if (bs[b] < bs[a]) {
						break;
					}
					b++;
				}
				b--;
				
				byte ab = bs[a];
				bs[a] = bs[b];
				bs[b] = ab;
				
				byte[] newArr1 = Arrays.copyOfRange(bs, a+1, bs.length);
				Arrays.sort(newArr1);
				String s = new String(bs, 0, a+1) + new String(newArr1);
				System.out.println(s);
			}
		}
	}
}