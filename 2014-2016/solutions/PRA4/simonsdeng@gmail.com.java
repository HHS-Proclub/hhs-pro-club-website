import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] letters = new char[N];
		letters[0] = 'a';
		for (int i = 1; i < N; i++) letters[i] = (char) (letters[i - 1] + 1);
		printPermutations(letters, "");
	}

	private static void printPermutations(char[] letters, String prefix) {
		if (letters.length == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < letters.length; i++) {
				char[] remaining = new char[letters.length - 1];
				System.arraycopy(letters, 0, remaining, 0, i);
				System.arraycopy(letters, i + 1, remaining, i, letters.length - i - 1);
				printPermutations(remaining, prefix + letters[i]);
			}
		}
	}
}
