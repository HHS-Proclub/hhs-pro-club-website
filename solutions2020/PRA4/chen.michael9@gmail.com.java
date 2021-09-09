import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int[] sides = new int[3];
		sides[0] = Integer.parseInt(kboard.nextLine());
		sides[1] = Integer.parseInt(kboard.nextLine());
		sides[2] = Integer.parseInt(kboard.nextLine());
		Arrays.sort(sides);
		System.out.println(sides[0] + sides[1] + (sides[0] + sides[1] - 1));
	}
}
