/** Author: Sarah Sabaa
 * 	Date: 2020/2/25 - 2020/
 * 
 */

import java.util.Scanner;

public class PRB1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		long problems = keyboard.nextLong();
		long m;
		long n;
		
		for (int i = 0; i < problems; i++) {
			m = keyboard.nextLong();
			n = keyboard.nextLong();
			System.out.println(m * n);
		}
	}

}