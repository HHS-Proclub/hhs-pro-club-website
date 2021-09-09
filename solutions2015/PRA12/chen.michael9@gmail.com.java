import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA12 {
	private static int[] candies;
	private static int m, k;
	private static boolean found = false;
	private static int ans = -1;
	public static void main(String[] args) {
			Scanner kboard = new Scanner(System.in);
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			int n = Integer.parseInt(token.nextToken());
			m = Integer.parseInt(token.nextToken());
			k = Integer.parseInt(token.nextToken());
			candies = new int[n];
			token = new StringTokenizer(kboard.nextLine());
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(token.nextToken());
				candies[i] = a;
			}
			Arrays.sort(candies);
			choose(0, 0, 0);
			System.out.println(ans);
	}
	public static void choose(int index, int sum, int chosen) {
		if (found) {
			return;
		}
		if (index == candies.length || chosen == m) {
			if (sum % k == 0 && chosen == m) {
				ans = sum;
				found = true;
			}
			return;
		}
		choose(index + 1, sum + candies[index], chosen + 1);
		choose(index + 1, sum, chosen);
	}
}
