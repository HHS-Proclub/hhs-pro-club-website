import java.util.*;

public class PRB7 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String arr = a.next();
		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			if (Character.isDigit(arr.charAt(i))) {
				count++;
			}
		}
		int[] real = new int[count];
		int tally = 0;
		for (int i = 0; i < arr.length(); i++) {
			if (Character.isDigit(arr.charAt(i))) {
				real[tally] = Integer.parseInt(Character.toString(arr.charAt(i)));
				tally++;
			}
		}
		System.out.println(countClumps(real));
	}

	public static int countClumps(int[] nums) {
		boolean inclump = false;
		int clumpcnt = 0;
		// note the start-from-1 loop
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				// we are in a clump
				if (!inclump) {
					// this is the first time for this clump.
					inclump = true;
					clumpcnt++;
				}
			} else {
				inclump = false;
			}
		}
		return clumpcnt;
	}
}
