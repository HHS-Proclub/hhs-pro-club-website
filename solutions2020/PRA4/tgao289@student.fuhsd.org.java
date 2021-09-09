import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int[] answer = new int[3];
		answer = getResults(kboard);
		kboard.close();
		int result = 0;
		for (int i = 0; i < 3; i ++) {
			result = result + answer[i];
		}
		System.out.println(result);
		
	}
	private static int[] getResults(Scanner kboard) {
		int a = Integer.parseInt(kboard.nextLine());
		int b = Integer.parseInt(kboard.nextLine());
		int c = Integer.parseInt(kboard.nextLine());
		int[] array = new int[3];
		if (a + b <= c) {
			while (a + b <= c) {
				c = c - 1;
			}
		} else if (a + c <= b) {
			while (a + c <= b) {
				b = b - 1;
			}
		} else if (b + c <= a) {
			while (b + c <= a) {
				a = a - 1;
			}
		}
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}
