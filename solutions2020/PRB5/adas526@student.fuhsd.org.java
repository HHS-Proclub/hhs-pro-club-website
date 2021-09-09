import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		List<Integer> output = new ArrayList<>();
		
		for (int i = 0; i < x; i++) {
			int n = in.nextInt();
			int b = in.nextInt();
			int r = in.nextInt();
			int[] arr = new int[n];
			
			for (int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			output.add(dresses(b, r, arr));
		}
		for (int i : output) {
			System.out.println(i);
		}
		in.close();
	}
	public static int dresses(int b, int r, int[] arr) {
		int cost = 0;
		int i = 0;
		int j = arr.length-1;
		
		while (true) {
			if (arr[i] == 2 && arr[j] == 2 && i != j) {
				cost += 2*Math.min(b, r);
				i++;
				j--;
			} else if ((arr[i] == 2 && arr[j] == 0) || (arr[i] == 0 && arr[j] == 2)) {
				cost += b;
				i++;
				j--;
			} else if ((arr[i] == 2 && arr[j] == 1) || (arr[i] == 1 && arr[j] == 2)) {
				cost += r;
				i++;
				j--;
			} else if (arr[i] != 2 && arr[j] != 2) {
				if ((arr[i] == 1 && arr[j] == 0) || (arr[i] == 0 && arr[j] == 1)) {
					return -1;
				} else {
					i++;
					j--;
				}
			} else if (i == j) {
				if (arr[i] == 2) {
					cost += Math.min(b, r);
				}
				i++;
				j--;
			}
			if (i > j) {
				break;
			}
		}
		return cost;
	}
}
