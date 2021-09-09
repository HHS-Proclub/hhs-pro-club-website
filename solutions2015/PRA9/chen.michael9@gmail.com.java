import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA9 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int[] nums = new int[n];
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(nums);
		int cost = 0;
		for (int i = nums.length - 1; i >= 0; i -= 4) {
			cost += nums[i];
			if (i - 1 >= 0) {
				cost += nums[i - 1];
			}
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(cost);
	}
}
