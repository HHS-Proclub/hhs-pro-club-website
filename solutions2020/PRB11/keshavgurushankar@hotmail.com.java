//package PR_11;

import java.util.Scanner;

public class PRB11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] nums = in.nextLine().split(" ");
		in.close();
		int dist = Integer.parseInt(nums[0]), angle = Integer.parseInt(nums[1]); 
		System.out.println((int)(.5*dist*dist*Math.sin(Math.toRadians(angle))*Math.cos(Math.toRadians(angle))));
	}
}
