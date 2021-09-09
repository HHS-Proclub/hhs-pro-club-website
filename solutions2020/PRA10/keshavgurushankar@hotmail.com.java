
//package PR_10;

import java.util.Scanner;

public class PRA10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		int[] print = new int[cases];
		for (int x = 0; x < cases; x++) {
			String[] z = in.nextLine().split(" ");
			int m = Integer.parseInt(z[0]), n = Integer.parseInt(z[1]);
			int c = 0;
			for (int i = m; i <= n; i++) {
				if (isPrime(i) == true && isPalin(i) == true) {
					c++;
				}
			}
			print[x] = c;
		}
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}

	static boolean isPrime(int x) {
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

	static boolean isPalin(int x) {
		int rev = 0, dig;
		int copy = x;
		while (x > 0) {
			dig = x % 10;
			rev = rev * 10 + dig;
			x = x / 10;
		}
		if (rev == copy)
			return true;
		else
			return false;
	}

}
