import java.util.Scanner;


public class PRA6 {
	private static int n;
	public static String change(String str)
	{
		String s = "";
		String s2 = "";
		int n = 0;
		while (n < str.length())
		{
			char c = str.charAt(n);
			int x = n+1;
			int y = 1;
			while (x < str.length() && str.charAt(x) == c)
			{
				x++;
				n++;
				y++;
			}
			n+=1;
			s += y + "" + c;
		}
		for (int i = 0; i < s.length(); i++)
		{
			s2 += s.charAt(s.length() - 1 - i);
		}
		return s2;
	}
	public static String recurse()
	{
		int count = 1;
		String str = "1";
		while (count < n)
		{
			str = change(str);
			count++;
		}
		return str;
	}
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		n = kboard.nextInt();
		System.out.println(recurse());
	}
}
