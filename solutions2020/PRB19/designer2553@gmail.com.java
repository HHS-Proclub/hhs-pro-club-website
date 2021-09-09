import java.util.Scanner;

public class PRB19 {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int runs = in.nextInt();
		
		for (int run = 0; run < runs; run++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
			
			if (c < 3) {
				System.out.println(-1);
				continue;
			}
			
			System.out.println(Math.abs(a-(c-2)) + Math.abs(b-(c-1)));
		}
	}
}
