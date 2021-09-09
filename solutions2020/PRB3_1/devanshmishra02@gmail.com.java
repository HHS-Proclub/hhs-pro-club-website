import java.util.Arrays;
import java.util.Scanner;

public class PRB3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int p = 0; p < n; p++) {
			int t = scan.nextInt();
			int z = scan.nextInt();
			int energy = 0;
			int[] arr = new int[z];
			for (int d = 0; d < z; d++) {
				arr[d] = scan.nextInt();
			}

			int temp;
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j > 0; j--) {
					if (arr[j] < arr[j - 1]) {
						temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}

			int fin = calculate(arr, z-1, t, 0);
			System.out.println(fin);
		}
	}

	private static int calculate(int[] arr, int start, int t, int energy) {
		// TODO Auto-generated method stub
		
		if (start <= 0) {
			return energy;
		}
		int x = t - arr[start];
		
		if (x == 0) {
			energy += -t;
		}
		energy += t;
		

		return calculate(arr, start - 1, x, energy);
	}

}
