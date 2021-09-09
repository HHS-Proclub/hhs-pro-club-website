import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			largest = Math.max(in.nextInt(), largest);
		}
		System.out.println(largest);
	}
}
