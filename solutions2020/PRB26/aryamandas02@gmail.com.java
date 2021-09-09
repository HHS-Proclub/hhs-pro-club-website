import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PRB26 {
	public static void main(String[] args) {
		PRB26 p = new PRB26();
		Scanner in = new Scanner(System.in);
		String cases = in.nextLine();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(cases); i++) {
			String str = in.nextLine();
			outputs.add(p.catAndRabbit(str));
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		in.close();
	}

	public int catAndRabbit(String str) {
		String[] strArray = str.split(" ");
		List<Integer> nums = new ArrayList<>();
		for (String s : strArray) {
			nums.add(Integer.parseInt(s));
		}
		Collections.sort(nums);
		int product = Integer.MIN_VALUE;

		for (int i = nums.size() - 1; i >= 0; i--) {
			for (int j = 1; j <= nums.get(i) / 2; j++) {
				int x = j;
				int y = nums.get(i) - x;

				if (nums.contains(Math.abs(x - y)) && (x * y) > product) {
					product = x * y;
				}
			}
		}
		return product;
	}
}
