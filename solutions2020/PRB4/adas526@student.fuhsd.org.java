import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		List<Integer> outputs = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for (int j = 0; j < n; j++) {
				int elem = in.nextInt();
				arr[j] = elem;
			}
			outputs.add(slime(arr));
			//outputs.add(0);
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		
		in.close();
	}
	public static int slime(int[] arr) {
		Arrays.sort(arr);
		int sum = 0;
		int max = arr[arr.length-1];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				break;
			}
			if (arr[i] > 0) {
				sum -= arr[i];
			} else {
				sum += arr[i];
			}
		}
		return arr[arr.length-1] - sum;
	}
}
