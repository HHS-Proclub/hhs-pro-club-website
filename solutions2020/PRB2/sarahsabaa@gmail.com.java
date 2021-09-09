/** Author: Sarah Sabaa
 * 	Date: 2020/2/26
 * 
 */

import java.util.Scanner;

public class PRB2 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		long castles = keyboard.nextLong();
		String lights = "";
		long k = 0;
		long rooms;
		
		for (int i = 0; i < castles; i++) {
			
			lights = "";
			k = 0;
			
			rooms = keyboard.nextLong();
			
			for (int n = 0; n < rooms; n++) {
				lights += keyboard.nextLong();			
			}
			
			while (lights.indexOf("101") != -1) {
				lights = lights.substring(0, lights.indexOf("101") + 2) + "0" + lights.substring(lights.indexOf("101") + 3);
				k++;
			}
			
			System.out.println(k);
		}

	}

}
