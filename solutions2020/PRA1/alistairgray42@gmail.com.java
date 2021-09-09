import java.util.Scanner;

/**
 * @author Alistair Gray
 */

public class PRA1
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) 
		{
			
			boolean result;
			
			int ones = in.nextInt();
			int fives = in.nextInt();
			int total = in.nextInt();
			int remainder = ones + 5*fives - total;
			
			if (remainder < 0) result = false;
			else if (remainder == 0) result = true;
			else
			{
				
				fives += ones / 5;
				int remainderOnes = remainder % 5;
				int remainderFives = (remainder - remainderOnes) / 5;
				result = (fives >= remainderFives && ones >= remainderOnes);
			}
			
			System.out.println(result);
		}
	}

}
