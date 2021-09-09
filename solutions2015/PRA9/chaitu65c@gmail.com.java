import java.util.Arrays;
import java.util.Scanner;

public class PRA9 {
	public static void main(String[] aga) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		String items1 = a.nextLine();
		System.out.printf("\n");
		int items = Integer.parseInt(items1);
		String c = a.nextLine();
		String[] s = c.split(" ");
		int[] costs = new int[items];
		int index = 0;
		String convert = "";
		for (int i = 0; i < items; i++) {
			costs[i] = Integer.parseInt(s[i]);
		}
		int sum = 0;
		Arrays.sort(costs);
		if (items % 2 == 0) {
			if (items == 2) {
				sum += costs[0] + costs[1];
			} else {
				for (int i = costs.length - 1; i >= items / 2; i--) {
					sum += costs[i];
				}
			}
		} else {
			for (int i = costs.length - 1; i >= items / 2 - 1; i--) {
				sum += costs[i];
			}
		}
		System.out.println(sum);

	}
}
