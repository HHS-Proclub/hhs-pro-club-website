import java.util.Scanner;

public class PRA11 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int[] answers = new int[3];
		for(int i = 0; i < 3; i++) {
			String line = Kboard.nextLine();
			String[] nums = line.split(" ");
			int[] numbers = new int[nums.length];
			for(int j = 0; j < nums.length; j++) {
				numbers[j] = Integer.parseInt(nums[j]);
			}
			int[][] multD = new int[1000000][2];
			for(int j = 0; j< numbers.length; j++) {
				multD[numbers[j]][0]++;
				multD[numbers[j]][1] = j;
					}
			int highest = 0;
			int answer = 0;
			for(int j = 0; j< 1000000; j++) {
				if (multD[j][0] != 0) {
					if (multD[j][0] > highest) {
						highest = multD[j][0];
						answer = j;
					}
					else if (multD[j][0] == highest) {
						if(multD[j][1] < multD[answer][1])
							answer = j;
					}
				}
			}
			answers[i] = answer;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(answers[i]);
		}
	}
}
