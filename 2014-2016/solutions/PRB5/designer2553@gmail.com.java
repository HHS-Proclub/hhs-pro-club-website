import java.util.Scanner;

public class PRB5 {
	private static final int PRELUDE_TO_LOWERCASE = 97;

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		String s = kboard.next();
		int[] letterCounts = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			letterCounts[c-PRELUDE_TO_LOWERCASE]++;
		}
		
		for (int i = 0; i < letterCounts.length; i++) {
			if (letterCounts[i] > 0)
				System.out.printf("%c %d%n", PRELUDE_TO_LOWERCASE+i, letterCounts[i]);
		}
	}

}
