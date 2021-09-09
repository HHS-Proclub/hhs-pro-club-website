import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {

	public static String compute(long n){ 
		if(n <= 0 || n == 1 || n == 2) {
			return "0";
		}
		BigInteger prod = new BigInteger("1");
		for(long i = 1; i < n; i++) {
			if(isPrime(i)) {
				prod = prod.multiply(new BigInteger(i+""));
			}
		}
		String s = changeBase(prod, 8);
		return s;
	}
	
	private static String changeBase(BigInteger decimalValue, int B) {
		long val = decimalValue.longValue();
		String remainder = "";
		long answer = 1;
		while(answer > 0) {
			answer = val/B;
			if(val % B < 10) {
				remainder += val % B;
			}
			else {
				remainder += (char)((val % B) + 55);
			}
			val = answer;
		}
		StringBuffer s = new StringBuffer(remainder);
		return s.reverse().toString();
	}

	private static boolean isPrime(long n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			long in = s.nextLong();
			System.out.println(compute(in));
		}catch(Exception e) {
		}
	}
}
