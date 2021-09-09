/* Jerry and Tom's never ending struggle has reached its climax with the arrival of Tom's mom, a legendary mouse catcher known by all.
 * The three of them are locked in the location housing the final battle, an N by M size rectangular pit of doom.
 * Their chase is occurring in the rectangular pit of doom occurs in a somewhat civilized turn by turn manner.
 * Specifically, Jerry moves, then both cats move. In each move Jerry, Tom, and his mom can move only one square vertically or horizontally.
 * If Jerry is located at the edge of the pit then in his next move he can jump off the field and is saved from Tom and his mom.
 * If in the next move one of the cats moves to the pit location with Jerry then there is no escape for Jerry.
 * Given Jerry, Tom, and his mom's respective initial positions determine if there is a way for Jerry to escape the cats.
 * Jerry is the first to make his move.
 * 
 * Input:
 * In the first line of input two integers N and M are given, not exceeding 100, where N is the number of rows while M is the number of columns.
 * The second line contains a number k [k <= 10], which defines the number of test cases for the given rectangular pit of doom.
 * In the next k lines the initial positions of Jerry and the cats are given.
 * The position in the field is given by two numbers: the first is the number of the row, the second is the number of the column.
 * The first two integers are the coordinates of Jerry, the next four integers are the coordinates of the cats.
 * The rows and columns begin counting at 1.
 * 
 * Output:
 * You must output k lines with answers for each test case.
 * Print out 1 if Jerry can escape or 0 otherwise, skipping lines between each 0 or 1.
 */
import java.util.Scanner;

public class PRA5 {
	
	
	public static int canJerryEscape(int rows, int columns, int jerryR, int jerryC, int tomR, int tomC, int momR, int momC){
		
		int j1 = jerryR - 1;
		int j2 = rows - jerryR;
		
		int j3 = jerryC - 1;
		int j4 = columns - jerryC;
		
		int t1 = tomR - 1;
		int t2 = rows - tomR;
		
		int t3 = tomC - 1;
		int t4 = columns - tomC;
		
		int m1 = momR - 1;
		int m2 = rows - momR;
		
		int m3 = momC - 1;
		int m4 = columns - momC;
		
		if (j1 <= t1 && j1 <= m1){
			return 1;
		} else if (j2 <= t2 && j2 <= m2){
			return 1;
		} else if (j3 <= t3 && j3 <= m3){
			return 1;
		} else if (j4 <= t4 && j4 <= m4){
			return 1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int rows = kboard.nextInt();
		int columns = kboard.nextInt();
		int tests = kboard.nextInt();
		int[] jerryR = new int[tests];
		int[] jerryC = new int[tests];
		int[] tomR = new int[tests];
		int[] tomC = new int[tests];
		int[] momR = new int[tests];
		int[] momC = new int[tests];
		
		for (int i = 0; i < tests; i++){
			jerryR[i] = kboard.nextInt();
			jerryC[i] = kboard.nextInt();
			tomR[i] = kboard.nextInt();
			tomC[i] = kboard.nextInt();
			momR[i] = kboard.nextInt();
			momC[i] = kboard.nextInt();

		}
		
		for (int i = 0; i < tests; i++){
			System.out.println(canJerryEscape(rows, columns, jerryR[i], jerryC[i], tomR[i], tomC[i], momR[i], momC[i]));
		}
		
	}
}
