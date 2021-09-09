import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB8 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		int first = Integer.parseInt(token.nextToken()), second = Integer.parseInt(token.nextToken());
		int gcd = findGCD(first, second);
		System.out.println(second / gcd * first);
	}
	
	private static int findGCD(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}
}
