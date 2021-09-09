import java.util.*;

public class PRA17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int year = in.nextInt();

			int weekday = 0;
			do {
				year++;
				weekday += 365 % 7;
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) weekday++;
				weekday %= 7;
			} while (weekday != 0);

			System.out.println(year);
		}
		in.close();
	}
}