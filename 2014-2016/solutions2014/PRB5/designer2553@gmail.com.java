import java.util.Scanner;

public class PRB5 {
	
	public String removeNots (String s) {
		while (s.contains("not ")) {
			s = s.replaceAll("not ", "");
		}
		return s;
	}
	
	public static void main (String[] args) {
		Scanner kboard = new Scanner (System.in);
		String s = kboard.nextLine();
		PRB5 p = new PRB5 ();
		s = p.removeNots(s);
		System.out.println(s);
	}
}
