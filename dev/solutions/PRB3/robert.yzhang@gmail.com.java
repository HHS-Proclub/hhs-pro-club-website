
import java.util.Scanner;


public class PRB3 {

	

	public static void main(String args[])
	{

		Scanner kboard = new Scanner(System.in);
		int lines = kboard.nextInt();
		int x = 1;
		int temp ,total = 0;	

		while(x <= lines)
		{
			temp = kboard.nextInt();
			total = total + temp;
			x++;		
		}
		

		int mean = total / lines;
		System.out.println(mean);





	}
	
}
