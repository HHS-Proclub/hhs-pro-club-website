//package challengeProbs;
import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRA4 {

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
			String numAsString = inputs[i];
			long sum = 0;
			for(int n = 0; n< numAsString.length(); n++)
			{
				String temp = numAsString.substring(n, n+1);
				sum += Integer.parseInt(temp);
			}
			if(sum<3)
			{
				System.out.println("-1");
			}
			else
			{
				//System.out.println("Sum: " + sum);
				if(sum%3 == 0)
				{
					if(numAsString.charAt(0) == '0')
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("0");
					}
				}
				else if(sum%3 == 1)
				{
					boolean found = false;
					for(int x = 0; !found && x<numAsString.length();x++)
					{
						if(numAsString.charAt(x) == '1' || numAsString.charAt(x) == '4' || numAsString.charAt(x) == '7')
						{
							//System.out.println("found with mod 1");
							numAsString = numAsString.substring(0, x) + numAsString.substring(x+1);
							found = true;
							if(numAsString.charAt(0) == '0')
							{
								System.out.println("2");
							}
							else
							{
								System.out.println("1");
							}
						}
					}
					if(!found)
					{
						if(numAsString.length()<3)
						{
							System.out.println("-1");
						}
						{
							if(numAsString.charAt(0) == '0')
							{
								System.out.println("3");
							}
							else
							{
								System.out.println("2");
							}
						}
					}
				}
				else if(sum%3 == 2)
				{
					boolean found = false;
					for(int x = 0; !found && x<numAsString.length();x++)
					{
						if(numAsString.charAt(x) == '2' || numAsString.charAt(x) == '5' || numAsString.charAt(x) == '8')
						{
							//System.out.println("found with mod 1");
							numAsString = numAsString.substring(0, x) + numAsString.substring(x+1);
							found = true;
							if(numAsString.charAt(0) == '0')
							{
								System.out.println("2");
							}
							else
							{
								System.out.println("1");
							}
						}
					}
					if(!found)
					{
						if(numAsString.length()<3)
						{
							System.out.println("-1");
						}
						else
						{
							if(numAsString.charAt(0) == '0')
							{
								System.out.println("3");
							}
							else
							{
								System.out.println("2");
							}
						}
					}
				}
		}

		}

	}

}
