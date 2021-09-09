/** Author: Sarah Sabaa
 * 	Date: 2020/3/5
 * 
 */

import java.util.Scanner;
			
public class PRB3 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		long problems = keyboard.nextLong();
		
		for (int i = 0; i < problems; i++) {
			int length = keyboard.nextInt();
			String letters = keyboard.next();
			String result = "0";
//			System.out.println(result);
		
			for (int j = 0; j < length; j++) {
//				System.out.println(" " + j + letters.charAt(j));
				
				if(letters.charAt(j) == 'n') {
					result += " 1";					
//					System.out.println(result);
				}
			}
			
			for (int k = 0; k < length; k++) {
//				System.out.println(" " + k + letters.charAt(k));
				if(letters.charAt(k) == 'z') {
					result += " 0";					
//					System.out.println(result);
				}
			}
			
			System.out.println(result);
		}

	}
}
