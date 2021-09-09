//package junior.PR_01;

import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println(in.nextInt() + in.nextInt());
		}
	}

}
