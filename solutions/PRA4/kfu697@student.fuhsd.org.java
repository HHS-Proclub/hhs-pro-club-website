import java.util.*;

public class ProblemC {
	public static void main(String[] args) {
		// Input parsing
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int maxWeight = input.nextInt();
		int[] gold = new int[N];
		int[] mass = new int[N];
		int[] sortedIndexes = new int[N];
		float[] rate = new float[N];
		HashMap<Float, Integer> rateToIndex = new HashMap<Float, Integer>();
		for (int i = 0; i < N; i++) {
			gold[i] = input.nextInt();
			mass[i] = input.nextInt();
			if (mass[i] != 0) rate[i] = (float) gold[i] / (float) mass[i];
			else rate[i] = 99999;
			rateToIndex.put(rate[i], i);
		}
		// Sorting indexes by rate (Greater rate = Higher priority)
		Arrays.sort(rate);
		int j = 0;
		for (int i = rate.length - 1; i >= 0; i--) {
			sortedIndexes[j] = rateToIndex.get(rate[i]);
			System.out.println(rate[i] + " " + sortedIndexes[j]);
			j++;
		}
		// Choosing pots of gold in order of highest priority
		// Extra weight may be left over, leading to possibly wrong results
		ArrayList<Integer> chosenIndexes = new ArrayList<Integer>();
		int currGold = 0;
		int currWeightLeft = maxWeight;
		for (int i : sortedIndexes) {
			System.out.println("Checking bag g " + gold[i] + " w " + mass[i]);
			if (mass[i] <= currWeightLeft) {
				currGold += gold[i];
				currWeightLeft -= mass[i];
				chosenIndexes.add(i);
				System.out.println("Added bag, now have w " + currWeightLeft + " g " + currGold);
			}
		}
		// Accounting for any extra weight left over by replacing some bags
		while (currWeightLeft != 0) {
			// Find the lowest acceptable rate to replace a bag with that results
			// in a gain of gold
			break;
		}
		// Print out the answer
		System.out.println(currGold);
		input.close();
	}
}
