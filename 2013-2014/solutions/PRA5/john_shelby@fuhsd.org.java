import java.util.Scanner;


public class PRA5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		double m = kboard.nextDouble(), n = kboard.nextDouble(), r = kboard.nextDouble();
		double rSq = r * r + 10E-6;
		//System.out.println(rSq);
		//int dist = (int)Math.floor(m+r);
		int total = 0;
		for (int row = (int)Math.floor(n-r); row < n+r; row++) {
			for (int col = (int)Math.floor(m-r); col < m+r; col++) {
				double a = row - n, b = col - m;
				
				if (a * a + b * b <= rSq)
					total++;
				
				//System.out.println(a*a+b*b);
			}
		}
		System.out.println(total);
	}

}
