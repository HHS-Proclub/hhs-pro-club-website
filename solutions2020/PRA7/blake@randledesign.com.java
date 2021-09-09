import java.util.Scanner;

public class PRA7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeats = input.nextInt();
		for (int x = 0; x < repeats; x++) {
			int coins = 0;
			int c = input.nextInt();
			int n = input.nextInt();
			int[] people = new int[c];
			for (int i = 0; i < c; i++) {
				people[i] = input.nextInt();
			}
			int[] relationships = new int[2 * n];
			for (int i = 0; i < 2 * n; i += 2) {
				relationships[i] = input.nextInt() - 1;
				relationships[i + 1] = input.nextInt() - 1;
			}
			boolean[] bribed = new boolean[c];
			while (!allBribed(bribed)) {
				int low = findLowest(bribed, people);
				if(low == -1)
					break;
				coins += people[low];
				bribed[low] = true;
				bribeRelationships(low, relationships, bribed);
			}
			System.out.println(coins);
		}
		input.close();
	}
	
	private static void bribeRelationships(int spot, int[] relationships, boolean[] bribed) {
		for (int i = 0; i < relationships.length; i++) {
			if (relationships[i] == spot) {
				if (i % 2 == 0) {
					if(!bribed[i + 1]) {
						bribed[i + 1] = true;
						bribeRelationships(relationships[i + 1], relationships, bribed);
					}
				} else {
					if(!bribed[i - 1]) {
						bribed[i - 1] = true;
						bribeRelationships(relationships[i - 1], relationships, bribed);
					}
				}
			}
		}
	}

	private static int findLowest(boolean[] bribed, int[] people) {
		int lowest = -1;
		for (int i = 0; i < bribed.length; i++) {
			if (!bribed[i]) {
				lowest = i;
				break;
			}
		}
		if (lowest == -1)
			return -1;
		int lowestVal = people[lowest];
		for (int i = 0; i < people.length; i++) {
			if (!bribed[i] && people[i] < lowestVal) {
				lowest = i;
				lowestVal = people[i];
			}
		}
		return lowest;
	}

	private static boolean allBribed(boolean[] bribed) {
		for (int i = 0; i < bribed.length; i++) {
			if (!bribed[i])
				return false;
		}
		return true;
	}
}
