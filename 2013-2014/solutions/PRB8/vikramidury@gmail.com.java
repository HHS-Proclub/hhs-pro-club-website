
public class PRB8 {

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		int gcd = gcd(n, m);
		int lcm = m;
		while (lcm % n != 0 || lcm % m != 0){
			lcm += gcd;
		}
		System.out.println(lcm);
		
		
	}
	
	public static int gcd(int n, int m){
		while (n != m){
			if (n > m) n -= m;
			if (m > n) m -= n;
		}
		return n;
	}
	
}
