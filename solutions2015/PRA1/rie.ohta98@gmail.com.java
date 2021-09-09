import java.util.ArrayList;
import java.util.Scanner;


public class PRA1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		PRA1 pra = new PRA1();
		ArrayList<Integer> primes = pra.findPrimes(p);
		long answer = pra.multiplyPrimes(primes);
		System.out.println(Long.toUnsignedString(answer, 8));

	}
	
	private ArrayList<Integer> findPrimes(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			isPrime = true;
			for (int j = 2; isPrime && j < i; j++) {
				if (i%j == 0) {
					isPrime = false;
				}
			}
			if (isPrime)
				primes.add(i);
		}
		return primes;
	}
	
	private long multiplyPrimes(ArrayList<Integer> primes) {
		long product = 1;
		for (Integer i: primes) {
			product = product*i.intValue();
		}
		return product;
	}

}
