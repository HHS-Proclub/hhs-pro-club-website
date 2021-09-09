/*
 * A perfect report card, all B's.

  
Very proud.

  
Ma! I got a thing going here.

  
- You got lint on your fuzz.
- Ow! That's me!

  
- Wave to us! We'll be in row 118,000.
- Bye!

  
Barry, I told you,
stop flying in the house!

  
- Hey, Adam.
- Hey, Barry.

  
- Is that fuzz gel?
- A little. Special day, graduation.

  
Never thought I'd make it.

  
Three days grade school,
three days high school.

  
Those were awkward.
 */

import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int x= 0;
		for(int i = 0; i < 5; i++)
		{
			x += scanner.nextInt();
		}
		System.out.println(x);
	}
	
}
