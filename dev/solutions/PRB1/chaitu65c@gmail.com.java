import java.util.Scanner;

public class PRB1  
	{
		public static void main(String[] args)
		{
			Scanner Kboard = new Scanner(System.in) ;
			//System.out.println("Enter a  valid number:");
			int n = Kboard.nextInt();
			System.out.println((int)(Math.sqrt(n)*2));
			//Kboard.close();
		}
}

