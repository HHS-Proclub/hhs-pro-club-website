import java.util.Scanner;

public class PRA6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pokeballs = in.nextInt();
		String p1 = in.next();
		String p2 = in.next();
		int ways = waysToWin(pokeballs);
		System.out.println(ways > 0 ? p1 + " " + ways : p2 + " " + (-ways));
	}

	private static int waysToWin(int pokeballs) {
		if (pokeballs == 0) {
			return -1;
		} else {
			int wins = 0;
			int losses = 0;
			int ways = 0;
			if (pokeballs >= 4) {
				ways = -waysToWin(pokeballs - 4);
				if (ways > 0) wins += ways;
				else losses += -ways;
			}
			if (pokeballs >= 2) {
				ways = -waysToWin(pokeballs - 2);
				if (ways > 0) wins += ways;
				else losses += -ways;
			}
			ways = -waysToWin(pokeballs - 1);
			if (ways > 0) wins += ways;
			else losses += -ways;
			return wins != 0 ? wins : -losses;
		}
	}
}
