import java.util.Arrays;
import java.util.Scanner;

public class PRB14 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int trials = in.nextInt();
		in.nextLine();
		
		for (int t = 0; t < trials; t++) {
			String[] numStrs = in.nextLine().split(" ");
			int[] nums = new int[numStrs.length];
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(numStrs[i]);
			}
			Arrays.sort(nums);
			
			int tot = 1;
			for (int i = 0; i < nums.length && nums[i] <= tot; i++) {
				tot += nums[i];
			}
			
			System.out.println(tot);
		}
	}
}
