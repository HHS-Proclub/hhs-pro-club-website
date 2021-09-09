import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		PRA1 p = new PRA1();
		Scanner in = new Scanner(System.in);
		String numbers = in.nextLine();
		String numbers2 = in.nextLine();
		String numbers3 = in.nextLine();
		String numbers4 = in.nextLine();
		String numbers5 = in.nextLine();

		System.out.println(p.rowOfBricks(numbers));
		System.out.println(p.rowOfBricks(numbers2));
		System.out.println(p.rowOfBricks(numbers3));
		System.out.println(p.rowOfBricks(numbers4));
		System.out.println(p.rowOfBricks(numbers5));

		in.close();
	}

	public boolean rowOfBricks(String numbers) {
		if (numbers == null || numbers.isEmpty()) {
			return false;
		}
		String[] numArray = numbers.split(" ");
		int numOfSmall = Integer.valueOf(numArray[0]);
		int numOfLarge = Integer.valueOf(numArray[1]);
		int length = Integer.valueOf(numArray[2]);

		for (int i = 0; i <= numOfSmall; i++) {
			int result = 0;
			for (int j = 0; j <= numOfLarge; j++) {
				result = i * 1 + j * 5;

				if (result != length) {
					result = 0;
				} else {
					return true;
				}
				if (i == numOfSmall && j == numOfLarge) {
					if (result != length) {
						return false;
					}
				}
			}
		}
		return true;
	}
}