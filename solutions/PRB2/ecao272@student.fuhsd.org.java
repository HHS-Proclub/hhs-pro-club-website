import java.util.Scanner;

public class PRB2 {

	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		String next = sc.nextLine();
		System.out.println();
		for (int h = 0; h < T; h++) {
			String firstLine = sc.nextLine();
			String secondLine = sc.nextLine();
			String thirdLine = sc.nextLine();
			if (countNumberOfVowels(firstLine) == 5 && countNumberOfVowels(secondLine) == 7 && countNumberOfVowels(thirdLine) == 5) {
				System.out.println("YES");
			}
			else {

				System.out.println("NO");
			}
				
		}
	}
	public static int countNumberOfVowels(String s) {
		int vowels = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				vowels++;
			}
		}
		return vowels;
	}
}
