import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String profanity = in.nextLine();
		String censored = in.nextLine();
		int[][] levenshtein = new int[profanity.length() + 1][censored.length() + 1];
		for (int i = 0; i <= profanity.length(); i++) levenshtein[i][0] = i;
		for (int i = 0; i <= censored.length(); i++) levenshtein[0][i] = i;
		for (int i = 1; i <= profanity.length(); i++) {
			for (int j = 1; j <= censored.length(); j++) {
				if (profanity.charAt(i - 1) == censored.charAt(j - 1)) {
					levenshtein[i][j] = levenshtein[i - 1][j - 1];
				} else {
					levenshtein[i][j] = Math.min(
							levenshtein[i - 1][j], Math.min(
							levenshtein[i][j - 1],
							levenshtein[i - 1][j - 1])) + 1;
				}
			}
		}
		System.out.println(levenshtein[profanity.length()][censored.length()]);
	}
}
