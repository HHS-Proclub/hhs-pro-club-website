import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<String> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String s = in.nextLine();
			outputs.add(isPrime(Integer.parseInt(s)));
		}
		for (String o : outputs) {
			System.out.println(o);
		}
	}
	public static String isPrime(int n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
		}
		int reverse = Integer.parseInt(sb.reverse().toString());
		if (reverse == n) {
			return "NO";
		}
		boolean b1 = true;
		boolean b2 = true;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) {
				b1 = false;
				break;
			}
		}
		for (int i = 2; i <= Math.sqrt(reverse); i++) {
			if (reverse%i == 0) {
				b2 = false;
				break;
			}
		}
		if (b1 && b2) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
