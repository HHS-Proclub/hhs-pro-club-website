import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int number = Integer.parseInt(kboard.nextLine());
		String[]x = new String[number];
		String[]answer = new String[number];
		for (int i = 0; i < number; i ++) {
			x[i] = kboard.nextLine();
			for (int y = 0; y < x.length; y ++) {
				char first = x[i].charAt(0);
				char second = x[i].charAt(1);
				if (first == 'a' && second == 'b') {
					answer[i] = x[i];
				}
				else if (first == 'a') {
					answer[i] = first + x[i].substring(2, x[i].length());
				}
				else if (second == 'b') {
					answer[i] = x[i].substring(1, x[i].length());
				}
				else {
					answer[i] = x[i].substring(2, x[i].length());
				}
			}
		}
		kboard.close();
		for (int i = 0; i < number; i++) {
			System.out.println(answer[i]);
		}
	}
}
