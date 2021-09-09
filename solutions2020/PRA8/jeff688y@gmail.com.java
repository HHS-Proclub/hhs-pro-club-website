package challenge;

import java.util.Scanner;

public class PRA8 {

	public static int difference(int i, int[] fibonacci) {

		for (int x = 0; x < 38; x++) {
			if (i == fibonacci[x]) {
				return 0;
			} else {
				if (i < fibonacci[x+1] && i > fibonacci[x]) {
					return Math.min(i - fibonacci[x], fibonacci[x+1]-i);
				}
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		int[] fibonacci = new int[100];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int j = 2; j < 50; j++) {
			fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
		}
		int[] array = new int[i];
		for (int k = 0; k < i; k++){
			array[k] = keyboard.nextInt();
		}
		for (int k = 0; k < i; k++){
			System.out.println(difference(array[k], fibonacci));
		}
	}

}
