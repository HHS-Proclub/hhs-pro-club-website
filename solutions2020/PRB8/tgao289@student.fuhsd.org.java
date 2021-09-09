import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = kboard.nextInt();
		kboard.close();
		int y = 2 * x / 10;
		System.out.print((int)Math.sqrt(y));
	}
}
