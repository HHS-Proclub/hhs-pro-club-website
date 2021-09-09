import java.util.Scanner;
public class PRB5 {
	public static long getTwos(long n)
	{
		int x=2;
		long twos=0;
		while ((n % x)<= 0)
		{
			twos=twos+1;
			x=x*2;
		}
		return(twos);
	}
	public static long getFives(long n)
	{
		int x=5;
		long fives=0;
		while ((n % x)<= 0)
		{
			fives=fives+1;
			x=x*5;
		}
		return(fives);
	}
	public static void main(String[] args)
	{	
		Scanner kboard = new Scanner(System.in);
		int testcases = kboard.nextInt();
		for (int i=0;i<=testcases-1;i++)
		{
		long n = kboard.nextInt();
		long k= kboard.nextInt();
		if (k>getTwos(n))
		{
			n= (long)(n * Math.pow(2.0,(double)(k-getTwos(n))));
		}
		if (k>getFives(n))
		{
			n= (long)(n * Math.pow(5.0,(double)(k-getFives(n))));
		}
		System.out.println(n);
		}
	}
}