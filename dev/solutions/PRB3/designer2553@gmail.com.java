import java.util.*;

public class PRB3 {

	private static int number;
	private static int sum;
	private static int mean;
	private static Scanner kboard;
	private static int n;
	public static void main (String[] args) {
		
		kboard = new Scanner (System.in);
		
		n = kboard.nextInt();
		for (int i = 0; i < n; i++) {
			number = kboard.nextInt();
			sum = sum + number;
		}
		
		mean = sum / n;
		System.out.println(mean);
	}
}