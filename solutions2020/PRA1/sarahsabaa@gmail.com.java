/** Author: Sarah Sabaa
 * 	Date: 2020/2/25 - 2020/
 * 
 */

import java.util.Scanner;

public class PRA1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		long problems = keyboard.nextLong();
		long number;
		String num;
		String result = "YES";
		String firstDigit;

		for (int i = 0; i < problems; i++) {
			result = "YES";
			number = keyboard.nextLong();
			num = Long.toString(number);
			firstDigit = "" + num.charAt(0);
			
			if (num.indexOf("2") != -1) {
				result = "NO";
			} else if (num.indexOf("3") != -1) {
				result = "NO";
			} else if (num.indexOf("5") != -1) {
				result = "NO";
			} else if (num.indexOf("6") != -1) {
				result = "NO";
			} else if (num.indexOf("7") != -1) {
				result = "NO";
			} else if (num.indexOf("8") != -1) {
				result = "NO";
			} else if (num.indexOf("9") != -1) {
				result = "NO";
			} else if (num.indexOf("0") != -1) {
				result = "NO";
			} else if (num.indexOf("444") != -1) {
				result = "NO";
			} else if (firstDigit.equals("4")) {
				result = "NO";
			}
			System.out.println(result);
		}
	}

}