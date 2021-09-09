import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA9 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			boolean a = false, b = false, c = false, d = false, e = false, f = false, g = false;
			int sum = 0;
			while (token.hasMoreTokens()) {
				int next = Integer.parseInt(token.nextToken());
				int mod = next % 7;
				if (mod == 1) {
					if (!a) {
						a = true;
						sum++;
					}
				} else if (mod == 2) {
					if (!b) {
						b = true;
						sum++;
					}
				} else if (mod == 3) {
					if (!c) {
						c = true;
						sum++;
					}
				} else if (mod == 4) {
					if (!d) {
						d = true;
						sum++;
					}
				} else if (mod == 5) {
					if (!e) {
						e = true;
						sum++;
					}
				} else if (mod == 6) {
					if (!f) {
						f = true;
						sum++;
					}
				} else {
					if (!g) {
						g = true;
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
