import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nums = s.nextInt();
		ArrayList<Integer> primes = new ArrayList<>(nums);
		
		for (int num = 2; num < nums; num++) {
			if (isPrime(num)) {
				primes.add(num);
			}
		}
		
//		System.out.println(primes);
		BigInteger sum = BigInteger.ONE;
		for (int i = 0; i < primes.size(); i++) {
			sum = sum.multiply(new BigInteger(primes.get(i)+""));
		}
		
//		System.out.println(sum);
		System.out.println(sum.toString(8));
		s.close();
	}
	
	private static boolean isPrime (int num) {
		boolean val = true;
		
		if ((num & 1) == 0 && num != 2) {
			val = false;
		} else {
			for (int i = 3; i <= Math.round((Math.sqrt(num))); i += 2) {
				if (num % i == 0) {
					val = false;
				}
			}
		}
		
		return val;
	}
}
