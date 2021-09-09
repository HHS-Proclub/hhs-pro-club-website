import java.util.Scanner;

public class PRA8 {
	public static void main(String args[]) {
		Scanner Kboard = new Scanner(System.in);
		int numOfSamples = Kboard.nextInt();
		int[] nums = new int[numOfSamples];
		int[] answers = new int[numOfSamples];
		for (int i = 0; i <= numOfSamples-1; i++) {
			nums[i] = Kboard.nextInt();
		}
		int[] fibSeq = new int[50];
		fibSeq[0] = 0;
		fibSeq[1] = 1;
		for(int i = 2; i<=33; i++) {
			fibSeq[i] = fibSeq[i-2] + fibSeq[i-1];
		}

		for(int i = 0; i<= numOfSamples-1; i++) {
			for(int j = 1; j<= 33; j++) {
				if ((fibSeq[j]>nums[i]) && (nums[i]>fibSeq[j-1])) {
					int lower = fibSeq[j]-nums[i];
					int higher = nums[i]-fibSeq[j-1];
					if (higher<=lower) {
						answers[i] = higher;
					}
					else {
						answers[i] = lower;
					}
				}
			}
		}
		
		for(int i = 0; i<= numOfSamples-1; i++) {
			System.out.println(answers[i]);
		}
		
	}
}
