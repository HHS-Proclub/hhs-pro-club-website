import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i <n; i++) {
			String s = kboard.nextLine();
			System.out.println(s.substring(0, s.length() / 2));
		}
	}
}
