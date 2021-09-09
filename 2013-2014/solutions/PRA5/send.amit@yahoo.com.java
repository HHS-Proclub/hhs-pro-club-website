import java.awt.geom.*;
import java.util.*;



public class PRA5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" ");
		double centerX = input.nextDouble();
		double centerY = input.nextDouble();
		double rad = input.nextInt();
		
		//boundaries
		int startX = (int)(centerX - rad); // check here
		int endX = (int)(centerX + rad);
		
		int startY  = (int)(centerY + rad);    // check here
		int endY = (int)(centerY - rad);
		
		int count = 0;
		for(int i = startY;i>=endY;i--)
		{
			for(int ip = startX;ip<=endX;ip++)
			{
				double dist = Point2D.Double.distance(ip,i,centerX,centerY);
				if(dist<rad || Math.abs(dist-rad) <0.0000001) // || or if they are equal
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
		
		

	
	
	}

}
