/*
 * Ooming!

  
Hang on a second.

  
Hello?

  
- Barry?
- Adam?

  
- Oan you believe this is happening?
- I can't. I'll pick you up.

  
Looking sharp.

  
Use the stairs. Your father
paid good money for those.

  
Sorry. I'm excited.

  
Here's the graduate.
We're very proud of you, son.
 */
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			String input = scanner.nextLine();
			String[] numsInString = input.split(" ");
			int[] nums = new int[3];
			for(int j = 0; j < numsInString.length; j++)
			{
				nums[j] = Integer.parseInt(numsInString[j]);
			}
			if(1*nums[0] + 5*nums[1] == nums[2])
			{
				System.out.println("true");
			}
			else if(1*nums[0] + 5*nums[1] < nums[2])
			{
				System.out.println("false");
			}
			else
			{
				if(nums[2]%5 <= nums[0])
				{
					if((nums[2] - nums[2]%5)/5 <= nums[1])
					{
						System.out.println("true");
					}
					else
					{
						System.out.println("false");
					}
				}
				else
				{
					System.out.println("false");
				}
			}
		}
	}
}
