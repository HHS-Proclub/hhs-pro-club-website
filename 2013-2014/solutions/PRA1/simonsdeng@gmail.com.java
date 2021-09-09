import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		in.nextLine();
		char[] s = in.nextLine().toCharArray();
		in.close();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == ' ') {
				s[i] = ' ';
			} else {
				s[i] = (char) ((s[i] - 'a' + N) % 26 + 'a');
			}
		}
		
		System.out.println(s);
	}

}
