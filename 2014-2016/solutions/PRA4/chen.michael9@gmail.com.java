import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	private static int n;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		n = Integer.parseInt(kboard.nextLine());
		boolean[] used = new boolean[n];
		Arrays.fill(used, false);
		perm("", used, 0);
	}
	public static void perm(String current, boolean[] used, int currentPos) {
		if (currentPos == n) { 
			System.out.println(current);
		} else {
			for (int i = 0; i < n; i++) {
				if (used[i] == false) {
					boolean[] s = new boolean[n];
					for (int j = 0; j < n; j++) {
						s[j] = used[j];
					}
					s[i] = true;
					perm(current + (char)(i + 97), s, currentPos + 1);
				}
			}
		}
	}
}
