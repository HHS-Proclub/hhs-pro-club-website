import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB25 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = Integer.parseInt(kb.nextLine());
		int b = Integer.parseInt(kb.nextLine());
		int c = Integer.parseInt(kb.nextLine());
		int d = Integer.parseInt(kb.nextLine());
		
		int min = Math.min(a, Math.min(b, Math.min(c, d)));
		int max = Math.max(a, Math.max(b, Math.max(c, d)));
		
		int optimal = 9999999;
		for(int i = min; i <= max; i++) {
			int total = 0;
			total += Math.abs(a - i);
			total += Math.abs(b - i);
			total += Math.abs(c - i);
			total += Math.abs(d - i);
			
			if(total < optimal) {
				optimal = total;
			}
		}
		
		System.out.println(optimal);
	}
}
