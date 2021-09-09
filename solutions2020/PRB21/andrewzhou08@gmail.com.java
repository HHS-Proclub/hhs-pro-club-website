import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB21 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = Integer.parseInt(kb.nextLine());
		int b = Integer.parseInt(kb.nextLine());
		int c = Integer.parseInt(kb.nextLine());
		int n = Integer.parseInt(kb.nextLine());
		
		int points = 0;
		for(int i = 0; i < n; i++) {
			int max;
			
			if(a >= b && a >= c) {
				points += a;
				if(a >= 1) {
					a--;
				}
			} else if(b >= c && b >= a) {
				points += b;
				if(b >= 1) {
					b--;
				}
			} else {
				points += c;
				if(c >= 1) {
					c--;
				}
			}
		}
		
		System.out.println(points);
	}
}
