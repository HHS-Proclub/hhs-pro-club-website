import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA22 {
	private static int ans = 0;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			int goodValue = Integer.parseInt(kboard.nextLine());
			StringTokenizer token = new StringTokenizer(kboard.nextLine());
			ArrayList<Integer> values = new ArrayList<Integer>();
			while (token.hasMoreTokens()) {
				values.add(Integer.parseInt(token.nextToken()));
			}
			check(0, values, 1, goodValue, false);
			System.out.println(ans);
			ans = 0;
		}
	}
	
	public static void check(int current, ArrayList<Integer> values, long product, int goodValue, boolean multiplied) {
		if (current == values.size()) {
			if (product == goodValue && multiplied) {
				ans++;
			}
			return;
		}
		check(current + 1, values, product * values.get(current), goodValue, true);
		check(current + 1, values, product, goodValue, multiplied || false);
	}
}
