//package junior.PR_01;

import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for (int i = 0; i < x; i++) {
			int year = in.nextInt();
			int test = year + 1;
			while (!isDistinct(test)) {
				test++;
			}
			System.out.println(test);
		}
		in.close();
	}

	public static boolean isDistinct(int x) {
		int o = x % 10;
		int t = (x % 100) / 10;
		int h = (x % 1000) / 100;
		int T = (x % 10000) / 1000;
		return (o != t && o != h && o != T && t != h && t != T && h != T);

	}
}
