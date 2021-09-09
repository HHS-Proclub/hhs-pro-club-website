import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA1 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			int one = Integer.parseInt(token.nextToken());
			int five = Integer.parseInt(token.nextToken());
			int wanted = Integer.parseInt(token.nextToken());
			boolean good = false;
			for (int j = 0; j <= one; j++) {
				if (!good && (wanted - j) % 5 == 0 && (wanted - j) / 5 <= five) {
					System.out.println("true");
					good = true;
				}
			}
			if (!good) {
				System.out.println("false");
			}
		}
	}
}
