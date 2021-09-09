

/* Ash and Brock are playing a game with their Pokemon.
 * Each time a player is allowed to pick 1, 2 or 4 Pokeballs from a bag filled with all their Pokeballs, and the player that gets the last Pokeball is the winner.
 * Assume that both players are extremely intelligent(of course this is overstating things a bit for Ash) and he will try his best to work out a winning strategy.
 * For example, if there are 2 Pokeballs and Ash is the first player to pick, he will certainly pick 2 Pokeballs and win. 
 * If there are 3 Pokeballs and Ash is still the first player to pick, no matter if he picks 1 or 2 Pokeballs, Brock will get the last Pokeball and win the game.
 * Given the number of Pokeballs and the order the players will choose in you are required to determine the victor, and calculate how many different strategies there are for him to win the. You can assume that there are no more than 30 Pokeballs.
 * 
 * Input:
 * You are given the order the players will move in and the number of Pokeballs in the bag.
 * Ash and Brock's names will be spelled the way they are in the sample input.
 * 
 * Output:
 * The name of the winner followed by a space and the number of ways they could win.
 */
import java.util.Scanner;

public class PRA6 {

	public static int numWaysToWin(int pokeballs) {
		int[] num = new int[pokeballs+1];
		num[0] = 0;
		for (int i = 1; i <= pokeballs; i++) {
			if (i == 1) {
				num[i] = 1;
			} else if (i == 2) {
				num[i] = 1;
			} else if (i == 3) {
				num[i] = 2;
			} else if (i == 4) {
				num[i] = 1;
			} else if (i == 5) {
				num[i] = 2;
			} else if (i == 6) {
				num[i] = 2;
			} else if (i == 7) {
				num[i] = 4;
			} else if (i > 6) {
				if (i % 3 == 1){
					num[i] = num[i-1] + num[i-4];
				} else if (i % 3 == 2) {
					num[i] = num[i-2];
				} else if (i % 3 == 0) {
					num[i] = num[i-1] + num[i-2] + num[i-4]; 
				}
			}
		}

		return num[pokeballs];
	}

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int pokeballs = kboard.nextInt();
		String player1 = kboard.next();
		String player2 = kboard.next();
		String winner;
		if (pokeballs % 3 == 0) {
			winner = player2;
		} else {
			winner = player1;
		}
		System.out.println(winner + " " + numWaysToWin(pokeballs));

	}
}
