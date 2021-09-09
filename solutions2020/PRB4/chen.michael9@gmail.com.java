import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int i = Integer.parseInt(kboard.nextLine());
		int j = Integer.parseInt(kboard.nextLine());
		for (int a = 1; a <= j; a++) {
			System.out.println(a * i);
		}
	}
}
