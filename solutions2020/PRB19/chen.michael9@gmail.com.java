import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB19 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			if (a == 0 || b == 0 || c == 0 || b == 1 || c == 1 || c== 2) {
				System.out.println(-1);
			} else {
				int ans = 0;
				if (b >= c) {
					ans += (b - (c - 1));
					b = c - 1;
				} 
				if (a >= b) {
					ans += (a - (b - 1));	
				}
				System.out.println(ans);
			}
		}
	}
}
