import java.util.Arrays;
import java.util.Scanner;

public class PRA2 {
	private static char[] c1, c2;
	private static int[][] numOfWays;
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String s = kboard.nextLine();
		String s2 = kboard.nextLine();
		
		//System.out.println(s + " " + s.length());
		//System.out.println(s2 + " " + s2.length());
		
		c1 = s.toCharArray();
		c2 = s2.toCharArray();

		numOfWays = new int[s.length() + 1][s2.length() + 1];
		for (int i = 0; i < numOfWays.length; i++) {
			Arrays.fill(numOfWays[i], -1);
		}
			
		System.out.println(dp(s.length(), s2.length()));

	}
	
	private static int dp(int i, int j) {
		if (i == 0 && j != 0) {
			return j;
		} else if (j == 0 && i != 0) {
			return i;
		} else if (j == 0 && i == 0) {
			return 0;
		}
		
		int left = 0, up = 0, diag = 0;
		if (numOfWays[i][j - 1] != -1) {
			left = numOfWays[i][j - 1];
		} else {
			left = dp(i, j - 1);
			numOfWays[i][j-1] = left;
		}
		
		if (numOfWays[i - 1][j] != -1) {
			up = numOfWays[i - 1][j];
		} else {
			up = dp(i - 1, j);
			numOfWays[i - 1][j] = up;
		}
		
		if (numOfWays[i - 1][j - 1] != -1) {
			diag = numOfWays[i - 1][j - 1];
		} else {
			diag = dp(i - 1, j - 1);
			numOfWays[i - 1][j - 1] = diag;
		}
		
		if (c1[i - 1] == c2[j - 1]) {
			return Math.min(Math.min(left + 1, up + 1), diag);
		} else {
			return Math.min(Math.min(left + 1, up + 1), diag + 1);
		}
	}
}
