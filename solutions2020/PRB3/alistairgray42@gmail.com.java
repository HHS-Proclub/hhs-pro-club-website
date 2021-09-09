
import java.util.Scanner;

/** 
 * 
 * @author Alistair Gray
 *
 */
public class PRB3 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int ignoreThis = scan.nextInt();
		while (scan.hasNext())
		{
			int x = scan.nextInt();
			for (int i = 1; i <= x; i++)
			{
				if ((double)(x / i) == (double)x / i) System.out.println(i);
			}
		}
	}
	
}
