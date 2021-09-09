
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] nums = new int[2];
		for (int i = 0; i < 2; i++) {
			String line = input.nextLine();
			nums[i] = Integer.parseInt(line);
		}
		System.out.println((int)Math.ceil(2*nums[1]/(nums[0]*1.5)));
		
	}
}
