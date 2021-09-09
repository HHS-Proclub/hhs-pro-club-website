import java.util.*;

public class PRB5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int largest = 0;

		for(int i = 0; i<n; i++)
		{
			int next = in.nextInt();

			if(next>largest)
				largest = next;
		}

		System.out.println(largest);
	}
}