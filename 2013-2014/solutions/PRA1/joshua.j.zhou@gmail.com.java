/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * PRA1.java
 * Chall1
 * 
 * Author: Joshua Zhou
 * For: HHS Programming (hhsprogramming.com)
 * Created: 5 Sep 2013
 * Updated: 5 Sep 2013
 * 
 * Implement a Caesar cipher.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import static java.lang.System.*;
import java.util.Scanner;

public class PRA1 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int shift = Integer.parseInt(keyboard.nextLine());
		String toShift = keyboard.nextLine();
		String ciphertext = "";
		for (int i = 0; i < toShift.length(); i++) {
			ciphertext += Character.toString(
							shiftChar(toShift.charAt(i), shift));
		}
		out.println(ciphertext);
	}
	
	public static char shiftChar(char toShift, int shift) {
		if (toShift >= 'A' && toShift <= 'Z') {
			int ascii = (((int)toShift + shift) % (int)'A' % 26) + (int)'A';
			return (char)ascii;
		} else if (toShift >= 'a' && toShift <= 'z') {
			int ascii = (((int)toShift + shift) % (int)'a' % 26) + (int)'a';
			return (char)ascii;
		} else {
			return toShift;
		}
	}

}
