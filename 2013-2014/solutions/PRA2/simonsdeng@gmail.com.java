import java.util.Scanner;

public class PRA2 {
	private static double a;
	private static double b;
	private static double c;
	private static double d;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			d = in.nextDouble();
			
			System.out.println(Math.abs((int) (1000000 * newton(1))));
		}
		
		in.close();
	}
	
	private static double newton(double x) {
		final double x2 = x - (a * x * x * x + b * x * x + c * x + d) / (3 * a * x * x + 2 * b * x + c);
		
		if (Math.abs(x2 - x) < 0.000001) {
			return x2;
		} else {
			return newton(x2);
		}
	}

}
