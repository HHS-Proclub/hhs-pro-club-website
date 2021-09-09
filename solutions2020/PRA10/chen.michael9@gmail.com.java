import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA10 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			int l = Integer.parseInt(token.nextToken()), r = Integer.parseInt(token.nextToken());
			int sum = 0;
			for (int j = l; j <= r; j++) {
				if (isPalin(j)) {
					if (isPrime(j)) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
	public static boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalin(int x) {
		String s = Integer.toString(x);
		for (int i = 0; i <= s.length()/ 2 - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
