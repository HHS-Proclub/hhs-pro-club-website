import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		for (int i = 0; i < 5; i++) {
			 a = in.nextInt();
			 b = in.nextInt();
			 c = in.nextInt();
			 System.out.println(c / 5 <= b && c % 5 <= a);
		}
	}

}
