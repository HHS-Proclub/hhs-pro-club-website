import java.util.Scanner;


public class PRB13 {

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();

		boolean result = true;
		while (s.length() > 1) {
			if (!Character.isLetter(s.charAt(0)))
				s = s.substring(1);
			else if (!Character.isLetter(s.charAt(s.length() - 1)))
				s = s.substring(0, s.length() - 1);
			else {
				if (s.charAt(0) != s.charAt(s.length() - 1)) {
					result = false;
					break;
				}
				s = s.substring(1, s.length() - 1);
			}
		}
		return result;
	}
	
	public static void main (String[] args){
		Scanner k = new Scanner(System.in);
		System.out.println(PRB13.isPalindrome(k.nextLine()));
		k.close();
	}
}
