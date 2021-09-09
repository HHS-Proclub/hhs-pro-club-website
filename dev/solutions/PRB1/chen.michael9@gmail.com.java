import java.util.Scanner;
import java.lang.Math;

public class PRB1 {
	public static void main (String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		int n = kboard.nextInt();
		
		n = (int) (Math.sqrt(n) * 2);
		
		System.out.println(n);
	}
}
