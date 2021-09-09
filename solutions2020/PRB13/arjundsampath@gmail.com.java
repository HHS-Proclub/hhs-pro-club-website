//package PR_13;

import java.util.Scanner;

public class PRB13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		int[] k = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			k[i] = Integer.parseInt(s[i]);
		}
		int h = Math.min(k[0], Math.min(k[1], k[3]));
		int t = Math.min(k[0] - h, k[1] - h);
		System.out.println(h*142 + t*12);
	}

}
