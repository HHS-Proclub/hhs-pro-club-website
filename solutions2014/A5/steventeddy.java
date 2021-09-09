import java.util.Arrays;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int N = kb.nextInt();
		int A = kb.nextInt();
		int B = kb.nextInt();

		int[] horsePos = new int[N + 1];

		for (int i = 1; i <= N; i++)
			horsePos[i] = kb.nextInt();

		Arrays.sort(horsePos);

		double DP[] = new double[N + 1];

		for (int i = 1; i <= N; i++)
			DP[i] = Integer.MAX_VALUE;

		DP[0] = 0;

		for (int i = 1; i <= N; i++) {

			for (int j = 0; j < i; j++) {

				DP[i] = Math.min(DP[i], DP[j] + A + B
						* (int)(horsePos[i] - horsePos[j+1] + 0.5) / 2.0);
				//System.out.println((DP[j] + A + B * (horsePos[i] - horsePos[j + 1] + 1) / 2.0) + "-");

			}

		}
		System.out.println(DP[0]);
		kb.close();
		System.out.println(DP[N]);

	}

}
