import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		int N = in.nextInt();
		in.nextLine();
		String cipher = in.nextLine();
		String encrypt = "";

		for (int i = 0; i < cipher.length(); i++) {
			char c = cipher.charAt(i);
			if (Character.isLetter(c))
				encrypt += alpha[(c - 'a' + N) % alpha.length];
			else
				encrypt += ' ';
		}

		System.out.println(encrypt);
	}

}
