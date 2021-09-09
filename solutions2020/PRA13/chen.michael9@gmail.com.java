import java.util.Scanner;

public class PRA13 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		long w = Long.parseLong(kboard.nextLine());
		long h = Long.parseLong(kboard.nextLine());
		long m = Long.parseLong(kboard.nextLine());
		while (w * h > m) {
			if (w > h) {
				w--;
			} else {
				h--;
			}
		}
		System.out.println(w * h);
	}
}
