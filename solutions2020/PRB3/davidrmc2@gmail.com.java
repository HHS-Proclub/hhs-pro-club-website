package challengeProbs;
import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRB3 {

	
	public static void main(String[] args) throws java.lang.Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//String temp = scanner.nextLine()
			//	Long.parseLong(temp);
		int numOfProblems = scanner.nextInt();
		scanner.nextLine();
		long[] inputs = new long[numOfProblems];
		for(int i = 0; i<numOfProblems; i++)
		{
			long numOfCandies = scanner.nextLong(); 
			scanner.nextLine();
			inputs[i] = numOfCandies;
			
		}
		for(int i = 0; i<numOfProblems; i++)
		{
			boolean moveToNextProblem = false;
			long currentNum = inputs[i];
			if(currentNum<0)
			{
				return;
			}
			String numAsString = "" + currentNum;
			long[] digits = new long[numAsString.length()];
			long[] sortedDigits = new long[numAsString.length()];
			int length = digits.length;
			for(int x = 0; x<numAsString.length(); x++)
			{
				digits[x] = Integer.parseInt("" + numAsString.charAt(x));
				sortedDigits[x] = Integer.parseInt("" + numAsString.charAt(x));

				//System.out.println(Integer.parseInt("" + numAsString.charAt(x)));
			}
			
			if(digits.length==2)
			{
				if(digits[0] < digits[1])
				{
					long temp = digits[1];
					digits[1] = digits[0];
					digits[0] = temp;
					long[] array = digits;
					String printed = "";
					for(int m = 0; m<array.length; m++)
					{
						printed = printed + array[m];
					}
					System.out.println(printed);
					//PRB3.printArray(digits);
					moveToNextProblem = true;
				}
			}
			else if(digits.length==1)
			{
				long temp = currentNum*10 + digits[0];
				System.out.println(temp);
				moveToNextProblem = true;
			}
			
			
			
			//System.out.println(digits);
			Arrays.sort(sortedDigits);
			
			//PRB3.printArray(sortedDigits);

			//long modifiable = 1;
			for(int modifiable = 1; modifiable<length+1; modifiable++)
			{
				if(!moveToNextProblem)
				{
					//System.out.println("test");
			if(digits[length-modifiable] < sortedDigits[length - 1])
			{
				
				boolean found = false;
				for(int x = 1; x<length/*-modifiable*/ && !found; x++)
				{
					//System.out.println("test");
					if(!moveToNextProblem)
					{
					//System.out.println((length-modifiable));
					//System.out.println(x);
					if(!moveToNextProblem && digits[length-modifiable] < sortedDigits[x])
					{
						//System.out.println("reached here");
						digits[length-modifiable] = sortedDigits[x];
						found = true;
						moveToNextProblem = true;
						//PRB3.printArray(digits);
						long[] array = digits;
						String printed = "";
						for(int y = 0; y<array.length; y++)
						{
							printed = printed + array[y];
						}
						System.out.println(printed);
					}
					}
				}
				
			}
			else
			{
				
			}
			}
		}
			if(!moveToNextProblem)
			{
			long temp = currentNum*10 + digits[0];
			System.out.println(temp);
			moveToNextProblem = true;
			}
		}
		
			
		
			
			
			
			/*
			long numOfCandies = inputs[i];
			numOfCandies++;
			long numPeople = 0;
			if(numOfCandies == 1)
			{
				//numOfCandies = 2;
			}
			while(numOfCandies>0)
			{
				long temp = numPeople + 1;
				numOfCandies -= temp;
				if(numOfCandies>0)
				{
					numPeople++;
				}
			}
			
			System.out.println(numPeople);
			*/
		}
		
	

}
