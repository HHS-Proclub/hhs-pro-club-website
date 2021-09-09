//package PR_12;

import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cases; i++) {
			String test = in.nextLine();
			String out = "";
			for (int j = 0; j < test.length() / 2; j++) {
				out+=test.charAt(j);
			}
			System.out.println(out);
		}
		in.close();
	}
}
