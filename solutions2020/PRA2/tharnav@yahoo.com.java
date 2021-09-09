import java.util.Scanner;

public class PRA2 {
	static String original = "";
	static String finalStuff = "";
	static String[] answers;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int testcases = kboard.nextInt();
		answers = new String[testcases];
		for(int i = 0; i < testcases; i++) {
			int n = kboard.nextInt();
			for(int k = 0; k < n; k++) {
				original = original+""+kboard.nextInt();
			}
			for(int k = 0; k < n; k++) {
				finalStuff = finalStuff+""+kboard.nextInt();
			}
			String newString = original.replace("0", "");
			String theOther = finalStuff.replace("0", "");
			theOther = theOther.substring(theOther.indexOf(newString.charAt(0))) + theOther.substring(0, theOther.indexOf(newString.charAt(0)));
			//System.out.println(theOther+" "+newString);
			if(newString.equals(theOther)) {
				answers[i] = "YES";
			} else {
				answers[i] = "NO";
			}
			original = "";
			finalStuff = "";
		}
		for(int i = 0; i < testcases; i++) {
			System.out.println(answers[i]);
		}
	}
}
