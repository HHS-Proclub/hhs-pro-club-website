import java.util.Scanner;

public class PRA2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeats = input.nextInt();
		for(int i = 0; i < repeats; i++) {
			int n = input.nextInt();
			if(!isPrime(n)) {
				System.out.println("NO");
			} else {
				int back = reverse(n);
				if(n == back) {
					System.out.println("NO");
				} else {
					if(isPrime(back)) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		}
		input.close();
	}

	private static boolean isPrime(int n) {
		for(int i = n-1; i > 1; i--) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	private static int reverse(int n) {
		String s = n+"";
		char[] chars = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			chars[s.length()-1-i] = s.charAt(i);
		}
		String newS = new String(chars);
		return Integer.parseInt(newS);
	}
}
