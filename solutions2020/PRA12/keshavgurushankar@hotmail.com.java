//package PR_12;

import java.util.Scanner;

public class PRA12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cases; i++) {
			System.out.println(rem2(in.nextLine()));
		}
	}

	public static String rem2(String a) {
		String in = a;
		if (in.equals("")) {
			return "Possible";
		} else {
			for (int i = 0; i <= in.length() - 2; i++) {
				char one = in.charAt(i),two = in.charAt(i+1);
				if (one == two) {
					return rem2(in.replaceFirst(String.valueOf(one)+String.valueOf(two), ""));
					
				}
			}
		return "Impossible";
		}
	}
}
