import java.util.ArrayList;
import java.util.Scanner;

public class PRB3 {

	static public void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int numbersToTest = scanner.nextInt();
		for(int i = 0; i < numbersToTest; i++)
		{
			int testNum = scanner.nextInt();
			ArrayList divisors = new ArrayList();
			for(int j = 1; j <= testNum; j++)
			{
				if(testNum%j == 0)
				{
					//divisors.add(j);
					System.out.println(j);
				}
			}
			
		}
		
	}
	
	
}
