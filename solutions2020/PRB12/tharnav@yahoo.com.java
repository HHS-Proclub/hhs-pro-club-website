import java.util.Scanner;

public class PRB12 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int tests = Kboard.nextInt();
		String[] answers = new String[tests];
		
		for(int i = 0; i < tests; i++) {
			String strTest = Kboard.next();
			double len = (double)(strTest.length())/2+0.5;
			int length = (int)len;
			answers[i] = strTest.substring(0, length);
		}
		
		for(int i = 0; i< tests; i++) {
			System.out.println(answers[i]);
		}
	}
}
