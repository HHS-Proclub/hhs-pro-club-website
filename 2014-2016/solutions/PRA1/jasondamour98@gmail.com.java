import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {		
		ArrayList<BigInteger> primes = new ArrayList<BigInteger>();

		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		int numPrimes = limit;
		
		for(int i=1; i<limit; i++)
			primes.add(new BigInteger(i+""));
		
		for(int i=0; i<numPrimes - 1; i++){
			if((primes.get(i).isProbablePrime(1)) == false){
				primes.remove(i);
				i--;
				numPrimes--;
			}
		}
		
		numPrimes--;
		
		BigInteger product = new BigInteger("1");
		
		for(int i=0; i<numPrimes; i++)
			product = product.multiply(primes.get(i)); 
		
		
		System.out.println(product.toString(8));
	}

}
