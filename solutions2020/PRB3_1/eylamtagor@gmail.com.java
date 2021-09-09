import java.util.Scanner;

public class PRB3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int n = 0; n < cases; n++) {
			int m = scan.nextInt();
			int[] i = new int[m];
			boolean[] pows = new boolean[m];

			for (int x = 0; x < m; x++) {
				i[x] = scan.nextInt();
				pows[x] = false;
			}

			for (int k = 0; k < m; k++) {
				for (int j = k + 1; j < m; j++) {
					int sum = i[k] + i[j];
					for (int a = 0; Math.pow(2, a) <= sum; a++) {
						if (Math.pow(2, a) == sum) {
							pows[k] = true;
							pows[j] = true;
						}
					}
				}
			}

			int ans = 0;

			for (int y = 0; y < m; y++) {
				if (pows[y] == false)
					ans++;
			}

			System.out.println(ans);
		}
	}

}
