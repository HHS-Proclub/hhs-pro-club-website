import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRB14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cases; i++) {
			String[] a = in.nextLine().split(" ");

			int[] S = new int[a.length];
			for (int j = 0; j < a.length; j++) {
				S[j] = Integer.parseInt(a[j]);
			}
			int x = 1;
			while (true) {

				if (!(isSum(S, S.length, x))) {
					System.out.println(x);
					break;
				}
				x++;
			}
		}
	}

	static boolean isSum(int set[], int n, int sum) {
		if (sum == 0) {
			return true;
		}
		if (n == 0 && sum != 0) {
			return false;
		}
		if (set[n - 1] > sum) {
			return isSum(set, n - 1, sum);
		}

		return isSum(set, n - 1, sum) || isSum(set, n - 1, sum - set[n - 1]);
	}
}
