import java.util.*;
import java.io.*;

/*
 * Solution: Iterate through the castle, looking for a pattern of 1 0 1 0 1.
 * When found, add 1 to the answer. If at any time half of the pattern is found
 * (one room), also add 1 to the answer. Make sure to keep the last 1 when resetting.
 */
public class PRB2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(in.readLine());
			boolean[] castle = new boolean[n];
			String line = in.readLine();
			for (int j = 0; j < n; j++) {
				castle[j] = (line.charAt(j*2) == '1');
			}
			
			System.out.println(evaluate(castle));
		}
	}
	
	static int evaluate(boolean[] castle) {
		int answer = 0;
		boolean[] target = new boolean[] {true, false, true, false, true};
		int pattIndex = 0;
		
		for (boolean l : castle) {
			if (target[pattIndex] == l) {
				pattIndex++;
				if (pattIndex == 5) {
					// Found pattern
					pattIndex = 1;
					answer++;
				}
			} else {
				// Pattern broken
				if (pattIndex >= 3) {
					// Add to answer
					answer++;
				}
				pattIndex = (l) ? 1 : 0;
			}
		}
		
		// Off by one
		if (pattIndex >= 3) {
			// Add to answer
			answer++;
		}
		
		return answer;
	}

}
