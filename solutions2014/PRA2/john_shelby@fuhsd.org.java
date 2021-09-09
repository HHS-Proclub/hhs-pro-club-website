
import java.math.BigInteger;
import java.util.Scanner;


public class PRA2 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = Integer.parseInt(kboard.nextLine());
		BigInteger a1 = BigInteger.ZERO;
		BigInteger a2 = BigInteger.ONE;
		for (int i = 1; i < x; i++) {
			BigInteger a3 = a1.add(a2);
			a1 = a2;
			a2 = a3;
		}
		System.out.println(a2);
	}
	

	
}
