import java.util.Scanner;
import java.lang.Math;

public class PRB11 
{
	
	public static double radianConverter(double angle)
	{
		double radians = angle * (Math.PI/180);
		return radians;
	}
	
	public static void main(String[]args) 
	{
		Scanner kboard = new Scanner(System.in);
		double distOrigin= kboard.nextDouble();
		double angle= kboard.nextDouble();
		
		double leg1; 
		leg1 = Math.abs(Math.cos(radianConverter(angle))*distOrigin);
		
		double leg2;
		leg2 = Math.sin(radianConverter(angle))*distOrigin;
		
		int area = (int)((leg1*leg2)/2);
		
		System.out.println(area);
	}
}
