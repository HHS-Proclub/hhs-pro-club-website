import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int firstStep = kboard.nextInt();
		int distance = kboard.nextInt();
		kboard.close();
		int answer = 0;
		boolean test = false;
		int step = 0;
		while (answer < distance) {
			if (test == false) {
				answer = answer + firstStep;
				step ++;
				test = true;
			}
			else {
				answer = answer + firstStep / 2;
				step++;
				test = false;
			}
		}
		System.out.println(step);
	}
}
