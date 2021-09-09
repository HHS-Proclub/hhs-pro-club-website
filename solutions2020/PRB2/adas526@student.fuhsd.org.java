import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		List<List<String>> outputs = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(x); i++) {
			String s = in.nextLine();
			String n = in.nextLine();
			List<String> locs = new ArrayList<>();
			
			for (int j = 0; j < Integer.parseInt(n); j++) {
				String loc = in.nextLine();
				locs.add(loc);
			}
			outputs.add(crickets(s, locs));
		}
		for (List<String> list : outputs) {
			for (String s : list) {
				System.out.println(s);
			}
		}
	}
	public static List<String> crickets(String str, List<String> locs) {
		int n = Integer.parseInt(str.split(" ")[0]);
		int d = Integer.parseInt(str.split(" ")[1]);
		
		// line1
		int x1 = n-d;
		int y1 = d+x1;
		int x2 = y1;
		int y2 = x1;
		int m1 = (y2-y1) / (x2-x1);
		int b1 = y1 - (m1*x1);
		
		// line2
		int x3 = 0;
		int y3 = d;
		int x4 = d;
		int y4 = 0;
		int m2 = (y4-y3) / (x4-x3);
		int b2 = y3 - (m2*x3);
		
		// line3
		int x5 = x3;
		int y5 = y3;
		int x6 = x1;
		int y6 = y1;
		int m3 = (y6-y5) / (x6-x5);
		int b3 = y5 - (m3*x5);
		
		// line4
		int x7 = x4;
		int y7 = y4;
		int x8 = x2;
		int y8 = y2;
		int m4 = (y8-y7) / (x8-x7);
		int b4 = y7 - (m4*x7);
		
		List<String> output = new ArrayList<>();
		
		for (String s : locs) {
			int lx = Integer.parseInt(s.split(" ")[0]);
			int ly = Integer.parseInt(s.split(" ")[1]);
			
			if (ly <= m1*lx + b1 && ly >= m2*lx + b2) {
				if (ly <= m3*lx + b3 && ly >= m4*lx + b4) {
					output.add("YES");
				} else {
					output.add("NO");
				}
			} else {
				output.add("NO");
			}
		}
		return output;
	}
}
