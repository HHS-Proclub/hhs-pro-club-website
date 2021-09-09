import java.util.Scanner;

public class PRA2 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		String s1 = s.next();
		char[] chars = s1.toCharArray();
		String s2 = s.next();
		
		int existingLetters = 0;
		
		Outerloop: for (int r = 0; r < s2.length(); r++) {
			char ch = s2.charAt(r);
			
			for (int c = 0; c < s1.length(); c++) {
				if (ch != 0 && ch == chars[c]) {
					existingLetters++;
					chars[c] = 0;
					continue Outerloop;
				}
			}
		}
		
		int actionsNeeded = s1.length()-existingLetters;
		
		if (s1.length() < s2.length()) {
			actionsNeeded += s2.length()-s1.length();
		}
		
		System.out.println(actionsNeeded);
		s.close();
	}
}
