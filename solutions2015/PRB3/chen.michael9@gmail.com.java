import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		long largest = -1;
		for (int i = 0; i < n; i++) {
			long next = Long.parseLong(kboard.nextLine());
			if (next > largest) {
				largest = next;
			}
		}
		if (largest == -1) {
			System.out.println(0);
		} else {
			System.out.println(largest);
		}
	}
}
