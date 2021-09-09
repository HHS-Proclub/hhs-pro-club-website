import java.util.*;
import java.io.*;

/*
 * Solution: Iterate from the start of the number, stopping as soon as you can increase
 * any of the digits using the mapping (this will always be the best start loc). Then,
 * iterate from there, stopping as soon as you decrease any of the digits using the mapping
 * (the one before this will always be the best end loc). Print the resulting number.
 * 
 * Make sure to handle edge cases (when one of these locations is never set).
 */

public class PRI2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		char[] mapping = new char[10];
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(in.readLine());
			char[] num = in.readLine().toCharArray();
			String line = in.readLine();
			for (int j = 1; j < 10; j++) {
				mapping[j] = line.charAt((j-1)*2);
			}
			System.out.println(solve(num, mapping));
		}
	}
	
	static String solve(char[] num, char[] mapping) {
		// Find best start loc
		int startLoc = -1;
		for (int i = 0; i < num.length; i++) {
			if (mapping[getInt(num[i])] > num[i]) {
				// Start here
				startLoc = i;
				break;
			}
		}
		
		// If no best startLoc was set, the number cannot be mapped to a better one
		if (startLoc == -1) return new String(num);
		
		// Find best end loc
		int endLoc = -1;
		for (int i = startLoc + 1; i < num.length; i++) {
			if (mapping[getInt(num[i])] < num[i]) {
				// Stop right before this
				endLoc = i - 1;
				break;
			}
		}
		
		// If no best endLoc was set, just make it do the whole number
		if (endLoc == -1) endLoc = num.length - 1;
		
		// Change the characters that should be changed
		for (int i = startLoc; i <= endLoc; i++) {
			num[i] = mapping[getInt(num[i])];
		}
		
		return new String(num);
	}
	
	static int getInt(char c) {
		return (int) (c - '0');
	}

}
