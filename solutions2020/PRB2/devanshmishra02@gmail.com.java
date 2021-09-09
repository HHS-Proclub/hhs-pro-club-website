import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int v = scan.nextInt();
		for(int t = 0; t < v; t++) {
			int n = scan.nextInt();
			int d = scan.nextInt();
			int m = scan.nextInt();
			for(int i = 0; i < m; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				if(y<= -1*x+2*n-d && y >= -1*x+d && x >= y-d && x<= y+d) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				
				
				
				
			}
		}
	}
}
