import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(kboard.nextLine());
			sum += n;
		}
		System.out.println(sum);
	}
}
