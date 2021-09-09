import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB23 {
	public static void main(String[] args) {
		Scanner kobard = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(kobard.nextLine());
		String ans = "";
		while (token.hasMoreTokens()) {
			ans += token.nextToken().charAt(0);
		}
		System.out.println(ans);
	}
}
