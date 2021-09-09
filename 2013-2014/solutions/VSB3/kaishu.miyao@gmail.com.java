import java.util.Scanner;
public class VSB3 {
	public static void main (String args[])
	{
		Scanner kbd = new Scanner (System.in);
		int n = kbd.nextInt(), m = kbd.nextInt();
		
		
		if (n > 12)
		{
			int hours = n - 12;
			System.out.println (hours + " " + m + " PM");
		}
		else 
			System.out.println (n + " " + m + " AM");
	}
}