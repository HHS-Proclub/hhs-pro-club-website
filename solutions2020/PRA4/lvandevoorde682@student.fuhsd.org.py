import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numTickets = Integer.parseInt(scan.nextLine());
		
		String out = "";
		
		
		for (int tick = 0; tick < numTickets; tick++) {
			int digits = Integer.parseInt(scan.nextLine());
			String num = scan.nextLine();
			
			boolean passes = false;
			for (int i = 0; i < num.length() - 1; i++) {
				
				if (isGood(num.substring(i+1), sum(num.substring(0, i+1)))) {
					passes = true;
					break;
				}
			}
			
			if (passes) {
				out += "YES";
			} else {
				out += "NO";
			}
			
			if (tick != numTickets-1) {
				out += "\n";
			}
		}
		
		System.out.println(out);
		
		scan.close();
		
	}
	
	public static boolean isGood(String digits, int sum) {
		int runningTotal = 0;
		
		for (int i = 0; i < digits.length() - 1; i++) {
			runningTotal += charValue(digits.charAt(i));
			if (runningTotal == sum) {
				runningTotal = 0;
			} else if (runningTotal > sum) {
				return false;
			}
		}
		
		runningTotal += charValue(digits.charAt(digits.length() - 1));
		
		return runningTotal == sum;
	}
	
	public static int charValue(char c) {
		return Integer.parseInt("" + c);
	}
	
	
	public static int sum (String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += charValue(s.charAt(i));
		}
		
		return sum;
	}
}
