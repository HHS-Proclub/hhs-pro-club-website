import java.util.Scanner;

public class PRB4 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int multiples = in.nextInt();
		
		for (int i = 1; i <= multiples; i++) {
			System.out.println(base * i);
		}
	}
}
