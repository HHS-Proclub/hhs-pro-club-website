/** Author: Sarah Sabaa
 * 	Date: 2020/3/5
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class PRI3 {
static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		long problems = keyboard.nextLong();
		
		for (int i = 0; i < problems; i++) {
			 int numberOfCans = keyboard.nextInt();
			 int[] canDurability = new int[numberOfCans];
			 int arrows = numberOfCans;
			 
			 for (int j = 0; j < numberOfCans; j++) {
				 canDurability[j] = keyboard.nextInt();
			 }
			 
			 Arrays.sort(canDurability);
			 
			 for(int k = 0; k < numberOfCans; k++) {
				 arrows += k * canDurability[numberOfCans - k - 1];
			 }
			 
			 System.out.println(arrows);
		}
	}
}
