import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println();
		int numclass = kboard.nextInt();
		int a = 0;
		for (int i = 1; i <= numclass; i++) {
			System.out.println();
			a += kboard.nextInt();
		}
		double mean = (1.0 * a / numclass);
		int result = (int)(mean + .5);
		System.out.println(result);
	}
}
