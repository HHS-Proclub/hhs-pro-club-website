//package challengeProbs;
import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRA5 {

	public static void main(String[] args) throws java.lang.Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numOfProblems = scanner.nextInt();
		scanner.nextLine();
		String[] inputs = new String[numOfProblems];
		for(int i = 0; i<numOfProblems; i++)
		{
			String numOfCandies = scanner.nextLine();
			//scanner.nextLine();
			inputs[i] = numOfCandies;
			
		}
		for(int i = 0; i<numOfProblems; i++)
		{
			String str = inputs[i];
			//System.out.println("str start: " + str + "\n");
			String returned = "";
			int currentIndex = 0;
			int counter = 0;
			int consonantIndex = -1;
			while(currentIndex < str.length())
			{
				char currentChar = str.charAt(currentIndex);
				currentIndex++;
				if(currentChar=='A' || currentChar=='a' || currentChar=='E' || currentChar=='e' || currentChar=='I' || currentChar=='i' || currentChar=='O' || currentChar=='o' || currentChar=='U' || currentChar=='u' || currentChar=='Y' || currentChar=='y')
				{
					counter = 0;
				}
				else
				{
					if(consonantIndex == -1)
					{
						//System.out.println("Consonant index changed to: " + (currentIndex-1));
						consonantIndex = currentIndex-1;
					}
					if(consonantIndex < -100)
					{
						//System.out.println("slice and diced");
						returned += str.substring(0, currentIndex-1) + " ";
						str = str.substring(currentIndex-1, str.length());
						//System.out.println("returned: " + returned);
						//System.out.println("str: " + str);
						counter = 0;
						currentIndex = 0;
						consonantIndex = -1;
					}
					else
					{
					counter++;
					if(counter==3)
					{
						
						char temp = str.charAt(currentIndex-3);
						if(temp==currentChar && temp==str.charAt(currentIndex-2))
						{
							
							if(consonantIndex + 2 < currentIndex)
							{
								//System.out.println("consonantIndex: " + consonantIndex);
								//System.out.println("split anyway at index: " + currentIndex);
								returned += str.substring(0, currentIndex) + " ";
								str = str.substring(currentIndex, str.length());
								//System.out.println("returned: " + returned);
								//System.out.println("str: " + str);
								counter = 0;
								currentIndex = 0;
								consonantIndex = -1;
							}
							else
							{
								//System.out.println("Given pass");
								//System.out.println("consonantIndex: " + consonantIndex);
								//System.out.println("returned: " + returned);
								//System.out.println("str: " + str);
							counter = 2;
							consonantIndex = -200;
							}
						}
						else
						{
						
						//System.out.println("split normally");
						//System.out.println("counter: " + counter);
						returned += str.substring(0, currentIndex-1) + " ";
						str = str.substring(currentIndex-1, str.length());
						//System.out.println("returned: " + returned);
						//System.out.println("str: " + str);
						counter = 0;
						currentIndex = 0;
						consonantIndex = -1;
						}


					}
				}
				}
				
			}
			returned += str;
			System.out.println(returned);
			
			
			
		}
		
	}

}
