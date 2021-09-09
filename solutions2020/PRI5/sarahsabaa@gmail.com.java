/** Author: Sarah Sabaa
 * 	Date: 2020/3/6
 * 
 */

import java.util.Scanner;

public class PRI5 {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		long problems = keyboard.nextLong();

		for (int i = 0; i < problems; i++) {
			int length1 = keyboard.nextInt();
			int length2 = keyboard.nextInt();
			String first = keyboard.next();
			String second = keyboard.next();
			String result = "NO";
			int star = first.indexOf("*");
			boolean startSame = false;
			boolean endSame = false;
			if (star != -1) {
				String firstStart = first.substring(0, star);
				String secondStart = second.substring(0, star);
				String firstEnd = first.substring(star + 1);
				String secondEnd = second.substring(second.length() - firstEnd.length());
				startSame = firstStart.equals(secondStart);
				endSame = firstEnd.equals(secondEnd) && ((second.indexOf(secondEnd) >= star) || (second.indexOf(secondEnd) == 0));
			}
			
			if ((startSame && endSame) || first.equals(second)) {
				result = "YES";
			}
			
			System.out.println(result);
		}
		
	}
}
