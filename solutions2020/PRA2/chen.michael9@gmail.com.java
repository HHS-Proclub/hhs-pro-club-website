import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int dist = Integer.parseInt(kboard.nextLine());
		int total = Integer.parseInt(kboard.nextLine());
		boolean good = true;
		double sum = 0;
		int ans = 0;
		while (sum < total) {
			if (good) {
				sum += dist;
			} else {
				sum += dist / 2.0;
			}
			good = !good;
			ans++;
		}
		System.out.println(ans);
	}
}
