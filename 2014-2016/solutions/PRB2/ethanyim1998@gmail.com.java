import java.util.Scanner;

public class PRB2 
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int lowerBound = in.nextInt();
		int higherBound = in.nextInt();
		
		int denom = 0;
		int sum = 0;
		for (int i = lowerBound + 1; i < higherBound; i++)
		{
			if (i > 0)
			{
				sum += i;
				denom++;
			}
		}
		
		System.out.println(sum/(double)denom);
	}
}
