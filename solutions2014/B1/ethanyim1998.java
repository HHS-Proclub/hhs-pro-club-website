import java.util.Scanner;


//Fun with Pi

public class B1 
{
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int howManyTerms = scanner.nextInt();
		int testCases[] = new int[howManyTerms];
		
		for (int i = 0; i < howManyTerms; i ++)
		{
			testCases[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < howManyTerms; i++)
		{
			String x = "" + getNumber(testCases[i]);
			int dotIndex = x.indexOf(".");
			double answer;
			
			if (testCases[i] == 1)
			{
				System.out.println(1);
			}
			else if (x.length() > 15)
			{
				String newX = x.substring(dotIndex, dotIndex + 16);
				answer = Double.parseDouble(newX);
						
				if (Integer.parseInt(x.substring(dotIndex + 16, dotIndex + 17)) >= 5)
					answer = Double.parseDouble(newX) + .000000000000001;
				
				System.out.println(answer);
			}
			else
			{
				String newX = x.substring(dotIndex);
				answer = Double.parseDouble(newX);
				
				int roundOrNot = Integer.parseInt(newX.substring(newX.length()-1, newX.length()));
				if (roundOrNot >= 5)
				{
					double adder = 1;
					for (int j = 0; j < newX.length()-1; i++)
					{
						adder /= 10;
					}
					answer = Double.parseDouble(newX) + adder;
				}
				
				System.out.println(answer);
			}
			

				
		}
		
	}
	
	private static double getNumber(int termNum)
	{
		boolean plus = false;
		double sum = 1;
		int denom = 3;
		
		for (int i = 0; i < termNum - 1; i++)
		{
			if (plus)
				sum += 1.0/(denom);
			else
				sum -= 1.0/(denom);
			
			denom += 2;
			plus = !plus;
		}
		return sum;
	}
}
