import java.util.*;
import java.io.*;

public class PRB2 {
	public static boolean onSegment(Point p, Point q, Point r) {
		if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x)
				&& q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y))
			return true;
		return false;
	}

	public static int orientation(Point p, Point q, Point r) {
		int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);

		if (val == 0)
			return 0;
		return (val > 0) ? 1 : 2;
	}

	public static boolean doIntersect(Point p1, Point q1, Point p2, Point q2) {
		int o1 = orientation(p1, q1, p2);
		int o2 = orientation(p1, q1, q2);
		int o3 = orientation(p2, q2, p1);
		int o4 = orientation(p2, q2, q1);
		if (o1 != o2 && o3 != o4)
			return true;
		if (o1 == 0 && onSegment(p1, p2, q1))
			return true;
		if (o2 == 0 && onSegment(p1, q2, q1))
			return true;
		if (o3 == 0 && onSegment(p2, p1, q2))
			return true;
		if (o4 == 0 && onSegment(p2, q1, q2))
			return true;
		return false;
	}

	public static boolean isInside(Point polygon[], int n, Point p) {
		int INF = 10000;
		if (n < 3)
			return false;
		Point extreme = new Point(INF, p.y);
		int count = 0, i = 0;
		do {
			int next = (i + 1) % n;
			if (doIntersect(polygon[i], polygon[next], p, extreme)) {
				if (orientation(polygon[i], p, polygon[next]) == 0)
					return onSegment(polygon[i], p, polygon[next]);

				count++;
			}
			i = next;
		} while (i != 0);

		return (count & 1) == 1 ? true : false;
	}

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = in.nextInt();
		while(--t>0) {
			int n = in.nextInt(), d = in.nextInt(), m = in.nextInt();
			int[][] pts = new int[m][2];
			for(int i=0; i<m; i++) {
				for(int j=0; j<2; j++) {
					pts[i][j] = in.nextInt();
				}
			}
			Point region[] = {new Point(0, d), new Point(d, 0), new Point(n, n-d), new Point(n-d, n)};
			for(int i=0; i<m; i++) {
				Point crk = new Point(pts[i][0], pts[i][1]);
				out.println(isInside(region, 4 ,crk) ? "YES" : "NO");
			}

		}
	}
}

class Point {
	int x, y;

	Point() {}

	Point(int p, int q) {
		x = p;
		y = q;
	}
}