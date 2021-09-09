import java.util.Scanner;

/**
 * Mountain Biking Injury
 * @author Alistair Gray
 *
 */
public class PRA2 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int step = scan.nextInt();
		int distance = scan.nextInt();
		
		int i = 1;
		
		for (i = 1; distance > 0; i++)
		{
			if (i % 2 == 1)distance -= step;
			else distance -= step / 2;
		}
		
		System.out.println(i - 1);
	}
}
