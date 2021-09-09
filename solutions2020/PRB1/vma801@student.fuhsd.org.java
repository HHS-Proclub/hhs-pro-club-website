import java.awt.*;
import java.util.*;  

public class PRB1 {
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        int caseNumber = input.nextInt();
        
		for( int i = 0; i < caseNumber; i++)
		{	 
				
			int candyNumber = input.nextInt();
			int personNumber = 0;
			int peopleGiven = 0;
			
			
			
			while(candyNumber > personNumber)
			{
				
				personNumber = personNumber + 1;
				candyNumber = candyNumber - personNumber;
				peopleGiven = peopleGiven + 1;
			}
			System.out.println(peopleGiven);
		}
		
		
		
	}
}
