import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRB5 {

	public static void main(String[] args) throws java.lang.Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numOfProblems = scanner.nextInt();
		scanner.nextLine();

		for(int i = 0; i<numOfProblems; i++)
		{
			//System.out.println("dog" + scanner.nextLine());
			//System.out.println("Dog");
			String nextLine = scanner.nextLine();
			int spaceIndex = nextLine.indexOf(' ');
			long firstNum = Integer.parseInt(nextLine.substring(0, spaceIndex));
			long secondNum = Integer.parseInt(nextLine.substring(spaceIndex+1, nextLine.length()));
			//System.out.println("firstNum: " + firstNum + " secondNum: " + secondNum);
			int counter = 1;
			boolean solutionFound = false;
			while(!solutionFound)
			{
				long attempt = firstNum*counter;
				long tenFactor = 1;
				for(int m = 0; m<secondNum; m++)
				{
					tenFactor *= 10;
				}
				long temp = attempt/tenFactor;
				if(temp*tenFactor == attempt)
				{
					System.out.println(attempt);
					solutionFound = true;
				}
				
				
				counter++;
			}
		}
		
		
	}

}
