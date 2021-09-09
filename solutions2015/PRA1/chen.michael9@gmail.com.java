import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) throws IOException
	{
		Scanner kboard = new Scanner(System.in);
		long n = kboard.nextInt();
		
		BigInteger m = BigInteger.valueOf(1);
		
		for (long i = 2; i < n; i++) {
			if (isPrime(i)) {
				m = m.multiply(BigInteger.valueOf(i));
			}
		}

		if (m.equals(BigInteger.valueOf(1))) {
			System.out.println(0);
		} else {
			System.out.println(convert(m));
		}
	}
	
	public static BigInteger convert(BigInteger n)
	{
		String octNum = "";
		BigInteger largestDivisor = BigInteger.valueOf(1);
		while (largestDivisor.compareTo(n) <= 0) {
			largestDivisor = largestDivisor.multiply(BigInteger.valueOf(8));
		}
		largestDivisor = largestDivisor.divide(BigInteger.valueOf(8));
		while (largestDivisor.compareTo(BigInteger.valueOf(1)) >= 0) {
			octNum += n.divide(largestDivisor).toString();
			n = n.subtract(largestDivisor.multiply(n.divide(largestDivisor)));
			largestDivisor = largestDivisor.divide(BigInteger.valueOf(8));
		}
		BigInteger temp = new BigInteger(octNum);
		return temp;
	}
	
	public static boolean isPrime(long n)
	{
		if (n == 1) {
			return false;
		} 
		
		if (n == 2 || n == 3) {
			return true;
		}
		
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		
		long f = (long)(Math.sqrt(n)) + 1;
		
		for (int i = 6; i <= f; i += 6) {
			if (n % (i-1) == 0 || n % (i + 1) == 0) {
				return false;
			}
		}
		
		return true;
	}
}
