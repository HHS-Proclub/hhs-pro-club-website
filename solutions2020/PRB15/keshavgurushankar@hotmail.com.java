//package PR_15;

import java.util.Scanner;

public class PRB15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int questions = Integer.parseInt(in.nextLine());
		int guess = Integer.parseInt(in.nextLine());
		int actual = Integer.parseInt(in.nextLine());
		System.out.println(questions - Math.abs(actual - guess));
	}
}
