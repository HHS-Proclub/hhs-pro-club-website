import java.util.Scanner;

public class PRB3 {
	public static void main (String[] args) {
	Scanner kboard = new Scanner(System.in);
		int a = kboard.nextInt();
		for (int v = 0; v < a ;v++){
			int x = kboard.nextInt();
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					System.out.println(i);
				}
			}
		}
	
	}
}
