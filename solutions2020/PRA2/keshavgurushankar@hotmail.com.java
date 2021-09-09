
//package junior.PR_02;

import java.util.Scanner;

public class PRA2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for (int i = 0; i < x; i++) {
			int y = in.nextInt();
			System.out.println((isPrime(y) && isPrime(reverse(y))) ? "YES" : "NO");

		}
		in.close();
	}

	public static boolean isPrime(int x) {
		for (int i = 0; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int x) {
		char[] s = Integer.toString(x).toCharArray();
		for (int i = 0; i < s.length / 2; i++) {
			char a = s[i];
			s[i] = s[s.length - i];
			s[s.length - i] = a;
		}
		return Integer.parseInt(new String(s));
	}
}
