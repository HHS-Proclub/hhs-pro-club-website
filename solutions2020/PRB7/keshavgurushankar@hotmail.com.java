import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] div = { 1, 6, 28, 120, 496, 2016, 8128, 32640 };
		int r = Integer.parseInt(in.nextLine());
		for (int i = 0; i < r; i++) {
			int c = Integer.parseInt(in.nextLine());
			for (int j = div.length - 1; j >= 0; j--) {
				if (c % div[j] == 0) {
					System.out.println(div[j]);
					break;
				}
			}
		}

	}

}
