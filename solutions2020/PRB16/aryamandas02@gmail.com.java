import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRB16 {
	public static void main(String[] args) {
		PRB16 p = new PRB16();
		Scanner in = new Scanner(System.in);
		String cases = in.nextLine();
		List<String> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(cases); i++) {
			String str = in.nextLine();
			outputs.add(p.peacefulLine(str));
		}
		for (String s : outputs) {
			System.out.println(s);;
		}
		in.close();
	}
	public String peacefulLine(String s) {
		String[] strArray = s.split(" ");
		List<Integer> nums = new ArrayList<>();
		
		for (String str : strArray) {
			nums.add(Integer.parseInt(str));
		}
		Map<Integer, Integer> counts = new HashMap<>();
		
		for (int i : nums) {
			if (!counts.containsKey(i)) {
				counts.put(i, 1);
			} else {
				int repeatCount = counts.get(i);
				repeatCount++;
				counts.put(i, repeatCount);
			}
		}
		if (counts.size() == nums.size()) {
			return "possible";
		}
		if (counts.size() == 1) {
			return "impossible";
		}
		List<Integer> countVals = new ArrayList<>();
		
		for (int j : counts.values()) {
			countVals.add(j);
		}
		Collections.sort(countVals);
		int sum = 0;
		
		for (int k = 0; k < countVals.size() - 1; k++) {
			sum += countVals.get(k);
		}
		if (sum < countVals.get(countVals.size() - 1)) {
			return "impossible";
		} else {
			return "possible";
		}
	}
}
