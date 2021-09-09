import java.util.Scanner;

public class PRB17 {
	public static int method(int numCrates, int loadSize) {
		int stuff = numCrates/2;
		double answer = (double)stuff/loadSize;
		answer+=0.99999;
		return 2*(int)answer;
	}
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numCrates = kboard.nextInt();
		int loadSize = kboard.nextInt();
		int[] arrayOfPiles = new int[1];
		System.out.println(method(numCrates, loadSize));
	}
}
