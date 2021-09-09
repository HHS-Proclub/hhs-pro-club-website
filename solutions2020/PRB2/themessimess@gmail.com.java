
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Line2D.Double l = new Line2D.Double(3,4,6,2);
		//System.out.println(pointOnLine(l, 6,2));
		
		
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		ArrayList<String> as = new ArrayList<String>();
		for(int i = 0;i<numCases;i++) {
			int n = in.nextInt();
			int d = in.nextInt();
			int[] x = new int[] {0,d,n,n-d};
			int[] y = new int[] {d,0,n-d,n};
			Polygon field = new Polygon(x,y,4);
			int numC = in.nextInt();
			for(int xx = 0;xx<numC;xx++) {
				int cx = in.nextInt();
				int cy = in.nextInt();
				if(field.contains(cx,cy) || onBorder(x,y,cx,cy)) {
					as.add("YES");
				}else {
					as.add("NO");
				}
			}

		}
		for(String s : as) {
			System.out.println(s);
		}
	}
	
	public static boolean onBorder(int[]x, int[]y, int px, int py) {
		Line2D.Double l1 = new Line2D.Double(x[0], y[0], x[1], y[1]);
		Line2D.Double l2 = new Line2D.Double(x[1], y[1], x[2], y[2]);
		Line2D.Double l3 = new Line2D.Double(x[2], y[2], x[3], y[3]);
		Line2D.Double l4 = new Line2D.Double(x[3], y[3], x[0], y[0]);
		
		boolean a = l3.contains(px,py);
		
		if(pointOnLine(l1,px,py) || pointOnLine(l2,px,py) || pointOnLine(l3,px,py) || pointOnLine(l4,px,py)) {
			return true;
		}else {
			return false;
		}

		
	}
	
	public static boolean pointOnLine(Line2D.Double l, double x,double y) {
		double slope = (l.y1 - l.y2)/(l.x1-l.x2);
		double b = l.y1 - slope * l.x1;
		boolean isOnLine = y == (slope * x + b);
		if(isOnLine) {
			return (l.x1<=x && x<=l.x2) || (l.x2<=x && x<=l.x1);
		}else {
			return false;
		}
	}

}
