import java.util.*;

public class HPI8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int N = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		int[][] m = new int[N+1][W+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				if (w[i-1] > j) {
					m[i][j] = m[i-1][j];
				} else {
					m[i][j] = Math.max(m[i-1][j], m[i-1][j-w[i-1]] + v[i-1]);
				}
			}
		}
		System.out.println(m[N][W]);
	}
}
