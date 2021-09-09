
import java.util.Scanner;

public class PRA5 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		int r = in.nextInt();
		
		int x1 = (int)(x-r);
		int x2 = (int)(x+r);
		
		int y1 = (int)(y+r);
		int y2 = (int)(y-r);
		
		//System.out.println("x1: "+x1+"   x2: "+x2+"   y1: "+y1+"    y2: "+y2);
		
		int numpoints = 0;
		
		int n = 2*r+1;
		
		for(int a = y1; a>=y2; a--)
		{
			for(int b = x1; b<=x2; b++)
			{
				double distance = Math.sqrt(Math.pow(a-y,2)+Math.pow(b-x, 2));
				
				if(distance<=r)
				{
					//System.out.println(b+","+a);
					numpoints++;
				}
			}
		}
		
		System.out.println(numpoints);
				
	}
}
