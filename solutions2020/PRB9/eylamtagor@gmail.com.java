import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		for (int count = 0; count < cases; count++) {
			int n = kb.nextInt();
			int k = kb.nextInt();
			long A = kb.nextLong();
			long B = kb.nextLong();
			int sum = 0;
			while (n != 1) {
				if ((n - ((double) n / k)) / B > 1 / (double) A) {
					if (n % k == 0) {
						n = n / k;
						sum += B;
					} else {
						n -= 1;
						sum += A;
					}
				} else {
					n -= 1;
					sum += A;
				}
			}

			System.out.println(sum);
		}
	}
}
