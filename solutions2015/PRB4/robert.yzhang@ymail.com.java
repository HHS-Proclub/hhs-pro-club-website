import java.util.Scanner;
public class PRB4 {
	
	public static void main(String []args)
	{
		Scanner kboard = new Scanner(System.in);
		long total = 0;
		for(long i = 0; i < 4; i++)
		{
			
			int x = kboard.nextInt();
			total += x;
		}
		for(long y = total; y > 2; y--)
		{
			long z = y - 1;
			total *= z;
		}
		System.out.println(total);
		
	}

}
