import java.math.BigInteger;
import java.util.Scanner;


public class B2 
{
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 2; i <= x; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
;		}
		
		int sum = 0;
		BigInteger mod;
		while (!factorial.equals(BigInteger.valueOf(0)))
		{
			mod = factorial.mod(BigInteger.valueOf(10));
			sum += mod.intValue();
			factorial = factorial.divide(BigInteger.valueOf(10));
		}
		
		System.out.println(sum);
	}
}
