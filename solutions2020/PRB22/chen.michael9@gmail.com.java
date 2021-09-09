import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB22 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String diet = kboard.nextLine();
		String breakf = kboard.nextLine();
		String lunch = kboard.nextLine();
		for (int i = 0; i < breakf.length(); i++) {
			if (diet.indexOf(breakf.charAt(i)) == -1) {
				System.out.println("CHEATER");
				System.exit(0);
			} else {
				diet = diet.substring(0, diet.indexOf(breakf.charAt(i))) + diet.substring(diet.indexOf(breakf.charAt(i)) + 1);
			}
			//System.out.println(diet);
		}
		for (int i = 0; i < lunch.length(); i++) {
			if (diet.indexOf(lunch.charAt(i)) == -1) {
				System.out.println("CHEATER");
				System.exit(0);
			} else {
				diet = diet.substring(0, diet.indexOf(lunch.charAt(i))) + diet.substring(diet.indexOf(lunch.charAt(i)) + 1);
			}
			//System.out.println(diet);
		}
		char[] fin = diet.toCharArray();
		Arrays.sort(fin);
		System.out.println(new String(fin));
	}
}
