import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		double n2 = n/5.0;
		
		
		
		int out = (int) Math.sqrt(n2);
		
		
		System.out.println(out);
	}

	public static boolean isDivisible(int a, int b) {
		if(a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
}
