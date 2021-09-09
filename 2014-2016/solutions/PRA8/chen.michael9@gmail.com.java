import java.util.Scanner;

public class PRA8 {
	private static int b;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		b = Integer.parseInt(kboard.nextLine());
		for (int i = 1; i <= 300; i++) {
			String converted = convert(i);
			if (isPalin(convert(i * i))) {
				System.out.println( converted + " " + convert(i * i));
			}
		}
	}
	
	public static String convert(int n) {
		String current = "";
		int currentBase = 1;
		while (currentBase <= n) {
			currentBase *= b;
		}
		currentBase /= b;
		//System.out.println(currentBase);
		while (n > 0) {
			current += n / currentBase;
			n = n % currentBase;
			currentBase /= b;
		}
		while (currentBase > 1) {
			current += "0";
			currentBase /= b;
		}
		return current;
	}
	
	public static boolean isPalin(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
