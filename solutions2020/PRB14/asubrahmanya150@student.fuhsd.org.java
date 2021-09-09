//package PR_14;

import java.util.Scanner;




public class PRB14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cases; i++) {
			String[] temp = in.nextLine().split(" ");

			int[] s = new int[temp.length];
			for (int j = 0; j < temp.length; j++) {
				s[j] = Integer.parseInt(temp[j]);
			}
			int n = 1;
			boolean good = true;
			while (good) {

				if (!(isSum(s, s.length, n))) {
					System.out.println(n);
					break;
				}
				n++;
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
