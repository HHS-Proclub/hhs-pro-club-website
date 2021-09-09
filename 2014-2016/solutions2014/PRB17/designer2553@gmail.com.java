import java.util.Scanner;


public class PRB17 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		int num1 = kboard.nextInt();
		int denom1 = kboard.nextInt();
		int num2 = kboard.nextInt();
		int denom2 = kboard.nextInt();
		
		int num3 = num1*denom2 + num2*denom1;
		int denom3 = denom1*denom2;
		int q = gcf(Math.abs(num3), denom3);
		num3/=q;
		denom3/=q;
		
		System.out.println(num3 + " " + denom3);
	}
	
	public static int gcf(int n, int d)
	{
	    if (n <= 0 || d <= 0)
	    {
	      throw new IllegalArgumentException(
	                  "gcf precondition failed: " + n + ", " + d);
	    }

	    if (n % d == 0)
	      return d;
	    else if (d % n == 0)
	      return n;
	    else
	      return gcf(n % d, d % n); 
	}

}
