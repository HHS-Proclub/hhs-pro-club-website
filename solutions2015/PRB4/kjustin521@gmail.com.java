import java.util.Scanner;
public class PRB4 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int a,b,c,d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		long sum = a + b + c + d;
		long answer = sum;
		for(int i = 1; i != sum; i++)
		{
			 answer = answer * (sum - i);
		}
		System.out.println(answer);
	}
}
