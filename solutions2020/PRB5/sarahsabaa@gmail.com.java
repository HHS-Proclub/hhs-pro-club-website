
/** Author: Sarah Sabaa
 * 	Date: 2020/3/6
 * 
 */

import java.util.Scanner;

public class PRB5 {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		long problems = keyboard.nextLong();

		for (int i = 0; i < problems; i++) {
			String word = keyboard.next();
			int want = keyboard.nextInt();
			int found = 0;
			if (want > word.length()) {
				System.out.println("impossible");
			} else {
				for (int j = 0; j < word.length(); j++) {
					if (word.indexOf(word.charAt(j), j + 1) == -1) {
						found++;
					}
				}
				int need = want - found;
				if (need >= 0) {
					System.out.println(need);
				} else {
					System.out.println("0");
				}
			}
		}
	}
}
