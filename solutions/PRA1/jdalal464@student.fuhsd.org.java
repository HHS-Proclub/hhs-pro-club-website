
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long sum = 0, N = 0, M = 0, GCD = 1;

		for (int i = 1; i <= T; i++) {
			N = sc.nextLong();
			while (GCD <= 1) {
				GCD = 1;
				M = N;
				while (M > 0) {
					sum += (M % 10);
					M /= 10;
				}

				for (int b = 1; b <= sum; b++) {
					if (N % b == 0 && sum % b == 0) {
						GCD *= b;
					}
				}

				N++;
				sum = 0;

			}

			GCD = 1;
			System.out.println(N - 1);
		}

		sc.close();
	}
	

}
