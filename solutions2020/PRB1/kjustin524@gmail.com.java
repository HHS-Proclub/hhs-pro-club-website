import java.util.Scanner;

public class PRB1 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int numTrials = sc.nextInt();
		int[] results = new int[numTrials];
		
		for(int i = 0; i < numTrials; i++)
		{
			int candies = sc.nextInt();
			
			int count = 1;
			int result = 0;
			int candiesLeft = candies;
			while(candiesLeft - count >= 0)
			{
				candiesLeft -= count;
				result++;
				count++;
			}
			
			results[i] = result;
		}
		
		for(int i : results)
		{
			System.out.println(i);
		}
	}
}
