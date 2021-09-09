import java.util.Scanner;

public class PRB8 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(lcm(a, b));
		s.close();
	}
	
	public static int lcm (int a, int b) {
		int greaterHalved = a >= b ? a/2 : b/2;
		int lcm = 1;
		
		for (int i = 2; i < greaterHalved; i++) {
			while (a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				lcm *= i;
			}
		}
		
		lcm *= a * b;
		return lcm;
	}

}
