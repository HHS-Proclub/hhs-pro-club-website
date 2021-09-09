import java.util.Scanner;

public class PRB8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] p1 = new int[6], p2 = new int[6], p3 = new int[6];

		int testCase = scanner.nextInt();
		int superCount = 0;

		while (superCount < testCase) {
			int p = scanner.nextInt();

			if (p > 0) {
				for (int i = 0; i < 6; i++) {
					p1[i] = scanner.nextInt();
				}
			}
			if (p > 1) {
				for (int i = 0; i < 6; i++) {
					p2[i] = scanner.nextInt();
				}
			}
			if (p > 2) {
				for (int i = 0; i < 6; i++) {
					p3[i] = scanner.nextInt();
				}
			}

			boolean[] combinations = new boolean[999];

			if (!isEmpty(p1)) {
				for (int a : p1) {
					combinations[a] = true;

					if (!isEmpty(p2)) {
						for (int b : p2) {
							combinations[10 * a + b] = true;
							combinations[10 * b + a] = true;
							combinations[b] = true;

							if (!isEmpty(p3)) {
								for (int c : p3) {
									combinations[100 * a + 10 * b + c] = true;
									combinations[100 * a + 10 * c + b] = true;
									combinations[100 * b + 10 * c + a] = true;
									combinations[100 * b + 10 * a + c] = true;
									combinations[100 * c + 10 * a + b] = true;
									combinations[100 * c + 10 * b + a] = true;

									combinations[10 * a + c] = true;

									combinations[10 * b + c] = true;
									combinations[10 * c + a] = true;
									combinations[10 * c + b] = true;


									combinations[c] = true;
								}
							}
						}
					}
				}
			}

			int count = 1; boolean valid = true;
			while (valid) {
				if (combinations[count]) {
					count++;
				} else {
					valid = false;
				}
			}

			System.out.println(count - 1);
			superCount++;
		}

	}

	public static boolean isEmpty(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}	
		return true;
	}

	public static boolean includes(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return true;
			}
		}
		return false;
	}
}





