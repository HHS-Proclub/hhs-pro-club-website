import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String[] A = kboard.nextLine().split(" ");
		String[] B = kboard.nextLine().split(" ");
		kboard.close();
		int compareA = 0;
		for (int i = 0; i < A.length; i++) {
			int test = Integer.parseInt(A[i]);
			if (test % 10 == 0) {
				if (test > compareA) {
					compareA = test;
				}
			}
		}
		int compareB = 0;
		for (int i = 0; i < B.length; i++) {
			int test = Integer.parseInt(B[i]);
			if (test % 10 == 0) {
				if (test > compareB) {
					compareB = test;
				}
			}
		}
		System.out.println(compareB + compareA);
	}
}
