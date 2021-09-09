import java.util.*;

/* Ritwik Dixit 2015
 * @Soham this was too easy
 */

public class PRA16 {
		
	private static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int base = Integer.parseInt((new Scanner(System.in).nextLine()));
		for (int i = 1; i <= 300; i++) {
			String squareStr = Integer.toString(i*i, base).toUpperCase();
			if (isPalindrome(squareStr))
				System.out.println(Integer.toString(i, base).toUpperCase() + " " + squareStr);
		}
	}

}
