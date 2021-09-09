
public class PRB8 {

	public static void main(String[] args) {
		java.util.Scanner kboard = new java.util.Scanner(System.in);
		java.io.PrintStream console = new java.io.PrintStream(System.out);
		String s1 = kboard.next();
		String s2 = kboard.next();
		String s3 = "";
		String s4 = "";
		
		for (int r = 0; r < s1.length(); r++) {
			int timesNotMatchingChars = 0;
			
			for (int c = 0; c < s2.length(); c++) {
				
				if (s1.charAt(r) == s2.charAt(c)) {
					break;
				} else {
					timesNotMatchingChars++;
				}
				
				if (timesNotMatchingChars == s2.length()) {
					s4 += s1.charAt(r);
				}
			}
		}
		
		for (int r = 0; r < s2.length(); r++) {
			int timesNotMatchingChars = 0;
			
			for (int c = 0; c < s1.length(); c++) {
				
				if (s2.charAt(r) == s1.charAt(c)) {
					break;
				} else {
					timesNotMatchingChars++;
				}
				
				if (timesNotMatchingChars == s1.length()) {
					s3 += s2.charAt(r);
				}
			}
		}
		
		if (s3.length() == 0)
			s3 += "NONE";
		if (s4.length() == 0)
			s4 += "NONE";
		
		console.println(s3);
		console.println(s4);
		kboard.close();
	}

}
