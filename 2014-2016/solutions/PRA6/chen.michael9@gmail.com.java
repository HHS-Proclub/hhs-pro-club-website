import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA6 {
	private static int num;
	private static Boolean whoWon; //true if ash won, false if brock won
	private static Boolean whoStarts;
	public static void main(String[] args) {
		Scanner kboard =  new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		num = Integer.parseInt(token.nextToken());
		String s = token.nextToken(), s2 = token.nextToken();
		if (s.equals("ash")) {
			whoStarts = true;
			if (num % 3 == 0) {
				whoWon = false;
			} else {
				whoWon = true;
			}
		} else {
			whoStarts = false;
			if (num % 3 == 0) {
				whoWon = true;
			} else {
				whoWon = false;
			}
		}
		if (whoWon) {
			System.out.println("ash" + " " + recurse(num));
		} else {
			System.out.println("brock" + " " + recurse(num));
		}
	}
	public static int recurse(int num) { 
		if (num <= 0) {
			return 0;
		}
		
		if (num == 1) {
			return 1;
		}
		
		if (num == 2) {
			return 1;
		}
		
		if (num == 4) {
			return 3;
		}
		
		if (num % 3 == 0) {
			return recurse(num - 1) + recurse(num - 2) + recurse(num - 4);
		} else {
			int sum = 0;
			
			if ((num - 1) % 3 == 0) {
				sum += recurse(num - 1);
			}
			
			if ((num - 2) % 3 == 0) {
				sum += recurse(num - 2);
			}
			
			if ((num - 4) % 3 == 0) {
				sum += recurse(num - 4);
			}
			
			return sum;
		}
	}
}
