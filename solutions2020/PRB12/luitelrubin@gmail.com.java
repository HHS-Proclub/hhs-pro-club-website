import java.util.Scanner;

public class PRB12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String temp = input.substring(0, input.length() / 2);
		System.out.println("Half of input is " + temp);
	}
}
