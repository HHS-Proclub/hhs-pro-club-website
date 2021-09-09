import java.text.ParseException;
import java.util.Scanner;


public class PRB4 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int x = Integer.parseInt(kboard.next());
		String[] ans = new String[1000];
		for (int i = 0; i < x; i++)
		{
			String str = kboard.next();
			int n = (int)(str.charAt(0));
			if (n == 97 || n == 101 || n == 105 || n == 111 || n == 117)
			{
				ans[i] = str + "way";
			}
			else
			{
				ans[i] = str.substring(1) + str.charAt(0) + "ay";
			}
		}
		for (int i = 0; i < x; i++)
		{
			System.out.println(ans[i]);
		}
	}
}
