import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] ints = new int[5];
		int total = 0;
		int output = 0;
		
		for (int i = 0; i < 5; i++)
		{
			int j = scan.nextInt();
			ints[i] = j;
			total += j;
		}
		
		for (int i = 0; i < 5; i++)
		{
			if (total - ints[i] == ints[i]) output = ints[i];
		}
		
		if (output != 0) System.out.println(output);
		else System.out.println(total);
	}
	
}
