import java.util.Scanner;

public class PRA10 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int n = Integer.parseInt(k.nextLine());
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			String input = k.nextLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			
			m[i] = 0;
			
			for (int j = a; j < b + 1; j++) {
				
				if (prime(j) && palindrome(j)) {
					m[i]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(m[i]);
		}

		k.close();
	}

	public static boolean prime(int x) {
		for (int i = 2; i < (int) (Math.sqrt(x) + 1); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		if (x > 1) {
			return true;
		}
		
		return false;
	}

	public static boolean palindrome(int x) {
		String n = x + "";
		int half = (int) (n.length() / 2.0);
		String half1 = n.substring(0, half);
		String half2 = new StringBuilder(n.substring(n.length() - half, n.length())).reverse().toString();

		if (half1.equals(half2)) {
			return true;
		}
		return false;
	}
}
