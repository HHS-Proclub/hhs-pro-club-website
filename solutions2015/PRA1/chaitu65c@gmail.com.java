import java.util.ArrayList;
import java.util.Scanner;;

public class PRA1 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		long product = 1;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				product *= i;
			}
		}
		Long longtotal = new Long(product);
		String total = longtotal.toString();
		String newtot = Long.toString(longtotal,8);
		System.out.print(newtot);
	}

	public static boolean isPrime(int n) {
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && i != n) {
				return false;
			}
		}
		return true;
	}
}
