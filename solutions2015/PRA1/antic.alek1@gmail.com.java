import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alek
 * @version 9/9/2015
 */
public class PRA1 {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long largestPrime = s.nextLong();
        ArrayList<Long> primes = new ArrayList<Long>();

        for(long i = 2; i < largestPrime; i++) {
            boolean isPrime = true;
            for(long j : primes) {
                if(i%j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime) {
                primes.add(i);
            }
        }

        long multTotal = 1;

        for(long i : primes) {
            multTotal *= i;
        }
        
        System.out.println(Long.toOctalString(multTotal));

    }
}
