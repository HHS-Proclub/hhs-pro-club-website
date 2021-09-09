import java.util.Scanner;


public class PRA8 {
	private static boolean isPerfectSquare(long n)
	{
	  if (n < 0)
	    return false;

	  long tst = (long)(Math.sqrt(n) + 0.5);
	  return tst*tst == n;
	}
	private static int[] factor(int n)
	{
		int[] array = new int[2];
		int count = 0;
		int count1 = 0;
		for (int i = 1; i < n /2 + 1; i++)
		{
			if (n % i == 0)
			{
				if (i % 2 == 0 && isPerfectSquare(i))
					count1++;
				count++;
			}
		}
		array[0] = count;
		array[1] = count1;
		return array;
	}
	public static long gcm(long a, long b) {
	    return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
	}
	public static String asFraction(long a, long b) {
	    long gcm = gcm(a, b);
	    return (a / gcm) + "/" + (b / gcm);
	}
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		String[] str = new String[1000];
		for (int i = 0; i < num; i++)
		{
			int n = kboard.nextInt();
			int[] array = factor(n);
			if (array[1] == 0)
				str[i] = 0 + "";
			else
				str[i] = asFraction(array[1], array[0]);
		}
		for (int i = 0; i < num; i++)
		{
			System.out.println(str[i]);
		}
	}
}
