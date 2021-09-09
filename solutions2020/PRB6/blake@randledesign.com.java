import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long repeats = input.nextLong();
		for(long x = 0; x < repeats; x++) {
			long k = input.nextLong();
			long n = input.nextLong();
			ArrayList<Long> people = new ArrayList<Long>();
			for(long i = 0; i < n; i++) {
				people.add(input.nextLong());
			}
			long count = 0;
			long lastWinner = 0;
			while(count < k) {
				long winner = fight(people);
				if(lastWinner == winner)
					count++;
				else
					count = 1;
				lastWinner = winner;
			}
			System.out.println(lastWinner);
		}
		input.close();
	}

	private static long fight(ArrayList<Long> people) { // returns power of winner
		if(people.get(0) > people.get(1)) {
			people.add(people.remove(1));
		} else {
			people.add(people.remove(0));
		}
		return people.get(0);
	}
}
