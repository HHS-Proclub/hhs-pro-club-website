import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int x = scan.nextInt(); x > 0; x--) {
			int y = scan.nextInt();
			System.out.println(year(y));
		}
	}

	public static int year(int year) {
		year++;

		while (true) {
			String s = year + "";
			char a = s.charAt(0);
			char b = s.charAt(1);
			char c = s.charAt(2);
			char d = s.charAt(3);

			if (!(a == b || a == c || a == d || b == c || b == d || c == d))
				return year;

			year++;
		}
	}
}
