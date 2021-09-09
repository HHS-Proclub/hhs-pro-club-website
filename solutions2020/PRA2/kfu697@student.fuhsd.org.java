import java.util.*;
import java.io.*;

/*
 * Solution: Find all the locations where a cut can be made. Then, greedily pick the
 * lowest cost cuts, and output the max number that you can make with D dollars.
 * 
 * This works because the cuts are independent; one cut will not affect the others.
 */

public class PRA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int[] seq = new int[n];
			st = new StringTokenizer(in.readLine());
			for (int j = 0; j < n; j++) {
				seq[j] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println(solve(seq, D));
		}
	}

	static int solve(int[] seq, int D) {
		// Find all valid cut costs
		int evenCount = 0;
		ArrayList<Integer> cutCosts = new ArrayList<Integer>();
		for (int i = 0; i < seq.length - 1; i++) {
			evenCount += (seq[i] % 2 == 0) ? 1 : -1;
			
			if (evenCount == 0) {
				// Cut can be made here
				cutCosts.add(Math.abs(seq[i] - seq[i+1]));
			}
		}
		
		// Sort cutCosts
		Collections.sort(cutCosts);
		
		// Find number of cuts that can be made
		int dollarsLeft = D;
		int numCuts;
		for (numCuts = 0; numCuts < cutCosts.size(); numCuts++) {
			if (dollarsLeft >= cutCosts.get(numCuts)) {
				dollarsLeft -= cutCosts.get(numCuts);
			} else break;
		}
		
		return numCuts;
	}
	
}
