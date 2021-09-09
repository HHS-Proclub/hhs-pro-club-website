import java.util.*;


public class PRA8 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int b = kboard.nextInt();
		
		for (int i = 1; i <= 300; i++) {
			int square = (int)Math.pow(i, 2);
			
			if (isPalindrome(Integer.toString(square, b))) {
				System.out.println(Integer.toString(i, b) + " " + Integer.toString(square, b));
			}
		}
		
		kboard.close();
	}

	public static boolean isPalindrome(String s) {
		String s1 = "";
		String s2 = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if (Character.isLetter(x) || Character.isDigit(x))
				s1 += x;
		}
		
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			return true;
		} else {
			return false;
		}
	}
	
}
