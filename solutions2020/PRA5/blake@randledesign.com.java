

import java.util.Scanner;

public class PRA5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeats = input.nextInt();
		for(int x = 0; x < repeats; x++) {
			input.nextLine();
			String s = input.nextLine();
			int row = 0; // keeps track of consonants in row
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
					row = 0;
				} else {
					row++;
				}
				if(row > 2) {
					if(!isAllSame(row,i,s)) {
						s = new StringBuilder(s).insert(i, " ").toString();
						row = 0;
					}
					
				}
			}
			System.out.println(s);
		}
		input.close();

	}

	private static boolean isAllSame(int row, int pos, String s) { // checks if row characters are all equal starting from pos going backwards
		char original = s.charAt(pos);
		for(int i = 1; i < row; i++) {
			if(s.charAt(pos-i) != original)
				return false;
		}
		return true;
	}
}
