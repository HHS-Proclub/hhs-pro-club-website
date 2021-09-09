import java.util.Scanner;

public class PRA9 {
	
	public static void main(String[] args) {
		
		Scanner Kboard = new Scanner(System.in);
		int numOfSets = Kboard.nextInt();
		String garb = Kboard.nextLine();
		String[] lines = new String[numOfSets];
		int[] answerSet = new int[numOfSets];
		for(int i = 0; i<numOfSets; i++) {
			int total = 0;
			lines[i] = Kboard.nextLine();
			String[] eachNum = lines[i].split(" ");
			int[] numSet = new int[eachNum.length];
			boolean[] bools = new boolean[8];
			for(int j = 0; j<eachNum.length; j++) {
				numSet[j] = Integer.parseInt(eachNum[j]);
				int modded = numSet[j] % 7;
				bools[modded] = true;
			}
			for(int j = 0; j<7; j++) {
				if (bools[j] == true) {
					total++;
				}
			}
			answerSet[i] = total;
		}
		for(int i = 0; i<numOfSets; i++) {
			System.out.println(answerSet[i]);
		}
		
	}
	
}
