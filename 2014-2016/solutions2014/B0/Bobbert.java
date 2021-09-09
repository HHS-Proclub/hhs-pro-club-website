import java.util.Scanner;


public class B0{
		
	public static void main(String[] args)
	{
	

		Scanner kBoard = new Scanner(System.in);
		int numLines = kBoard.nextInt();
		String input;
		String total = null;
		int x = 0;
		
		while(x < numLines)
		{
			input = kBoard.next();
			total = total + input + "\n";
			x++;
		}
		total = total.replaceAll("null", "");
		System.out.println(total);
	}
	
}
	
	

	


