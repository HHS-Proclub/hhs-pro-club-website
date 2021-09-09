import java.util.Scanner;


public class PRA16 {
	public static String convert(int num, int base)
	{
		String str = "";
		int maxPow = 0;
		int maxPow2;
		int temp = base;
		while (temp < num)
		{
			temp *= base;
			maxPow++;
		}
		maxPow2 = maxPow;
		temp = base;
		while (num > 0)
		{
			int n = (int) Math.floor(num / Math.pow(temp, maxPow));
			num -= n * Math.pow(temp, maxPow);
			maxPow -= 1;
			if (n >= 10)
			{
				str += (char)(n + 55); //65-90
			}
			else
			{
				str += n + "";
			}
		}
		while (str.length() < maxPow2 + 1)
			str += "0";
		return str;
	}
	public static boolean isPalin(String str)
	{
		if (str.length() % 2 == 0)
		{
			int pos = 0;
			while (pos < str.length() / 2)
			{
				if (str.charAt(pos) != str.charAt(str.length() - 1 - pos))
					return false;
				pos++;
			}
			return true;
		}
		else
		{
			int pos = 0;
			while (pos < (str.length() - 1) / 2)
			{
				if (str.charAt(pos) != str.charAt(str.length() - 1 - pos))
					return false;
				pos++;
			}
			return true;
		}
	}
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		for (int i = 1; i <= 300; i++)
		{
			if (isPalin(convert(i * i, n)))
			{
				System.out.println(convert(i, n) + " " + convert(i * i, n));
			}
		}
	}
}
