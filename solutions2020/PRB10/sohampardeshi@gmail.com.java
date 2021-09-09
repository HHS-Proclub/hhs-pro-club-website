import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] p = s.nextLine().split("/");
		int num = Integer.parseInt(p[0]);
		int den = Integer.parseInt(p[1]);
		int gcd = gcd(num, den);
		
		num /= gcd;
		den /= gcd;
		
		System.out.println(num + "/" + den);
		
	}
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b,a % b);
	}
}