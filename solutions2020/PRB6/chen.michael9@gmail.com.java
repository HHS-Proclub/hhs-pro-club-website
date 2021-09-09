import java.util.Arrays;
import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(kboard.nextLine());
		}
		Arrays.sort(nums);
		if (nums[0] + nums[1] + nums[2] + nums[3] == nums[4]) {
			System.out.println(nums[4]);
		} else {
			System.out.println(nums[0] + nums[1] + nums[2] + nums[3] + nums[4]);
		}
	}
}
