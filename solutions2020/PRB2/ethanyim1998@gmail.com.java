import java.util.Scanner;


public class PRB2 
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++)
		{
			sum += in.nextInt();
		}
		
		System.out.println(sum);
	}
	
}
