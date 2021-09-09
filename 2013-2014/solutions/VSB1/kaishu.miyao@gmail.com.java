import java.util.Scanner;
public class VSB1 {
	public static void main (String args[])
	{
		Scanner kbd = new Scanner (System.in);
		int n = kbd.nextInt();
		int sum = 0;
		for (int x = 1; x <= n; x++)
		{
			sum += x;
		}
		System.out.println (sum);
	}
}
