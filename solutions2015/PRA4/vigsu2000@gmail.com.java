import java.util.ArrayList;
import java.util.Scanner;

public class PRA4 {

	public static ArrayList<String> performPermutations(String s){
		ArrayList<String> arrayList = new ArrayList<String>();
		if (s == null) {
			return null;
		}

		else if (s.length() == 0) {
			arrayList.add("");
			return arrayList;
		}

		else {
			for (int i = 0; i < s.length(); i++) {
				ArrayList<String> remaining = performPermutations(s.substring(0, i) + s.substring(i + 1));
				for (int j = 0; j < remaining.size(); j++) {
					arrayList.add(s.charAt(i) + remaining.get(j));
				}
			}
			return arrayList;
		}
	}
	
	public static String intToString(int i) {
		char[] alphabet = new char[26];
		char alph = 'a';
		for(int a = 0; a < 26; a++) {
			alphabet[a] = alph;
			alph = (char) (alph+1);
		}
		String s = "";
		for(int b = 0; b < i; b++) {
			s += alphabet[b];
		}
		return s;
	}
	
	public static ArrayList<String> act(int i) {
		return performPermutations(intToString(i));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j = s.nextInt();
		ArrayList<String> a = act(j);
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
