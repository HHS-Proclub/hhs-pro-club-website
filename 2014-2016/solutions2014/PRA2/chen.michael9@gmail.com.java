import java.util.Scanner;


public class PRA2 {
	public static long recurse(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 2;
		}
		return recurse(n - 1) + recurse(n-2);
	}
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		System.out.println(recurse(n));
	}
}
