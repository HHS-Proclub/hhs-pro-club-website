import java.math.BigInteger;
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int in = kboard.nextInt();
		System.out.println(base8(primeProduct(in)));
	}
	
	public static BigInteger primeProduct(int n){
		BigInteger product = BigInteger.valueOf(1);
		for(int i = 1; i <= n; i++){
			if (isPrime(i)){
				product = product.multiply(BigInteger.valueOf(i));
			}
		}
		return product;
	}
	
	
	public static boolean isPrime(long n){
		for (int i = 2; i <= (int)Math.sqrt(n); i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static String base8(BigInteger b10){
		return b10.toString(8);
	}
}
