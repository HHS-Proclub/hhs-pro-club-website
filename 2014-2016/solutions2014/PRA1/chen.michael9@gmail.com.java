import java.util.Scanner;


public class PRA1 {
	static int gcd(int x, int y)
	{
		int r;
		while (y != 0)
		{
			r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String str = kboard.next();
		String str2 = kboard.next();
		int n = 0, n2 = 0;
		for (int i = 0; i < 4; i++)
		{
			char c = str.charAt(i);
			if (Character.isDigit(c))
				n += (((int)c) - 48) * Math.pow(16, 3 - i);
			else
				n += (((int)c) - 55) * Math.pow(16, 3 - i);
		} //65-90
		for (int i = 0; i < 4; i++)
		{
			char c = str2.charAt(i);
			if (Character.isDigit(c))
				n2 += (((int)c) - 48) * Math.pow(16, 3 - i);
			else
				n2 += (((int)c) - 55) * Math.pow(16, 3 - i);
		}
		int result = gcd(n, n2);
		System.out.println(result);
		String r = "";
		int current = 4096;
		while (result > 0)
		{
			int x = 0;
			while (result >= current)
			{
				result -= current;
				x++;
			}
			current /= 16;
			if (x >= 10)
				r += (char)(x + 55);
			else
				r += x + "";
		}
		System.out.println(r);
	}
}
