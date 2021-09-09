import java.util.Scanner;



public class PRA2 {

	public static final double LOWER_BOUND = -20;
	public static final double UPPER_BOUND = 20;
	
	public static double evalCubic(double a, double b, double c, double d, double x)
	{
		return ((a*x + b)*x + c)*x +d;
	}
	
	public static int getRoot(double a, double b, double c, double d)
	{
		double high = UPPER_BOUND;
		double low  = LOWER_BOUND;
		double answer  = 0;
		
		double evalHigh = evalCubic(a,b,c,d,high);
		double evalLow  = evalCubic(a,b,c,d,low);
		double val = evalCubic(a, b, c, d, answer);
		while(Math.abs((int)(high*1000000) - (int)(low*1000000)) > 0 && Math.abs(high - answer) > 0.00000005)
		{
			if(Math.signum(val) == Math.signum(evalLow))
			{
				low = answer;
				evalLow = val;
			}
			else
			{
				high = answer;
				evalHigh = val;
			}
			answer = (low+high)/2;
			val = evalCubic(a,b,c,d,answer);
		}
		if(Math.abs((int)(high*1000000) - (int)(low*1000000)) > 0)
			return Math.max((int)Math.abs(high*1000000), (int)Math.abs(low*1000000)) ;
		return (int)Math.abs(answer*1000000);
	}
	
	public static void main(String[] args) {
		int T;
		double a, b, c, d;
		Scanner s = new Scanner(System.in);
		
		T = s.nextInt();
		
		for(int i = 0; i< T; i++)
		{
			a = s.nextDouble();
			b = s.nextDouble();
			c = s.nextDouble();
			d = s.nextDouble();
			
			System.out.println(getRoot(a,b,c,d));
		}
		
		
		
	}

}
