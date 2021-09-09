import java.util.Scanner;

public class HPI8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maxWeight = in.nextInt();
		int n = in.nextInt();
		int[][] m = new int[n + 1][maxWeight + 1];
		int[] w = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		
		int item;
		for (int numItems = 1; numItems <= n; numItems++) {
			for (int weight = 0; weight <= maxWeight; weight++) {
				item = numItems - 1;
				if (w[item] > weight) {
					m[numItems][weight] = m[numItems - 1][weight];
				}
				else {
					m[numItems][weight] = Math.max(m[numItems - 1][weight], m[numItems - 1][weight - w[item]] + v[item]);
				}
			}
		}
		System.out.println(m[n][maxWeight]);
	}

}