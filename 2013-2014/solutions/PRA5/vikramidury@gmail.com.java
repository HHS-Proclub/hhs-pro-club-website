import java.awt.geom.Point2D;
import java.util.Scanner;


public class PRA5 {

	public static void main(String[] args){
		
		Scanner kboard = new Scanner(System.in);
		double m = kboard.nextDouble();
		double n = kboard.nextDouble();
		double r = kboard.nextDouble();
		
		int count = 0;
		Point2D.Double center = new Point2D.Double(m, n);
		for (int i = (int)(m - r); i <= (int)(m + r) + 1; i++) {
			for (int j = (int)(n - r); j <= (int)(n + r) + 1; j++){
				if (Math.abs(center.distance(i, j)) <= r + .00000001){
					count++;
				}
			}
		}
			
		System.out.println(count);
		kboard.close();
		
	}
	
}
