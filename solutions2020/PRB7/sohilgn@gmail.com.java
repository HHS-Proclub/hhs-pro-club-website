import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;

		while (count < testCase) {
			int n = scanner.nextInt();

			int k = 1;
			ArrayList <Double> valid = new ArrayList <Double> ();
			while ((Math.pow(2, k) - 1) * (Math.pow(2, k - 1)) <= n) {
				if (n % (Math.pow(2, k) - 1) * (Math.pow(2, k - 1)) == 0) {
					valid.add((Math.pow(2, k) - 1) * (Math.pow(2, k - 1)));
				}
				k++;
			}

			System.out.println((int) findMaximum(valid));
			count++;
		}
	}

	public static double findMaximum(ArrayList <Double> arr) {
		double max = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		return max;
	}
}
