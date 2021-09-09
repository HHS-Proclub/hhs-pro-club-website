import java.util.Scanner;

public class PRA2 {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		double goodFootStep = in.nextDouble();
		double distance = in.nextDouble();
		double pace = 0;
		int step = 0;
		
		while (pace < distance) {
			if (step % 2 == 0) {
				pace += goodFootStep;
			} else {
				pace += goodFootStep / 2;
			}
			step++;
		}
		
		System.out.println(Math.round(step));
	}
}
