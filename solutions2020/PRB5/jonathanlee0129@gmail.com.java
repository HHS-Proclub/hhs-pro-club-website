import java.util.Scanner;

public class PRB5 {
	
	public int getTestCases()
	{
		Scanner scanObject = new Scanner (System.in);
		int testCases = scanObject.nextInt();
		return testCases;
	}
	
	public static void main(String[] args) {
		Scanner scanObject = new Scanner (System.in);
		PRB5 scan = new PRB5();
		int testCases = scan.getTestCases();
		int times = testCases;
		int answers [] = new int[times];
		for(int m = 0; m < times; m++)
		{
		    testCases = 0;
			String input = scanObject.nextLine();    
			String[] numbers = input.split(" ");
			int[] numbers1 = new int[numbers.length];
			for(int i = 0;i < 2;i++)
			{			   
				numbers1[i] = Integer.parseInt(numbers[i]);
			}
			int numOfZeros = numbers1[1];
			int test = numbers1[0 ];
			int test1 = test;
			int test2 = 0;
			int counter = 0;
			int i = 1;
	
			while(counter< numOfZeros)
			{
					
				test = test1;
				counter = 0;
				i++;
				test *=i;
				test2 = test;
				while (test % 10 == 0) 
				{
				    counter++;
				    test /= 10;  
				}
				
				
			}
	
			answers[m] = test2;		
		}
		
		for(int l = 0; l<times; l++)
		{
			System.out.println(answers[l]);
		}
		
	}

}
