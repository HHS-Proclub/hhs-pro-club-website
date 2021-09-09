import java.util.Scanner;


public class PRB3 
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		int[] integers = new int[amount];
		for (int i = 0; i < amount; i++)
		{
			integers[i] = in.nextInt();
		}
		for (int i = 0; i < amount; i++)
		{
			for (int j = 1; j <= integers[i]; j++)
			{
				if (integers[i] % j == 0)
					System.out.println(j);
			}
		}
	}
}
