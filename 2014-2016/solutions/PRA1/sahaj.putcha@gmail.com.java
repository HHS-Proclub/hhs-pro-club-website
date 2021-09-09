import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {
	public static void main(String args[])
	{
		Scanner util = new Scanner(System.in);
		int x = util.nextInt();
		String y=changeBase(total(x));
		
		BigInteger p= new BigInteger(y);
		System.out.println(p);
	}
	public static long total(double max)
	{
		ArrayList<Long> primes = new ArrayList<Long>();
		long count;
		for(long i=2;i<max;i++)
		{
			count=0;
			for(long x=2;x<i;x++)
			{
				if(i%x==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				primes.add(i);
			}
		}
		long total =1;
		for(int i=0;i<primes.size();i++)
		{
			total*=primes.get(i); 
		}
		return total;

	}
	public static String changeBase(long change)
	{
		return (Long.toOctalString(change));
	}
}
