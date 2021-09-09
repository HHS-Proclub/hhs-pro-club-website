import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String n = in.nextLine();
			String str = in.nextLine();
			String[] strArray = str.split(" ");
			int[] arr = new int[Integer.parseInt(n)];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(strArray[j]);
			}
			outputs.add(power(arr));
		}
		for (int o : outputs) {
			System.out.println(o);
		}
	}
	public static int power(int[] array) {
		Arrays.sort(array);
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		int count = 0;
		
		for (int elem : array) {
			int exp = (int) (Math.log(elem) / Math.log(2));
			int j = exp;
			
			while (true) {
				if (Math.pow(2, j) > array[array.length-1] && !map.containsKey((int) ((Math.pow(2, j)) - elem))) {
					count++;
					break;
				}
				int val = (int) ((Math.pow(2, j)) - elem);
				
				if (map.containsKey(val) && val != elem) {
					break;
				} else if (map.containsKey(val) && map.get(val) > 1) {
					break;
				}
				j++;
			}
		}
		return count;
	}
}
