import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.Scanner;


public class PRB2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int probs = Integer.parseInt(scan.nextLine());
		
		String out = "";
		
		for(int i = 0; i < probs; i++) {
			String[] data = scan.nextLine().split(" ");
			int n = Integer.parseInt(data[0]);
			int d = Integer.parseInt(data[1]);
			
			int crickets = Integer.parseInt(scan.nextLine());
			
			Polygon p = new Polygon(new int[] {0, d, n, n-d}, new int[] {d, 0, n-d, n}, 4);
			
			Line2D l1 = new Line2D.Double(0, d, d, 0);
			Line2D l2 = new Line2D.Double(d, 0, n, n-d);
			Line2D l3 = new Line2D.Double(n, n-d, n-d, n);
			Line2D l4 = new Line2D.Double(n-d, n, 0, d);
			
			for (int j = 0; j < crickets; j++) {
				String[] crickData = scan.nextLine().split(" ");
				int x = Integer.parseInt(crickData[0]);
				int y = Integer.parseInt(crickData[1]);
				
				if (p.contains(x, y)) {
					out += "YES\n";
				} else {
					if (l1.ptLineDist(x, y) == 0 || l2.ptLineDist(x, y) == 0 || l3.ptLineDist(x, y) == 0 || l4.ptLineDist(x, y) == 0) {
						out += "YES\n";
					} else {
						out += "NO\n";
					}
				}
			}
		}
		
		System.out.println(out);
	}
	
}
