import java.util.Scanner;

public class PRA10 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int numOfIntervals = Kboard.nextInt();
		int[] answer = new int[numOfIntervals];
		for(int i = 0; i < numOfIntervals; i++) {
			int firstInterval = Kboard.nextInt();
			if (firstInterval==1) firstInterval++;
			int lastInterval = Kboard.nextInt();
			for (int j = firstInterval; j <= lastInterval; j++) {
				String firstString = j+"";
				int bool = 1;
				for(int k = 0; k <= firstString.length()-1; k++) {
					if (firstString.charAt(k) != firstString.charAt(firstString.length()-k-1)) {
						bool = 0;
						break;
					}
				}
				if (bool == 1) {
					for(int k = 2; k <= Math.sqrt(j); k++) {
						if(j%k == 0) {
							bool = 0;
						}
					}
				}
				if (bool == 1) {
					answer[i]++;
				}
			}
		}
		for(int i = 0; i <= answer.length-1; i++) {
			System.out.println(answer[i]);
		}
	}
}
