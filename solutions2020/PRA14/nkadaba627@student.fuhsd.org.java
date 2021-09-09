
import java.util.Scanner;

public class PRA14 {
	private static int iterations, k, n;
	private static int[] arr;

	public static void main(String[] args) {
		iterations = 0;
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cases; i++) {
			String[] temp = in.nextLine().split(" ");

			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);
			iterations = 0;
			arr = new int[n];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = 1;
			}
			a();
			System.out.println(iterations);

		}
	}

	public static void a() {
		for (int i = 0; i < Math.pow(k, n); i++) {
			if (valid(arr)) {
				iterations++;
			}
			/*
			 * for (int l = 0; l < arr.length; l++) { System.out.print(arr[l]);
			 * System.out.print(" , "); } System.out.print(valid(arr));
			 * System.out.println();
			 */
			arr[0]++;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > k) {
					arr[j + 1]++;
					arr[j] = 1;
				}
			}

		}
	}

	public static boolean valid(int[] set) {
		boolean diff, mod;
		for (int i = 1; i < set.length; i++) {
			diff = (set[i - 1] <= set[i]);
			mod = (set[i - 1] % set[i] != 0);
			if (diff || mod) {
			} else {
				return false;
			}
		}
		return true;
	}

}
