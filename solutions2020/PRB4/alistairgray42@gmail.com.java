import java.util.Scanner;

public class PRB4 {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		for (int k = 1; k <= j; k++)
		{
			System.out.println(i * k);
		}
	}
}