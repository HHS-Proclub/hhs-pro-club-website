
import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLines = new String[5];
		for (int i = 0; i < 5; i++) {
			String line = input.nextLine();
			inputLines[i] = line;
		}
		
		for (String line : inputLines) {
			String[] vals = line.split(" ");
			int[] nums = new int[3];
			for (int i = 0; i < 3; i++)
				nums[i] = Integer.parseInt(vals[i]);
			System.out.println(nums[2] <= nums[0] + nums[1]*5 && nums[2]%5 <= nums[0]);
		}
	}
}
