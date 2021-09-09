import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class PRA4
{
	public static BigInteger pow(BigInteger base, BigInteger exponent) {
	  BigInteger result = BigInteger.ONE;
	  while (exponent.signum() > 0) {
	    if (exponent.testBit(0)) result = result.multiply(base);
	    base = base.multiply(base);
	    exponent = exponent.shiftRight(1);
	  }
	  return result;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		BigInteger big = BigInteger.valueOf(0);
		String s = scanner.nextLine();
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);    
			if(c == '1'){
				big = big.add(pow(BigInteger.valueOf(2),BigInteger.valueOf(s.length()-i-1)));
			}
		}
		System.out.println(big.multiply(BigInteger.valueOf(17)).toString(2));
	}
}