import java.util.Scanner;

public class PRA12 {

	public static String shorten(String s) {
		if(s == "") {
			return s;
		}
		else {
			boolean twoInRow = false;
			int place = 0;
			for(int i = 0; i < s.length()-1; i++) {
				if(s.charAt(i) == s.charAt(i+1)) {
					twoInRow = true;
					place = i;
					break;
				}
			}
			if(!twoInRow) {
				return s;
			}
			else {
				if(place<s.length()-2) {
					s = s.substring(0, place)+s.substring(place+2);
				}
				else {
					s = s.substring(0, place);
				}
				return shorten(s);
			}
		}
	}

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		String[] outputs = new String[n];
		for(int i = 0; i < n; i++) {
			String s = kboard.nextLine();
			String str = shorten(s);
			if(str.length()==0) {
				outputs[i] = "Possible";
			}
			else {
				outputs[i] = "Impossible";
			}
		}
		for(int j = 0; j< n; j++) {
			System.out.println(outputs[j]);
		}
	}

}
