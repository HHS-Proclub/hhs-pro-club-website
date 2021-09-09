
/** Author: Sarah Sabaa
 * 	Date: 2020/2/26
 * 
 */

import java.util.Scanner;

public class PRI2 {

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		long problems = keyboard.nextLong();
		String newDigits = "";
		String original;
		long length;
		String num = "";
		String[] digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		String result = "";

		for (int i = 0; i < problems; i++) {

			length = keyboard.nextLong();

			newDigits = "" + keyboard.nextLong();
			original = newDigits;
			
			for (int x = 0; x < 9; x++) {
				while (newDigits.indexOf(digits[x]) != -1) {
					newDigits = newDigits.replace(digits[x], letters[x]);
				}
			}
			
			for (int n = 0; n < 9; n++) {
				num = "" + keyboard.nextInt();
				while (newDigits.indexOf(letters[n]) != -1) {
					newDigits = newDigits.replace(letters[n], num);
				}
			}
		
			int m = 0;
			result = "";
			
			for (; m < length && Integer.valueOf(original.charAt(m)) >= Integer.valueOf(newDigits.charAt(m)); m++) {
				result += original.charAt(m);
			}
			for (; m < length && Integer.valueOf(newDigits.charAt(m)) >= Integer.valueOf(original.charAt(m)); m++) {
				result += newDigits.charAt(m);
			}
			for (; m < length; m++) {
				result += original.charAt(m);
			}
			
			System.out.println(result);

			
		}
	}
}