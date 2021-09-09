import java.util.Scanner;
public class PRA1 {
	
	public static boolean isPrime(int x)
	{
		int i;
		for(i = 2; i < x; i++)
		{
			if(x%i == 0 && i != x)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String []args)
	{
		int t = 0;
		long total = 1;
		Scanner kBoard = new Scanner(System.in);
		t = kBoard.nextInt();
		
		for(int i = 1; i <= t; i++)
		{
			boolean isP = isPrime(i);
			if(isP == true)
			{
				total *= i;
			}
		}
		
		
		Long longTotal = new Long(total);
		String stringTotal = longTotal.toString();
		String newtotal = Long.toString(longTotal, 8);
		System.out.println(newtotal);
		
	}
}
