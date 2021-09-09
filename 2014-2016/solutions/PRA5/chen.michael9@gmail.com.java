import java.util.Scanner;
import java.util.StringTokenizer;

public class PRA5 {
	private static int rows, colums;
	private static int numOfTests;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		rows = Integer.parseInt(token.nextToken());
		colums = Integer.parseInt(token.nextToken());
		numOfTests = Integer.parseInt(kboard.nextLine());
		int[] answer = new int[numOfTests];
		for (int i = 0; i< numOfTests; i++) {
			token = new StringTokenizer(kboard.nextLine());
			int j1, j2, c1, c2, c3, c4;
			j1 = Integer.parseInt(token.nextToken());
			j2 = Integer.parseInt(token.nextToken());
			c1 = Integer.parseInt(token.nextToken());
			c2 = Integer.parseInt(token.nextToken());
			c3 = Integer.parseInt(token.nextToken());
			c4 = Integer.parseInt(token.nextToken());
			int[] shortJ = new int[4];
			shortJ[0] = j2 - 1;
			shortJ[1] = rows - j1;
			shortJ[2] = colums - j2;
			shortJ[3] = j1 - 1;
			
			int[] shortC = new int[4];
			if (c2 - 1 < c4 - 1) {
				shortC[0] = c2 - 1;
			} else {
				shortC[0] = c4 - 1;
			}
			
			if (rows - c1 < rows - c3) {
				shortC[1] = rows - c1;
			} else {
				shortC[1] = rows - c3;
			}
			
			if (colums - c2 < colums - c4) {
				shortC[2] = colums - c2;
			} else {
				shortC[2] = colums - c4;
			}
			
			if (c1 - 1 < c3 - 1) {
				shortC[3] = c1 - 1;
			} else {
				shortC[3] = c3 - 1;
			}
			boolean possible = false;
			for (int j = 0; j < 4; j++) {
				if (shortJ[j] <= shortC[j]) {
					possible = true;
				}
			}
			if (possible) {
				answer[i] = 1;
			} else {
				answer[i] = 0;
			}
		}
		for (int i = 0; i < numOfTests; i++) {
			System.out.println(answer[i]);
		}
	}
}
