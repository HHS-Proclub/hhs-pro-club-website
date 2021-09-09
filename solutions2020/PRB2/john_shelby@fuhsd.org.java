
import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		for (int i = 0; i < 5; i++) {
			total += Double.parseDouble(input.nextLine());
		}
		
		System.out.println((int)total);
	}
}
