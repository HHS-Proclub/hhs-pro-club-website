import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PRA3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			int length = in.nextInt();
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for (int j = 0; j < n; j++) {
				int elem = in.nextInt();
				arr[j] = elem;
			}
			outputs.add(wood(length, arr));
			//outputs.add(0);
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		
		in.close();
	}
	public static int wood(int len, int[] array) {
		if (array.length == 1) {
			return 0;
		}
		Map<Integer, Integer> inventory = new HashMap<>();
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (!inventory.containsKey(array[i])) {
				inventory.put(array[i], 1);
			} else {
				inventory.put(array[i], inventory.get(array[i]) + 1);
			}
		}
		if (sum != len) {
			return 0;
		}
		int energy = 0;
		int count = 0;
		int currLen = len;
		int prevLen = 0;
		Arrays.sort(array);
		
		for (int i = array.length-1; i >= 0; i--) {
			prevLen = currLen;
			currLen -= array[i];
			
			if (inventory.get(array[i]) >= 2) {
				count += 2;
			} else if (inventory.containsKey(array[i]) && inventory.containsKey(currLen) && currLen != array[i]) {
				count += 2;
			} else {
				count++;
			}
			energy += prevLen;

			if (count == array.length) {
				break;
			}
			
		}
		return energy;
	}
}
