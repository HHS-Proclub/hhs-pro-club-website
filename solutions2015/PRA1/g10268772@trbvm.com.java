import java.util.Scanner;
public class PRA1 {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int product = 0;

		for (int i = 1; i < n; i++) {
			if (isPrime(i)) {
				product *= i;
			}
		}	

		System.out.println(Integer.toString(product, 8));
	}
}