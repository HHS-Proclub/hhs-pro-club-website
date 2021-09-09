import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB7 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.nextLine());
			
			System.out.println(solve(Integer.parseInt(st.nextToken())
					,Integer.parseInt(st.nextToken())
					,Integer.parseInt(st.nextToken())));
		}
	}
	
	public static int solve(int a, int b, int c) {
		double x = b/(double)a;
		
		if(c/(double)b == x) {
			return (int)(x*c);
		} else {
			x = b-a;
			
			if (x == c-b) {
				return (int)(x+c);
			}
		}
		
		return -1;
	}
}