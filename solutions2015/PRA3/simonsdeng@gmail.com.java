import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int P = in.nextInt();
		int[] potions = new int[P];
		for (int i = 0; i < P; i++) potions[i] = in.nextInt();
		for (int i = 0; i < P; i++) {
			int left = 0;
			for (int j = 0; j < i; j++) left += potions[j];
			int right = 0;
			for (int j = i + 1; j < P; j++) right += potions[j];
			if (left == right) {
				System.out.println(i);
				return;
			}
		}
	}
}
