import java.util.Arrays;
import java.util.Scanner;

public class PRA7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palind = in.nextLine();
		int longestLength = lps(palind);
		System.out.println(longestLength);
	}
	
	// Returns the length of the longest palindromic subsequence in seq
    static int lps(String seq)
    {
	   int n = seq.length();
	   int i, j, cl;
	   int L[][] = new int[n][n];  // Create a table to store results of subproblems
	 
	   // Strings of length 1 are palindrome of lentgh 1
	   for (i = 0; i < n; i++)
	       L[i][i] = 1;
			 
	    // Build the table. Note that the lower diagonal values of table are
	    // useless and not filled in the process. The values are filled in a
	    // manner similar to Matrix Chain Multiplication DP solution (See
	    // http://www.geeksforgeeks.org/archives/15553). cl is length of
	    // substring
	    for (cl=2; cl<=n; cl++)
	    {
	        for (i=0; i<n-cl+1; i++)
	        {
	            j = i+cl-1;
	            if (seq.charAt(i) == seq.charAt(j) && cl == 2)
	               L[i][j] = 2;
	            else if (seq.charAt(i) == seq.charAt(j))
	               L[i][j] = L[i+1][j-1] + 2;
	            else
	               L[i][j] = Integer.max(L[i][j-1], L[i+1][j]);
	        }
	    }
			 
	    return L[0][n-1];
	}


//	public static int findLPS (char[] seq, int i, int j) {
//		if (i == j) {
//			return 1;
//		} else if (seq[i] == seq[j] && i + 1 == j) {
//			return 2;
//		} else if (seq[i] == seq[j]) {
//			return findLPS(seq, i+1, j-1) + 2;
//		} else {
//			return Integer.max(findLPS(seq, i, j-1), findLPS(seq, i+1, j));
//		}
//	}
	
}
