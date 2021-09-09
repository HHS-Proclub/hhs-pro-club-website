import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt() + 1;
		int b = in.nextInt() - 1;
		System.out.println(a < b || b > 0 ? (Math.max(a, 1) + b) / 2.0 : 0);
	}
}
