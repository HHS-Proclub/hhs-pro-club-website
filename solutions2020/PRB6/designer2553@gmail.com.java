import java.util.Arrays;
import java.util.Scanner;

public class PRB6 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[5];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);
		System.out.println(nums[4]);
	}
}
