import java.util.Scanner;


public class PRA2 
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		double stepLength = (double)in.nextInt();
		double distance = (double)in.nextInt();
		
		int stepCount = 0;
		while (distance > 0)
		{
			if (stepCount % 2 == 0)
				distance -= stepLength;
			else
				distance -= stepLength/2;
			
			stepCount++;
		}
		
		if (distance == 0)
		{
			System.out.println(stepCount);
		}
		else
		{
			int estimate;
			if(stepCount % 2 == 0)
				estimate = (int) Math.round(distance/stepCount + 0.5);
			else
				estimate = (int) Math.round(distance/(stepCount/2) + 0.5);
			
			System.out.println(stepCount + estimate);
				
		}
	}
}
