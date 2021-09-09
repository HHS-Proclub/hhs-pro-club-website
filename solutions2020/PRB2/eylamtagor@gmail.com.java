import java.util.Scanner;
import java.awt.Polygon;

public class PRB2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			int n = scan.nextInt(), d = scan.nextInt();
			int[] xpoints = { 0, d, n, n - d }, ypoints = { d, 0, n - d, n };
			Polygon p = new Polygon(xpoints, ypoints, 4);

			int m = scan.nextInt();
			for (int j = 0; j < m; j++) {
				int x = scan.nextInt(), y = scan.nextInt();
				if (p.contains(x, y) || isPoint(xpoints, ypoints, x, y) || isBorder(xpoints, ypoints, x, y))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

	public static boolean isPoint(int[] xpoints, int[] ypoints, int x, int y) {
		for (int i = 0; i < xpoints.length; i++) {
			if (x == xpoints[i] && y == ypoints[i])
				return true;
		}

		return false;
	}

	public static boolean isBorder(int[] xpoints, int[] ypoints, int x, int y) {
		double slope1 = (ypoints[0] - ypoints[1]) / (xpoints[0] - xpoints[1]);
		double slope2 = (ypoints[1] - ypoints[2]) / (xpoints[1] - xpoints[2]);
		double slope3 = (ypoints[2] - ypoints[3]) / (xpoints[2] - xpoints[3]);
		double slope4 = (ypoints[3] - ypoints[0]) / (xpoints[3] - xpoints[0]);

		return 0 == slope1 * (xpoints[0] - x) - ypoints[0] + y || 0 == slope2 * (xpoints[1] - x) - ypoints[1] + y
				|| 0 == slope3 * (xpoints[2] - x) - ypoints[2] + y || 0 == slope4 * (xpoints[3] - x) - ypoints[3] + y;
	}
}
