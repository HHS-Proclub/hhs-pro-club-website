import java.util.ArrayList;
import java.util.Scanner;


public class PRB4 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int m = Integer.parseInt(kboard.nextLine());
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			String w = kboard.nextLine();
			char firstL = w.charAt(0);
			if (firstL == 'a' || firstL == 'e' || firstL == 'i' || firstL == 'o' || firstL == 'u') {
				w += "way";
			} else {
				w = w.substring(1)+firstL+"ay";
			}
			words.add(w);
		}
		for (String s : words)
			System.out.println(s);
	}
	
}
