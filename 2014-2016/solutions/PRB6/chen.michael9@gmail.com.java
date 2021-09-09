import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {
	private static int n;
	private static int[] numbers;
	private static int maxLength = -1;
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		n = kboard.nextInt();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = kboard.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> current = new ArrayList<Integer>();
			for (int j = 0; j < n - i + 1; j++) {
				current = new ArrayList<Integer>();
				for (int a = j; a < j + i; a++) {
					current.add(numbers[a]);
				}
				/*System.out.print(i + " " + j + "           ");
				for (int x = 0; x < current.size(); x++) {
					System.out.print(current.get(x) + " ");
				}*/
				//System.out.println();
				for (int b = n - 1; b >= i; b--) {
					boolean works = true;
					for (int a = 0; a < i; a++) {
						//System.out.print("     " + numbers[b-a] + " " + current.get(a));
						if (numbers[b - a] != current.get(a)) {
							works = false;
							break;
						}
					}
					if (works) {
						if (i > maxLength) {
							maxLength = i;
						}
						break;
					}
				}
				//System.out.println();
			}
		}
		System.out.println(maxLength);
	}
}
