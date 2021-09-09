import java.util.*;

public class PRB12 {
//	private static final int LETTER_OF_ALPHABETS = 26;
//	private ArrayList<ArrayList<String>> stringArray; // An ArrayList that holds ArrayLists that holds Strings? WTF?
	private ArrayList<String> stringList = new ArrayList<String>();
	private String string;
	private String longestString;
	
//	public PRB12 () {
//		if (length != s.length())
//			throw new IllegalArgumentException ("Length of string does not match number provided: " + length + " != " + s.length());
//		
//		stringArray = new ArrayList<ArrayList<String>>(LETTER_OF_ALPHABETS);
//		for (int i = 0; i < LETTER_OF_ALPHABETS; i++) {
//			alphabetArray.add(new ArrayList<String>());
//		}
//		stringList = new ArrayList<String>();
//	}
	
	public void setString (int length, String s) {
		if (length != s.length())
			throw new IllegalArgumentException ("Length of string does not match number provided: " + length + " != " + s.length());
		
		string = s;
	}
	
	public String findLongestString () {
		int baseIndex = 0;
		
		for (int i1 = baseIndex; i1 < string.length(); i1 = baseIndex) {
			String s = "";
			
			for (int i2 = i1; i2 < string.length(); i2++) {
				if (s.isEmpty()) {
					s += string.charAt(i2);
					baseIndex++;
				} else if (string.charAt(i2) == s.charAt(i2-baseIndex)) {
					s += string.charAt(i2);
					baseIndex++;
				} else {
					baseIndex = i2;
					break;
				}
			}
			
			stringList.add(s);
			
			if (i1 == string.length() - 1)
				break;
		}
		
		String s1 = "";
		for (String s2 : stringList) {
			if (s1.isEmpty())
				s1 = s2;
			else if (s1.length() < s2.length())
				s1 = s2;
		}
		
		longestString = s1;
		return s1;
	}
	
	public String getLongestString () {
		return longestString;
	}
	
	public int getLongestStringLength () {
		return longestString.length();
	}
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		int i = kboard.nextInt();
		kboard.nextLine();
		String s = kboard.nextLine();
		PRB12 obj = new PRB12();
		obj.setString(i, s);
		obj.findLongestString();
		System.out.println(obj.getLongestStringLength());
		kboard.close();
	}
}
