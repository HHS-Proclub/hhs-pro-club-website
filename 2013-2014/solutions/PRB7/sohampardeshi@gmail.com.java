import java.math.BigInteger;
import java.util.Scanner;


public class PRB7 {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int a = inputReader.nextInt();
		int b = inputReader.nextInt();

		System.out.print(gcd(a,b));
		
	}
	private static int gcd(int a, int b) {
	    BigInteger b1 = new BigInteger(""+a); // there's a better way to do this. I forget.
	    BigInteger b2 = new BigInteger(""+b);
	    BigInteger gcd = b1.gcd(b2);
	    return gcd.intValue();
	}

}
