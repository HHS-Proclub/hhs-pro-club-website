import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String s = kboard.nextLine();
		int[] letters = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if ((int)(s.charAt(i))>=97&&(int)(s.charAt(i))<=122) {
				letters[s.charAt(i) - 97]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (letters[i] > 0) {
				System.out.println((char)(i + 97) + " " + letters[i]);
			}
		}
	}
}
