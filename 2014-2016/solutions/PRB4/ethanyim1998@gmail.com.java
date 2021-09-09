import java.util.Scanner;

public class PRB4 
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		int sum = 0;
		long factorial = 1;
		for (int i = 0; i < 4; i++)
		{
			sum += s.nextInt();
		}
		
		for (int i = sum; i > 0; i--)
		{
			factorial *= i;
		}
			
		System.out.println(factorial);
	}
}
