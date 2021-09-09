import java.util.Scanner;

public class PRA8 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int runs = in.nextInt();
		long[] stepsList = new long[runs];
		for (int run = 0; run < runs; run++) {
			int val = in.nextInt();
			long closest = 0;
			
			for (int i = 0; /*Left intentionally empty*/; i++) {
				long current = fibonacci(i);
				if (Math.abs(current - val) <= Math.abs(closest - val)) {
					closest = current;
				} else {
					break;
				}
			}
			
			long steps = Math.abs(closest - val);
//			if (steps < 0) steps = 0;
//			System.out.println(steps);
			stepsList[run] = steps;
		}
		
		for (long steps : stepsList) {
			System.out.println(steps);
		}
	}
	
	public static long fibonacci (long base) {
		if (base < 2) {
			return base;
		} else {
			return fibonacci(base-1) + fibonacci(base-2);
		}
	}
}
