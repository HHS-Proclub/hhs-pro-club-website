import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {

		int[] horsePos;
		int[] prices;
		
		Scanner kb = new Scanner(System.in);

		int N = kb.nextInt();
		int M = kb.nextInt();

		horsePos = new int[N+1];
		prices = new int[M+1];

		for (int i = 1; i <= N; i++)
			horsePos[i] = kb.nextInt();

		for (int i = 1; i <= M; i++) 
			prices[i] = kb.nextInt();
		
		Arrays.sort(horsePos);
		
		
		int DP[] = new int[N+1];
		for(int i = 1; i <= N; i ++)
			DP[i] = Integer.MAX_VALUE;
		
		DP[0] = 0;
		for (int i = 1; i <= N; i++){
			for(int j = 0; j < i; j++){
				DP[i] = Math.min(DP[i], 
						DP[j] + prices[horsePos[i] - horsePos[j+1] + 1]);
			}
		}
		
		kb.close();
		System.out.println(DP[N]);

	}
}
