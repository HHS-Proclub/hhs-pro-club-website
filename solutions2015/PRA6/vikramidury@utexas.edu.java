import java.util.HashMap;
import java.util.Scanner;

public class PRA6 {
	
	//0 - Ash
	//1 - Brock
	public static int winCount[] = new int[2];
	public static String winner = null;
	
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		String name = kboard.next();
		String name2 = kboard.next();
		findWinners(n, name, name2);
		
		if (winCount[0] > winCount[1]){
			System.out.println("ash " + winCount[0]);
		} else {
			System.out.println("brock " + winCount[1]);
		}

	}
	
	private static void findWinners(int n, String player1, String player2){
		if (n < 0){
			return;
		} else if (n == 4 || n == 1 || n == 2){
			if (player1.equals("ash")){
				winCount[0]++;
			} else {
				winCount[1]++;
			}
		} else {
			findWinners(n-1, player2, player1);
			findWinners(n-2, player2, player1);
			findWinners(n-4, player2, player1);
		}
	}
}
