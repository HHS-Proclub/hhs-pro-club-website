import java.util.Scanner;

public class HPI4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int current = 1;
		int sum = 0;
		do {
			sum += current;
			current++;
		}while ((n - sum) % 2 != 0) ;
		System.out.println((n - sum) / 2);
	}
}
