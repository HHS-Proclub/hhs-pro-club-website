import java.util.Arrays;
import java.util.Scanner;


public class PRA8 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for(int i = 0; i < n; i++){
			int[] x = getFactors(Integer.parseInt(s.nextLine()));
			int ps = 0;
			for(int j = 0; j < x.length; j++)
				if(isPerfectSquare(x[j]))
					ps++;
			System.out.println(asFraction(ps, x.length - 1));
		}
	}
	public static boolean isPerfectSquare(int n)	{
		if( n % 2 == 1) return false;
		int p = (int)(Math.sqrt(n));
		if( p * p == n ) return true;
		return false;
	}
	public static int[] getFactors(int n){
		int[] factors = new int[n];
		int count = 0;
		double sqrt = Math.sqrt(n);
		for(int i = 1; i <= sqrt; i++)
			if(n % i == 0){
				factors[count++] = i; 
				factors[count++] = n/i; 
			}

		return Arrays.copyOf(factors, count);
	}
	public static long gcm(long a, long b) {
		return b == 0 ? a : gcm(b, a % b); 
	}
	public static String asFraction(long a, long b) {
		long gcm = gcm(a, b);
		a = (a / gcm) - 1;
		b = (b / gcm) - 1;
		if(a <= 0) return "0";
		return  a + "/" + b;
	}
}