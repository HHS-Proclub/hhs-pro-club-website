import java.util.Scanner;

public class PRA13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long w = in.nextLong();
		long h = in.nextLong();
		long m = in.nextLong();
		
		long a = 0;
		long b = 0;
		
		while (true) {
			if (w * h <= m) {
				a = w*h;
				break;
			}
			w--;
		}
		
		while (true) {
			if (w * h <= m) {
				b = w*h;
				break;
			}
			h--;
		}
		System.out.println(Long.max(a, b));
	}

}
