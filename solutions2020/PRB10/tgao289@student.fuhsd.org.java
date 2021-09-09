import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String x = kboard.nextLine();
		kboard.close();
		String[] array = x.split("/");
		int numerator = Integer.parseInt(array[0]);
		int denominator = Integer.parseInt(array[1]);
		int min = 0;
		if (numerator < denominator) {
			min = min + numerator;
		}
		else {
			min = min + denominator;
		}
		int factor = 0;
		for (int i = 1; i <= min; i ++) {
			if (numerator % i == 0) {
				if (denominator % i == 0) {
					factor = i;
				}
			}
		}
		System.out.print(numerator / factor + "/" + denominator / factor);
	}
}
