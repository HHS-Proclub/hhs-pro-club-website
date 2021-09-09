

import java.util.Arrays;
/*We'll say that a "mirror" section in an array is a group of continuous elements such that somewhere in the array, the same group appears in reverse order.
 *For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
 *Return the size of the largest mirror section found in the given array.
 *
 *Input Format
 *The length and element of the array are given, each separated by a carriage return.
 *
 *Output Format
 *The size of the largest mirror section found in the given array.
 */
import java.util.Scanner;

public class PRB6 {

	public static int largestMirror(int[] array) {
		int mirror = 0;

		int[] arrayB = new int[array.length];
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			arrayB[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		for (int length = 0; length <= array.length; length++) {
			for (int i = 0; i <= array.length - length; i++) {
				for (int j = 0; j <= array.length - length; j++) {

					if (Arrays.equals(Arrays.copyOfRange(array, i, length + i),
							Arrays.copyOfRange(arrayB, j, length + j))) {
						mirror = length;
					}
				}

			}
		}
		return mirror;
	}

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = kboard.nextInt();
		}
		System.out.println(largestMirror(array));
	}

}
