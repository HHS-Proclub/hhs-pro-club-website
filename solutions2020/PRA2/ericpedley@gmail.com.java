import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int probs = Integer.parseInt(in.nextLine());
		while (probs > 0) {
			probs--;
			String[] firstline = in.nextLine().split(" ");
			String[] numsstr = in.nextLine().split(" ");
			int D = Integer.parseInt(firstline[1]);
			int[] nums = new int[numsstr.length];
			for (int i = 0; i < numsstr.length; i++)
				nums[i] = Integer.parseInt(numsstr[i]);
			int evens = 0, odds = 0;
			ArrayList<Integer> potentialCuts = new ArrayList<Integer>();
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] % 2 == 0)
					evens++;
				else
					odds++;
				if (evens > 0 && evens == odds) {
					int cost = Math.abs(nums[i] - nums[i + 1]);
					if (cost <= D) {
						potentialCuts.add(cost);
						evens = odds = 0;
					}
				}
			}
			potentialCuts.sort(new Comparator<Integer>() {
				public int compare(Integer arg0, Integer arg1) {
					if (arg0 < arg1)
						return -1;
					else if (arg0 == arg1)
						return 0;
					else
						return 1;
				}
			});
			int cuts = 0;
			for (int i : potentialCuts) {
				if (D > 0 && i <= D) {
					cuts++;
					D -= i;
				}
			}
			System.out.println(cuts);
		}
	}
}
