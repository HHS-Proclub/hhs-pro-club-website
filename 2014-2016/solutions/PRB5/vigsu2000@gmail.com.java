import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRB5 {

	public static String toAlphaOrder(String s) {
		ArrayList<Character> c = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++) {
			c.add(s.charAt(i));
		}
		return "";
	}

	public static String countLetters(String s, char c) {
		int counter = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				counter++;
			}
		}
		String output = "";
		if(counter > 0) {
			output = c+" "+counter;
		}
		return output;
	}

	public static ArrayList<String> countAllLetters(String s) {
		ArrayList<String> list = new ArrayList<String>();
		while(s.length() != 0) {
			list.add(countLetters(s, s.charAt(0)));
			s = s.replaceAll(s.charAt(0)+"", "");
		}
		return alphaOrder(list);
	}
	
	public static ArrayList<String> alphaOrder(ArrayList<String> list) {
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> list = countAllLetters(str);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
