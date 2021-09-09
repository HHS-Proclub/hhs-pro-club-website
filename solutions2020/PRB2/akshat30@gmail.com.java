import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = scan.nextInt(); i > 0; i--) {
			int n = scan.nextInt();
			int d = scan.nextInt();
			int[] x = { 0, d, n, n - d };
			int[] y = { d, 0, n - d, n };
			Polygon rect = new Polygon(x, y, 4);
			for (int m = scan.nextInt(); m > 0; m--) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				if (rect.contains(a, b)) {
					System.out.println("YES");
				} else if (isPointOnLine(a, b, 0, d, d, 0) || isPointOnLine(a, b, d, 0, n, n-d)
						|| isPointOnLine(a, b, n, n-d, n-d, n) || isPointOnLine(a, b, n-d, n, 0, d)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}

	}

	public static boolean isPointOnLine(double x, double y, double x1, double y1, double x2, double y2) {

		double d1 = distance(x, x1, y, y1);
		double d2 = distance(x, x2, y, y2);
		double dTotal = distance(x1, x2, y1, y2);
		boolean isPointOnLine = equals(d1 + d2, dTotal);
		return isPointOnLine;
	}

	public static double distance(double x1, double x2, double y1, double y2) {
		double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return d;
	}

	public static boolean equals(double a, double b) {
		boolean e = Math.abs(a - b) < 0.01;
		return e;
	}
}
