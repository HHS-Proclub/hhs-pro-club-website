import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {	
		Scanner kboard = new Scanner(System.in);
		int step = kboard.nextInt();
		int hosp = kboard.nextInt();
		double answer = hosp * 3 * step;
		
		int x = (int) Math.round(answer + .5);
		System.out.println(answer);
	}
}
