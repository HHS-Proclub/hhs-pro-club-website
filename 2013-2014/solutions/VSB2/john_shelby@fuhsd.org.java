import java.util.Scanner;


public class VSB2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] nums = new Scanner(System.in).nextLine().split(" ");
		int m = Integer.parseInt(nums[0]);
		int n = Integer.parseInt(nums[1]);
		for (int i = 1; i <= m; i++) {
			System.out.println(i*n);
		}
	}

}
