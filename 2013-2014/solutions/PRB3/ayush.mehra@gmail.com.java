import java.util.Scanner;


public class PRB3 
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 1;
		int c = 1;
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n<3)
			System.out.println("1");
		else
		{
			for(int i = 2;i<n;i++)
			{
				a = b;
				b = c;
				c = a+b;
				
			}
			System.out.println(c);
		}
	}
}
