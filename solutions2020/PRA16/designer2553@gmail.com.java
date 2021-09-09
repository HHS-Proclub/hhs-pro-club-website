import java.util.Arrays;
import java.util.Scanner;

public class PRA16 {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int cs = in.nextInt();
		in.nextLine();
		
		for (int c = 0; c < cs; c++) {
			// Translation guide:
			// Club 2 = 0, Club A = 12
			// Diamond 2 = 13, Diamond A = 25
			// Heart 2 = 26, Heart A = 38
			// Spade 2 = 39, Spade A = 51
			
			String set = in.nextLine();
			int[] cardNums = new int[set.length()/2];
			
			// Translation phase
			for (int i = 0; i < set.length(); i += 2) {
				char a = set.charAt(i), b = set.charAt(i+1);
				int cardNum = 0;
				
				// Yes, neither this nor the other sets are efficient,
				// but they are all we have to work with.
				if (a == 'D') {
					cardNum = 13;
				} else if (a == 'H') {
					cardNum = 26;
				} else if (a == 'S') {
					cardNum = 39;
				}
				
				if (b <= '9') {
					cardNum += (b - 50);
				} else if (b == 'T') {
					cardNum += 8;
				} else if (b == 'J') {
					cardNum += 9;
				} else if (b == 'Q') {
					cardNum += 10;
				} else if (b == 'K') {
					cardNum += 11;
				} else {
					cardNum += 12;
				}
				
				cardNums[i/2] = cardNum;
			}
			
			Arrays.sort(cardNums);
			
			// Reverse translation phase
			String sortedSet = "";
			for (int i = 0; i < cardNums.length; i++) {
				int cardNum = cardNums[i];
				int quotient = cardNum / 13; // Abusing integral math for fun and profit
				int remainder = cardNum % 13;
				
				if (quotient == 0) {
					sortedSet += "C";
				} else if (quotient == 1) {
					sortedSet += "D";
				} else if (quotient == 2) {
					sortedSet += "H";
				} else {
					sortedSet += "S";
				}
				
				if (remainder <= 7) {
					sortedSet += (char)(remainder + 50);
				} else if (remainder == 8) {
					sortedSet += 'T';
				} else if (remainder == 9) {
					sortedSet += 'J';
				} else if (remainder == 10) {
					sortedSet += 'Q';
				} else if (remainder == 11) {
					sortedSet += 'K';
				} else {
					sortedSet += 'A';
				}
			}
			
			System.out.println(sortedSet);
		}
	}
}
