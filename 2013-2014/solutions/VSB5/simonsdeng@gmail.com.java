import java.util.Scanner;

public class VSB5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		in.close();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j == i || j == N - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}