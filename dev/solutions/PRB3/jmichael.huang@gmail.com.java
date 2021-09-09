import java.util.Scanner;


public class PRB3 {

	public static void main(String[] args)
	{		
		Scanner in = new Scanner(System.in);
		String next = in.nextLine();
		
		int total = Integer.parseInt(next);
		
		int avg = 0;
		for(int i = 0; i < total; i++)
		{
			String next1 = in.nextLine();
			avg += Integer.parseInt(next1);
		}
		
		System.out.println(avg/total);
		
	}
}
