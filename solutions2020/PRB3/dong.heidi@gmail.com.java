import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int x;
		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(in.nextLine());
			System.out.println(1);
			for (int j = 2; j <= (int) x / 2; j++) {
				if (x % j == 0) {
					System.out.println(j);
				}
			}
			System.out.println(x);
		}
	}

}
