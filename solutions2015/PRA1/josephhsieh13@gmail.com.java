import java.util.Scanner;

public class PRA1 {
	public static void main (String[] args)
	{
		int x = 1;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2; i <= n; i++)
		{
			if (isPrime(i))
			{
				x *= i;
			}
		}
		System.out.println(toBaseEight(x));
		
	}
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static String toBaseEight(int n)
	{
		return Integer.toOctalString(n);
	}
}
