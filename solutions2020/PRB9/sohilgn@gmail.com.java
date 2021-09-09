import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;

		while (count < testCase) {
			long n = scanner.nextLong();
			long k = scanner.nextLong();
			long A = scanner.nextLong();
			long B = scanner.nextLong();

			long total = 0;

			while (n != 1) {
				if (n % k == 0 && k != 1) {

					long x = n / k;
					long priceSubtraction = (n - x) * A;

					if (B < priceSubtraction) {
						n /= k;
						total += B;
					} else {
						n -= 1;
						total += A;
					}
				} else {
					n -= 1;
					total += A;
				}
			}

			System.out.println(total);
			count++;
		}
	}

}
