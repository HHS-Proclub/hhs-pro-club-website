import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 
{
	public static void main (String args[])
	{
		ArrayList <Integer> numList = new ArrayList<Integer>();
		ArrayList<BigInteger> base8List = new ArrayList<BigInteger>(); //Backwards
		Scanner x = new Scanner(System.in);
		int limit = x.nextInt();
		boolean notFactor = false;

		
		//Part below for creating a list of prime numbers.
		for (int i = 2; i < limit; i++)
		{
			notFactor = false;
			if (limit < 10)
			{
				if (limit > 1)
				{
					for (int j = 2; j < i; j++)
					{
						if (i % j == 0)
						{
							notFactor = true;
							break;
						}
					}
				}
			}
			else
			{
				for (int j = 2; j < 10; j++)
				{
					if (i % j == 0 && i != j)
					{
						notFactor = true;
						break;
					}
				}
			}
			if (!notFactor)
				numList.add(i);
		}
		
		
		//Part below is for finding the product of the prime numbers.
		BigInteger product = BigInteger.ONE;
		for (int i = 0; i < numList.size(); i++)
			product = product.multiply(BigInteger.valueOf(numList.get(i)));
	
		
		//Part below for converting into base 8.
		int divisor = 8;
		boolean keepGoing = true;
		while (!product.equals(BigInteger.ZERO) || keepGoing)
		{
			if (!product.equals(BigInteger.ZERO))
				base8List.add(product.mod(BigInteger.valueOf(divisor)));
			if (product.equals(BigInteger.ZERO))
				keepGoing = false;
			product = product.divide(BigInteger.valueOf(8)); 
		}
		
	
		//Part below for printing out the final number.
		for (int i = base8List.size()-1; i >= 0; i--)
		{
			System.out.print(base8List.get(i).intValue());
		}
	}
}
