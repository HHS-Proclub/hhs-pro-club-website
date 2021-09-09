import java.util.Arrays;
import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		kboard.nextLine();
		String line = kboard.nextLine();
		String[] costs = line.split(" ");
		int[] costs2 = new int[costs.length];
		for (int i = 0; i < costs.length; i++)
			costs2[i] = Integer.parseInt(costs[i]);
		Arrays.sort(costs2);
		int total = 0;
		for (int i = costs2.length-1; i >= 0; i -= 4) {
			total += costs2[i];
			if (i > 0)
				total += costs2[i-1];
		}
		System.out.println(total);
	}

}
