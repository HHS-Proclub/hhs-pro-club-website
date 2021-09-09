//package PR_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PRA11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			String[] list = in.nextLine().split(" ");

			int[] input = new int[list.length];
			for (int i = 0; i < list.length; i++) {
				input[i] = Integer.parseInt(list[i]);
			}
			System.out.println(highfreq(input));
			// int occurrences = Collections.frequency(input, "bat");
			// int greatest = Collections.}
		}
		in.close();

	}

	public static int highfreq(int[] arr) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (count.containsKey(arr[i])) {
				count.put(arr[i], count.get(arr[i]) + 1);
			} else {
				count.put(arr[i], 1);
			}
		}
		int[] high = maxval(count);
		int maxVal = Collections.max(count.values());
		/*int[] back = new int[arr.length];
		for (int i = (back.length - 1); i > 0; i--) {
			back[(back.length - 1) - i] = arr[i];
		}*/
		//problem is below
		int[] goal =new int[high.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < high.length; j++) {
				if (arr[i] == high[j]) {
					goal[j]++;
					if (goal[j] == count.get(arr[i])){
					return arr[i];}
				}
			}
		}
		return -1;
	}

	public static int[] maxval(Map<Integer, Integer> map) {
		int maxValueInMap = (Collections.max(map.values()));
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				array.add(entry.getKey());
			}
		}
		return convertIntegers(array);
	}

	public static int[] convertIntegers(ArrayList<Integer> integers) {
		int[] out = new int[integers.size()];
		for (int i = 0; i < out.length; i++) {
			out[i] = integers.get(i).intValue();
		}
		return out;
	}
}
