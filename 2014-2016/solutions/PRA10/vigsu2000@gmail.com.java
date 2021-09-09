import java.math.BigInteger;
import java.util.Scanner;

public class PRA10 {

	public static String act(int n) {
		int denom = 0;
		int numer = 0;
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= n; b++) {
				denom++;
				if(gcd(a, b) == b) {
					numer++;
				}
			}
		}
		String output = "";
		output += numer+"";
		output += "/";
		output += denom+"";
		return output;
	}
	
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(act(n));
	}
}
