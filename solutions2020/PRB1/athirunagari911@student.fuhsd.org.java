package money;

import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			ans[i] = x+y;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
	}
}