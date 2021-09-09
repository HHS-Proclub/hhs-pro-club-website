import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<String> out = new ArrayList<String>();
		for(int i = 0;i<n;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int np = Math.max(a, b);
			int dp = Math.min(a, b);
			Polygon p = new Polygon();
			p.addPoint(0, dp);
			p.addPoint(dp, 0);
			p.addPoint(np, np-dp);
			p.addPoint(np-dp, np);
			int temp = s.nextInt();
			for(int j = 0;j<temp;j++) {
				int x = s.nextInt();
				int y = s.nextInt();
				if(checkPoints(p,x,y)||p.contains(new Point(x, y))) {
					out.add("YES");
				} else {
					out.add("NO");
				}
			}
		}
		for(String q:out) {
			System.out.println(q);
		}
	}
	
	public static boolean checkPoints(Polygon p, int x, int y) {
		for(int i = 0;i<p.npoints;i++) {
			if(x==p.xpoints[i]&&y==p.ypoints[i])
				return true;
		}
		if(inLine(new Point(p.xpoints[0], p.ypoints[0]), new Point(p.xpoints[1], p.ypoints[1]), new Point(x, y))) {
			return true;
		}
		if(inLine(new Point(p.xpoints[0], p.ypoints[0]), new Point(p.xpoints[2], p.ypoints[2]), new Point(x, y))) {
			return true;
		}
		if(inLine(new Point(p.xpoints[0], p.ypoints[0]), new Point(p.xpoints[3], p.ypoints[3]), new Point(x, y))) {
			return true;
		}
		if(inLine(new Point(p.xpoints[1], p.ypoints[1]), new Point(p.xpoints[2], p.ypoints[2]), new Point(x, y))) {
			return true;
		}
		if(inLine(new Point(p.xpoints[1], p.ypoints[1]), new Point(p.xpoints[3], p.ypoints[3]), new Point(x, y))) {
			return true;
		}
		if(inLine(new Point(p.xpoints[2], p.ypoints[2]), new Point(p.xpoints[3], p.ypoints[3]), new Point(x, y))) {
			return true;
		}
		
		return false;
	}
	
	public static boolean inLine(Point A, Point B, Point C) {
		
			Line2D.Float l = new Line2D.Float(A.x, A.y, B.x, B.y);
			return l.ptLineDist(C)==0;
		}
}
