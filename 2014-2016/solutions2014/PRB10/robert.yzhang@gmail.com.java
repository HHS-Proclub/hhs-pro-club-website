import java.util.Scanner;
public class PRB10 {
	
	public static void main(String args[])
	{
		Scanner kboard = new Scanner(System.in);
		int input = kboard.nextInt();
		
		if(input % 3 == 0 && input % 5 == 0 )
		{
				System.out.println("fizzbuzz");
		}
		else if(input % 3 == 0)
		{
			System.out.println("fizz");
		}
		else if(input % 5 == 0)
		{
			System.out.println("buzz");
		}
		else
		{
			System.out.println(input);
		}
	}

}
