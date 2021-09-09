import java.util.Scanner;

public class PRB15 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int qs = in.nextInt();
		int guessed = in.nextInt();
		int actual = in.nextInt();
		
		System.out.println(qs - (guessed - actual));
	}
}
