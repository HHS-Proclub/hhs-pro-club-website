import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HPI1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		long n2 = kb.nextLong();
		
		System.out.println(gcd(n, n2));
		System.out.println(lcm(n, n2));
		
	}
	
	private static long lcm(long a, long b)
	{
	    return a * (b / gcd(a, b));
	}
	
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
}
