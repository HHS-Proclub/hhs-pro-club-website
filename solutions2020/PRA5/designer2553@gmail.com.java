import java.util.Scanner;

public class PRA5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
		int x = (int)Math.round((double)(b * n) / (a + b) - 0.1);
		int y = n - x;
		int max = 0;
		int by = b * y;
		
		if (y <= 1) {
			max = by;
		} else {
			int ax = a * x;
			
			if (ax < by) {
				max = ax;
			} else {
				max = by;
			}
		}
		
		System.out.println(max);
	}

}
