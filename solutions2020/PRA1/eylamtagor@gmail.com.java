import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		for (int x = 0; x < n; x++) {
			int year = kb.nextInt(), answer = year + 1;

			while (!distinctChars(answer + "")) {
				answer++;
			}

			System.out.println(answer);
		}
	}

	public static boolean distinctChars(String in) {
//		boolean result = true;
//
//		for (int i = 0; i < in.length(); i++) {
//			if (i != 0 && in.charAt(i) == in.charAt(0))
//				result = false;
//			else if (i != 1 && in.charAt(i) == in.charAt(1))
//				result = false;
//			else if (i != 2 && in.charAt(i) == in.charAt(2))
//				result = false;
//			else if (i != 3 && in.charAt(i) == in.charAt(3))
//				result = false;
//			else
//				result = true;
//		}
//
//		return result;
		
		char a = in.charAt(0), b = in.charAt(1), c = in.charAt(2), d = in.charAt(3);
		
		if (a == b || a == c || a == d || b == c || b == d || c == d)
			return false;
		else
			return true;
	}
}
