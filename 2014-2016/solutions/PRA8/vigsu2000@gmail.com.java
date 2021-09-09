import java.util.Scanner;

public class PRA8 {
	
	private static boolean isPalindrome(String s) {
		StringBuffer str = new StringBuffer(s);
		String orig = str.toString();
		String rev = str.reverse().toString();
		if(orig.equals(rev)) {
			return true;
		}
		return false;
	}
	
	private static String changeBase(int decimalValue, int B) {
		int val = decimalValue;
		String remainder = "";
		int answer = 1;
		while(answer > 0) {
			answer = val/B;
			if(val % B < 10) {
				remainder += val % B;
			}
			else {
				remainder += (char)((val % B) + 55);
			}
			val = answer;
		}
		StringBuffer s = new StringBuffer(remainder);
		return s.reverse().toString();
	}
	
	public static void act(int B) {
		for(int i = 1; i <= 300; i++) {
			int squared = (int)Math.pow(i, 2);
			if(isPalindrome(changeBase(squared, B))) {
				System.out.println(changeBase(i, B) + " " + changeBase(squared, B));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int B = s.nextInt();
		act(B);
	}
	
}
