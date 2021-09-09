
public class PRB13 {
	
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
	
	public static void main (String[] args) {
		System.out.println(isPalindrome(new java.util.Scanner(System.in).nextLine()));
	}
}
