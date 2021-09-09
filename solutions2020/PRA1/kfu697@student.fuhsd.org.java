/**
 * PRA1: Special Numbers
 * Take the number in as a string. If the 1st character is not 1, return false.
 * Iterate through the rest of the characters. If at any time there is a number that is not
 * 1 or 4, or there are more than two 4s in a row, return false. Else, return true.
 * Runtime: O(9*1000000) -> 9,000,000 which is fine.
 */

import java.io.*;

public class PRA1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int np = Integer.parseInt(in.readLine());
		for (int i = 0; i < np; i++) {
			System.out.println(isMagic(in.readLine()) ? "YES" : "NO");
		}
		in.close();
	}
	
	static boolean isMagic(String num) {
		if (num.charAt(0) != '1') return false;
		int num4InRow = 0;
		char cc;
		for (int i = 1; i < num.length(); i++) {
			cc = num.charAt(i);
			if (cc == '4') {
				num4InRow++;
				if (num4InRow == 3) return false;
			} else if (cc == '1') {
				num4InRow = 0;
			} else {
				return false;
			}
		}
		return true;
	}

}
