import java.util.Scanner;

public class PRB10 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		
		if (n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("fizzbuzz");
		}
		else if (n % 3 == 0)
		{
			System.out.println("fizz");
		}
		else if (n % 5 == 0)
		{
			System.out.println("buzz");
		}
		else
		{
			System.out.println(n);
		}
		
		kboard.close();
	}
}
//lol this is code from a year ago when my tutor gave me this problem
//Tiffany Wu