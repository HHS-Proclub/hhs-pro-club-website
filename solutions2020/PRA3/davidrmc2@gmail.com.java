//package challengeProbs;
import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRA3 {

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
			String currentString = inputs[i];
			int firstWhiteIndex = currentString.indexOf(' ');
			int secondWhiteIndex = currentString.lastIndexOf(' ');
			int guests = Integer.parseInt(currentString.substring(0, firstWhiteIndex));
			//System.out.println("Guests: " + guests);
			int pillows = Integer.parseInt(currentString.substring(firstWhiteIndex+1, secondWhiteIndex));
			int rBed = Integer.parseInt(currentString.substring(secondWhiteIndex+1));
			if(rBed<=guests/2)
			{
				//work up
				boolean found = false;
				int variable = 0;
				while(!found)
				{
					//System.out.println("trying");
					int maxStack = rBed-variable;
					//System.out.println("Max Stack: " + maxStack);
					int pyramidSum = 0;
					for(int x = maxStack; x>0; x--)
					{
						pyramidSum += x;
					}
					pyramidSum = pyramidSum*2-maxStack;
					//System.out.println("Pyramid Sum: " + pyramidSum);
					int pillowSum = variable+pyramidSum+(guests-(rBed+maxStack-1));
					//System.out.println("Pillow Sum: " + pillowSum);

					if(pillowSum <= pillows)
					{
						if(variable == 0)
						{
							//ends have multiple pillows
							//boolean valid = true;
							int newPillowSum = pillowSum;
							int pyramidWidth = maxStack*2-1;
							maxStack--;
							while(newPillowSum<=pillows)
							{
								
								maxStack++;
								pyramidWidth++;
								newPillowSum+=pyramidWidth;
								//(guests-(rBed+maxStack-1))
							}
							
							//int difference = pillows - pillowSum;
							//int increase = difference/guests;
							System.out.println((maxStack));
							
						}
						else
						{
						
						
						
						
						System.out.println(maxStack);
						}
						found = true;
					}
					else
					{
						variable++;
					}
				}
			}
			else
			{
				//work down
				boolean found = false;
				int variable = guests;
				while(!found)
				{
					//System.out.println("trying");
					int maxStack = -rBed+variable+1;
					//System.out.println("Max Stack: " + maxStack);
					int pyramidSum = 0;
					for(int x = maxStack; x>0; x--)
					{
						pyramidSum += x;
					}
					pyramidSum = pyramidSum*2-maxStack;
					//System.out.println("Pyramid Sum: " + pyramidSum);
					int pillowSum = pyramidSum+(rBed-maxStack);
					//System.out.println("Pillow Sum: " + pillowSum);
					if(pillowSum <= pillows)
					{
						if(variable == guests)
						{
							//ends have multiple pillows
							int newPillowSum = pillowSum;
							int pyramidWidth = maxStack*2-1;
							maxStack--;
							while(newPillowSum<=pillows)
							{
								maxStack++;
								pyramidWidth++;
								newPillowSum+=pyramidWidth;
								//(guests-(rBed+maxStack-1))
							}
							System.out.println((maxStack));
							
						}
						else
						{
						System.out.println(maxStack);
						}
						found = true;
					}
					else
					{
						variable--;
					}
				}
			}


		}

	}

}
