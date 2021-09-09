import java.util.Scanner;


public class PRB10 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		
		int input = Integer.parseInt(x);
		
		if(input%5 == 0 && input%3 == 0)
			System.out.println("fizzbuzz");
		else if(input%5 == 0)
			System.out.println("buzz");
		else
			System.out.println("fizz");
			
	}
}
