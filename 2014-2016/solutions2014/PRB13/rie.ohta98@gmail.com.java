
import java.util.Scanner;

public class PRB13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next().toLowerCase();
		int length = a.length();
		for (int i = 0; i < length/2; i++) {
			char c1 = a.charAt(i);
			char c2 = a.charAt(length-1-i);
			if (c1 != c2) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		
		in.close();
	}
}
