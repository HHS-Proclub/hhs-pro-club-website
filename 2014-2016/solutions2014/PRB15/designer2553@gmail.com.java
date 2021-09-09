import java.util.*;

public class PRB15 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		String[] strings = new String[n];
		
		for (int i = 0; i < strings.length; i++) {
			strings[i] = kboard.next();
		}
		
		boolean[] results = verify(strings);
		
		for (int i = 0; i < strings.length; i++) {
			if (results[i])
				System.out.println("VALID");
			else
				System.out.println("INVALID");
		}
		
		kboard.close();
	}
	
	private static boolean[] verify (String[] strings) {
		boolean[] results = new boolean[strings.length];
		
		for (int i = 0; i < results.length; i++) {
			if (strings[i].charAt(0) == '_' || strings[i].charAt(0) == '.') {
				results[i] = secondaryVerification(strings[i]);
			} else {
				results[i] = false;
			}
		}
		
		return results;
	}
	
	private static boolean secondaryVerification (String string) {
		boolean b = false;
		
		if (Character.isDigit(string.charAt(1))) {
			int i = 2;
			while (i < string.length() && Character.isDigit(string.charAt(i))) i++;
			
			if (i < string.length()) b = furtherVerification(string, i);
			else {
				i--;
				if (string.charAt(i) == '_' || Character.isDigit(string.charAt(i))) b = true;
			}
		}
		
		return b;
	}
	
	private static boolean furtherVerification (String string, int i) {
		boolean b = false;
		
		if (Character.isLetter(string.charAt(i))) {
			i++;
			while (i < string.length() && Character.isLetter(string.charAt(i))) i++;
			
			if (i == string.length()) i--;
			
			if (string.charAt(i) == '_' || Character.isLetter(string.charAt(i))) b = true;
		} else if (string.charAt(i) == '_') {
			b = true;
		}
		
		return b;
	}
	
}
