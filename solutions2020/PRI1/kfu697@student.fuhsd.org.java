/**
 * PRI1: Chocolate Store
 * Do exploration to find a formula. S+H-B finds the # of bags with both bars (X).
 * Take max(S, H) - X + 1 to get your answer. Runs in O(1).
 */

import java.util.*;

public class PRI1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int b, s, h, x;
		for (int i = 0; i < p; i++) {
			b = sc.nextInt();
			s = sc.nextInt();
			h = sc.nextInt();
			x = s+h-b;
			System.out.println(Math.max(s, h) - x + 1);
		}
		sc.close();
	}

}
