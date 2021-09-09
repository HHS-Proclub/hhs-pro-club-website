import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);

		
		int numOfNums = Kboard.nextInt();
		String garbage = Kboard.nextLine();
		String sampleSetString = Kboard.nextLine();
		int event = Kboard.nextInt();
		int totalOfEvents = 0;
		int[] numSet = new int[numOfNums];
		
		String[] samples = sampleSetString.split(" ");
		for(int i=0; i<numOfNums; i++) {
			numSet[i] = Integer.parseInt(samples[i]);
			//System.out.println(numSet[i]);
		}
		
		for(int i=0; i<numOfNums; i++) {
			if(numSet[i] == event) {
				totalOfEvents++;
			}
		}

		double probability = (double)totalOfEvents/numOfNums;
		System.out.println((int)(probability*100));
	}
}
