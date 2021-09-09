import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB7 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(token.nextToken());
			nums[i] = x;
		}
		int j = Integer.parseInt(kboard.nextLine());
		int total = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == j) {
				total++;
			}
		}
		System.out.println((int)((double)total / n * 100));
	}
}
