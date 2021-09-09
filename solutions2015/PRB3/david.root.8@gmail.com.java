import java.util.Scanner;

public class PRB3 {

	public static void main (String[] args)
	{
		Scanner troll = new Scanner (System.in);
		long a = troll.nextLong();
		long b = troll.nextLong();
		long c = troll.nextLong();
		long d = troll.nextLong();
		long e = troll.nextLong();
		int n = 5;
		if (a > b && a > c && a > d && a > e)
		{
			System.out.println(a);
		}
		else if (b > a && b > c && b > d && b > e)
		{
			System.out.println(b);
		}
		else if (c > a && c > b && c > d && c > e)
		{
			System.out.println(c);
		}
		else if (d > a && d > b && d > c && d > e)
		{
			System.out.println(d);
		}
		else if (e > a && e > b && e > c && e > d)
		{
			System.out.println(e);
		}
	}
}
