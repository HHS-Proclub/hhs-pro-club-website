import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int problems = Integer.parseInt(s.nextLine());
		while(problems>0) {
			problems--;
			String next = s.nextLine();
			String[] nums = next.split(" ");
			System.out.println((Integer.parseInt(nums[0])*Integer.parseInt(nums[1])));
		}
	}
}
