import java.util.Scanner;
import java.util.stream.IntStream;

public class PRA1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		long product = 1;
		for (int n = 2; n <= limit; n++) {
			final int nf = n;
			if (IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> nf % i != 0)) {
				product *= n;
			}
		}
		System.out.println(Long.toString(product, 8));
	}
}
