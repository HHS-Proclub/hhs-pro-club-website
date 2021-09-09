import java.util.Scanner;

public class PRB8 {
	
	public static long lcm(long a, long b)
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
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String smaller = str.substring(0, str.indexOf(' '));
		String larger = str.substring(str.indexOf(' ') + 1);
		long small = Integer.parseInt(smaller);
		long large = Integer.parseInt(larger);
		System.out.println(lcm(small, large));
	}
}
