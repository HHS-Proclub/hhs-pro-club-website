import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		int n2 = Integer.parseInt(kboard.nextLine());
		if (n == n2 || n <= 0 && n2 <= 0) {
			System.out.println((double)0);
		} else {
			int sum = 0;
			int count = 0;
			for (int i = Math.max(0, n) + 1; i < n2 ; i++) {
				sum += i;
				count++;
			}
			System.out.println((double)sum / count);
		}
	}
}
