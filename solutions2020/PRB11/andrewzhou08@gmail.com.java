import java.util.Scanner;

public class PRB11 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int l = kb.nextInt();
		int theta = kb.nextInt();
		
		double rad = theta/180.0 * Math.PI;
		
		
		double l1 = l*Math.sin(rad);
		double l2 = l*Math.cos(rad);
		
		
		int out = (int)(Math.abs(l1*l2/2.0));
		
		
		System.out.println(out);
	}
}
