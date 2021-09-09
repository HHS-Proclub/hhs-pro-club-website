//package challengeProbs;
import java.util.*;
import java.lang.*;
import java.io.*;

//375 4
//30000


public class PRB1 {

	public static void main(String[] args) throws java.lang.Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numOfProblems = scanner.nextInt();
		scanner.nextLine();
		int[] inputs = new int[numOfProblems];
		for(int i = 0; i<numOfProblems; i++)
		{
			int numOfCandies = scanner.nextInt();
			scanner.nextLine();
			inputs[i] = numOfCandies;
			
		}
		for(int i = 0; i<numOfProblems; i++)
		{
			int numOfCandies = inputs[i];
			numOfCandies++;
			int numPeople = 0;
			if(numOfCandies == 1)
			{
				//numOfCandies = 2;
			}
			while(numOfCandies>0)
			{
				int temp = numPeople + 1;
				numOfCandies -= temp;
				if(numOfCandies>0)
				{
					numPeople++;
				}
			}
			
			System.out.println(numPeople);
		}
		
	}

}
