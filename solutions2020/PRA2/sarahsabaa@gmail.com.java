/** Author: Sarah Sabaa
 * 	Date: 2020/3/5
 * 
 */

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class PRA2 {

static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		long problems = keyboard.nextLong();
		
		for (int i = 0; i < problems; i++) {
			
			int n = keyboard.nextInt();			
			int d = keyboard.nextInt();
			int[] intArray = new int[n];
			int[] costs = new int [n];
			int even = 0;
			int odd = 0;
			int spent = 0;
			int cuts = 0;
			int placeInCosts = 0;
			
			for (int m = 0; m < n; m++) {
				intArray[m] = keyboard.nextInt();
			}
			
			for (int x = 0; x < n - 1; x++) {
				if (intArray[x] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
				if (even == odd) {
					costs[placeInCosts] = Math.abs(intArray[x] - intArray[x+1]);
					placeInCosts ++;
				}
			}
			
			Arrays.sort(costs, 0, placeInCosts);
			
			for (int y = 0; y < placeInCosts && placeInCosts != 0 && (spent + costs[y]) <= d; y++) {
				spent += costs[y];
				cuts ++;
			}
			
			System.out.println(cuts);
		}
		
	}
}
