import java.util.Scanner;

public class PRB1 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numProblems = sc.nextInt();
		int firstNumbers[] = new int[numProblems];
		int secondNumbers[] = new int[numProblems];
		
		for(int i = 0; i < numProblems; i++)
		{
			Scanner reader = new Scanner(System.in);
			String line = reader.nextLine();
			String[] nums = line.split(" ");
			
			if(nums.length > 0)
			{
				firstNumbers[i] = Integer.parseInt(nums[0]);
			}
			else firstNumbers[i] = 0;

			if(nums.length > 1)
			{
				secondNumbers[i] = Integer.parseInt(nums[1]);
			}
			else secondNumbers[i] = 0;
		}
		
		for(int i = 0; i < numProblems; i++)
		{
			System.out.println(firstNumbers[i] + secondNumbers[i]);
		}
	}
}
