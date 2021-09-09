import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numyear = s.nextInt();
		String output = "";
		
		for (int i=0;i<numyear;i++) {
			int n = s.nextInt();
			int d = s.nextInt();
			int numcrickets = s.nextInt();
			
			for (int j=0;j<numcrickets;j++) {
				int cx = s.nextInt();
				int cy = s.nextInt();
				
				double x = cx/Math.sqrt(2) - cy/Math.sqrt(2);
				double y = cx/Math.sqrt(2) + cy/Math.sqrt(2);
				
				if (x >= -d/Math.sqrt(2) - 0.1 && x<= d/Math.sqrt(2) + 0.1 && y >= d/Math.sqrt(2) - 0.1 && y <= d/Math.sqrt(2)+(n-d)*Math.sqrt(2) + 0.1) {
					output += "YES\n";
				} else {
					output += "NO\n";
				}
			}
		}
		
		System.out.println(output);
	}
}
