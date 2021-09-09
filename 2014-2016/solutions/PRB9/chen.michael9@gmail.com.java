import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB9 {
	private static boolean found = false;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int start = Integer.parseInt(kboard.nextLine());
		ArrayList<Integer> nums = new ArrayList<Integer>();
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		int current = 0;
		while (token.hasMoreTokens()) {
			nums.add(Integer.parseInt(token.nextToken()));
			if (nums.get(nums.size() - 1) == 6) {
				current += 6;
				nums.remove(nums.size() - 1);
			}
		}
		int[] using = new int[nums.size() - start];
		for (int i = start; i < nums.size(); i++) {
			using[i] = nums.get(i);
		}
		int target = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < using.length; i++) {
			if (using[i] == 6) {
				current += 6;
				using[i] = 0;
			}
		}
		choose(target, current, 0, using);
		System.out.println(found);
	}
	public static void choose(int target, int current, int index, int[] using) {
		if (index == using.length) {
			if (current == target) {
				found = true;
			}
			return;
		}
		choose(target, current, index + 1, using);
		choose(target, current + using[index], index + 1, using);
	}
}
