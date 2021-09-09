import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int stepLength = scanner.nextInt();
		int distance = scanner.nextInt();
		int steps = 0;
		double fuckingCrippled = (stepLength/2)+0.5;
		boolean goodFootMoving = true;
		while(distance > 0)
		{
			if(goodFootMoving == true)
			{
				distance -= stepLength;
				steps++;
				goodFootMoving = false;
			}
			else
			{
				distance -= (int)fuckingCrippled;
				steps++;
				goodFootMoving = true;
			}
		}
		System.out.println(steps);
	}
}
