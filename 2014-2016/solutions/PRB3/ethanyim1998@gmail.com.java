import java.util.Scanner;

public class PRB3 
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int max = 0;
		
		for (int i = 0; i < size; i++)
		{
			int next = s.nextInt();
			if (next > max)
				max = next;
		}
		System.out.println(max);
	}
}
