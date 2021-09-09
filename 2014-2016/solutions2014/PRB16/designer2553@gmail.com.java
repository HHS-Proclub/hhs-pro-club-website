import java.util.*;

public class PRB16 {
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = kboard.nextInt();
		}
		
		Arrays.sort(nums);
		System.out.println(nums[nums.length-1]);
		kboard.close();
	}
}
