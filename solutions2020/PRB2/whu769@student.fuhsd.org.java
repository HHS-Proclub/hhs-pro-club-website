import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		String result = "";
		
		for(int i =0; i < num; i++) {
			int d = s.nextInt();
			int n = s.nextInt();
			int empty = d;
			if(d > n) {
				empty = n;
				n = d;
				d = empty;
			}
			
			Polygon x = new Polygon();
			x.addPoint(0, d);
			x.addPoint(d, 0);
			x.addPoint(n, n-d);
			x.addPoint(n-d, n);
			
			int numOfBugs = s.nextInt();
			for(int k = 0; k < numOfBugs; k++) {
				int bugx = s.nextInt();
				int bugy = s.nextInt();
				if(containz(x,bugx, bugy)) {
					result += "YES\n";
				}else {
					result+= "NO\n";
				}
			}
		}
		
	System.out.println(result);

	}
	
	public static boolean containz(Polygon p, int x, int y) {
		for(int i = 0; i < p.xpoints.length; i++) {
			if(x == p.xpoints[i] && y == p.ypoints[i]) {
				return true;
			}
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
		
		
		
		
		if(p.contains(x, y))
			return true;
		else
			return false;
		
		
	}
	
	
	public static boolean inLine(Point A, Point B, Point C) {
		
		Line2D.Float l = new Line2D.Float(A.x, A.y, B.x, B.y);
		return l.ptLineDist(C)==0;
	}

	

}
