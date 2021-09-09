import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int a = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < a; i++) {
			int x = Integer.parseInt(kboard.nextLine());
			findDivi(x);
		}
	}
	public static void findDivi(int x) {
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
	}
}
