/** Author: Sarah Sabaa
 * 	Date: 2020/2/25 - 2020/
 * 
 */

import java.util.Scanner;

public class PRI1 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
			long problems = keyboard.nextLong();
			long total;
			long s;
			long h;
			long both;
			long result = 0;

			for (int i = 0; i < problems; i++) {
				total = keyboard.nextLong();
				s = keyboard.nextLong();
				h = keyboard.nextLong();
				both = s + h - total;
				if (both == 0) {
					result = total;
				} else if (both == total){
					result = 1;
				} else {
					if (s >= h) {
						result = s - both + 1;
					}
					if (h > s) {
						result = h - both + 1;
					}
				}
				
				System.out.println(result);
			}
			
	}

}
