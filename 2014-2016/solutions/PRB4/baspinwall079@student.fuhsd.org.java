package game;

import java.util.Scanner;

public class PRB4 {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		long sum = 0;
		for(int x=0; x<4; x++)
		{
			sum+=s.nextInt();
		}
		System.out.println(recursive(sum));
		s.close();
	}
	
	private static long recursive(long n)
	{
		long output;
		if(n==1)
			return 1;
		output = recursive(n-1)*n;
		return output;
	}
}
