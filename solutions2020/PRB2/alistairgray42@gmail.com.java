import java.util.Scanner;

/**
 * @author Alistair Gray
 */

public class PRB2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int total = 0;
		for (int i = 0; i < 5; i++) total += in.nextInt();
		System.out.println(total);
		in.close();
	}
}
