import java.util.Scanner;


public class PRA1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = Integer.parseInt(k.nextLine());
		StringBuffer in = new StringBuffer(k.nextLine());
		int l = in.length();
		for (int i = 0; i < l; i++) {
			char a = in.charAt(i);
			if (a != ' ')
				in.setCharAt(i, (char)((a+n-'a')%26+'a'));
		}
		System.out.println(in);
	}
}
