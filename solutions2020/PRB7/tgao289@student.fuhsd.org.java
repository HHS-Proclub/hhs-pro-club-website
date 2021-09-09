import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = Integer.parseInt(kboard.nextLine());
		int[] y = new int[x];
		for (int i = 0; i < x; i ++) {
			y[i] = kboard.nextInt();
		}
		int integer = kboard.nextInt();
		kboard.close();
		int count = 0;
		for (int i = 0; i < x; i ++) {
			if (integer == y[i]) {
				count = count + 1;
			}
		}
		System.out.println(count * 100 / x);
	}
}
