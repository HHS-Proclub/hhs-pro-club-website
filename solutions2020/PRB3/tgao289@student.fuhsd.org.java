import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
//		int numberCases = Integer.parseInt(kboard.nextLine()); 
		int numberCases = kboard.nextInt();
		int[] storage = new int[numberCases];
		for (int i = 0; i < numberCases; i++) {
//			int x = Integer.parseInt(kboard.nextLine());
			int x = kboard.nextInt();
			storage[i] = x;
		}
		kboard.close();
		for (int i = 0; i < numberCases; i++) {
			int test = 1;
			while (test <= storage[i]) {
				if (storage[i] % test == 0) {
					System.out.println(test);
				}
				test ++;
			}
		}
	}
}
