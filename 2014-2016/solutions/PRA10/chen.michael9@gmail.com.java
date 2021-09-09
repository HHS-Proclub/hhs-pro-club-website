import java.util.Scanner;

public class PRA10 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int current = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % i == 0) {
					current++;
				}
			}
		}
		System.out.println(simplify(current, n * n));
	}
	public static String simplify(int first, int second) {
		int t = GCD(first, second);
		return (first / t) + "/" + (second / t);
	}
	public static int GCD(int a, int b) {
		 if (b==0) return a;
		   return GCD(b,a%b);
	}
}
