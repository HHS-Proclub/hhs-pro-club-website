import java.util.Scanner;


public class VSA1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String[] nums = kboard.nextLine().split(" ");
		int n = Integer.parseInt(nums[0].trim());
		int k = Integer.parseInt(nums[1].trim());
		int m = Integer.parseInt(nums[2].trim());
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = kboard.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int h = 0; h < m; h++) {
				for (int j = 0; j < k; j++) {
					for (int l = 0; l < m; l++)
						System.out.print(lines[i].charAt(j));
				}
				System.out.println();
			}
		}

	}

}
