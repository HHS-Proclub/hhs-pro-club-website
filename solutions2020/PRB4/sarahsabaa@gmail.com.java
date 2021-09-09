
/** Author: Sarah Sabaa
 * 	Date: 2020/2/26
 * 
 */

import java.util.Scanner;

public class PRB4 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {

		long problems = keyboard.nextLong();
		
		for (int i = 0; i < problems; i++) {
			int numberOfCars = keyboard.nextInt();
			int[] cars = new int[numberOfCars];
			String result = "NO";
			
			for (int j = 0; j < numberOfCars; j++) {
				cars[j] = keyboard.nextInt();
			}
			
			for (int k = 0; k < numberOfCars; k++) {
				if (k + 1 == cars[cars[cars[k]-1]-1]) {
					result = "YES";
				}
			}
			
			System.out.println(result);
		}
	}
}
