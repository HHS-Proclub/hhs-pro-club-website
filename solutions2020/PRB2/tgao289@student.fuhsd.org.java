import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int answer = 0;
		for (int i = 0; i < 5; i++) {
			answer = answer + kboard.nextInt();
		}
		kboard.close();
		System.out.println(answer);
	}
}
