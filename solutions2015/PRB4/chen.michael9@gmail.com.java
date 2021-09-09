import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		long sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(kboard.nextLine());
		}
		long product = 1;
		while (sum > 0) {
			product *= sum;
			sum -= 1;
		}
		System.out.println(product);
	}
}
