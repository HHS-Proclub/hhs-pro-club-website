import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int[] A = new int[5];
		int max = 0;
		for (int i = 0; i < 5; i++) {
			A[i] = kboard.nextInt();
			if (A[i] > max) {
				max = A[i];
			}
		}
		kboard.close();
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + A[i];
		}
		if (sum - max == max) {
			System.out.println(max);
		}
		else {
			System.out.println(sum);
		}
	}
}
