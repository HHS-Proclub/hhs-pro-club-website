import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int probs = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < probs; i++) {
			String prob = scan.nextLine();
			String[] nums = prob.split(" ");
			System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
		}
		
		scan.close();
	}

}
