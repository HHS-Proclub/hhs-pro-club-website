import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int integer = kboard.nextInt();
		int factor = kboard.nextInt();
		kboard.close();
		for (int i = 1; i <= factor; i ++) {
			System.out.println (integer * i);
		}
	}
}
