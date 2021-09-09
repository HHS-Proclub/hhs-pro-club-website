import java.util.Scanner;

public class PRA2 {
	static double a, b, c, d;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i = 0; i < N; i++) {
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			d = in.nextDouble();
			
			double[] t = test();
			System.out.println((int)solve(t[0], t[1]));
		}
			
	}
	
	public static double solve(double a, double b) {
		int N = 1;
		
		while(N <= 100) {
			double c = (a + b)/2.0;
			
			if(f(c) == 0 || (b - a)/2 == 1e-6)
				return Math.abs(1000000*c);
			
			N++;
			if(Math.signum(f(c)) == Math.signum(f(a)))
				a = c;
			else
				b = c;	
			
		}
		
		return 0;
	}
	
	public static double f(double x) {
		return a*x*x*x + b*x*x + c*x + d;
	}
	
	public static double[] test() {
		double x1 = 0;
		double x2 = 0;
		
		for(int i = -20; i < 0; i++) {
			if(Math.signum(f(i)) == -Math.signum(a))
				x1 = i;
		}
		
		for(int i = 0; i < 20; i++) {
			if(Math.signum(f(i)) == Math.signum(a))
				x2 = i;
		}
		
		return new double[]{x1, x2};
	}

}
