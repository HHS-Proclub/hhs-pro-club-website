import java.util.*;
import java.io.*;

public class PRB9 {
	private String string;
	
	public PRB9 (String s) {
		string = s;
	}
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		PrintStream console = new PrintStream(System.out, true);
		PRB9 obj = new PRB9(kboard.next());
		console.println(obj.getShortestPalindromeLength());
		kboard.close();
		console.close();
	}
	
	public int getShortestPalindromeLength() {
		int length = 0;
//		String s1 = new StringBuffer(string).reverse().toString();
//		String s2 = string + s1;
//		
//		length = s2.length();
		length = string.length() * 2 - 1;
		
		return length;
	}
}
