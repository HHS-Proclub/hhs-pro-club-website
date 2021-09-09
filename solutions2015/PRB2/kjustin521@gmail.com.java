import java.util.Scanner;
public class PRB2 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int one, two;
		double average;
		one = sc.nextInt();
		two = sc.nextInt();
		if(one >=0 && two >= 0)
		{
			average = (double)(one+two)/2;
		}
		else
		{
			if(one >= 0)
			{
				average = (double)one/2;
			}
			else if(two >= 0)
			{
				average = (double)two/2;
			}
			else
			{
				average = 0;
			}
		}
		System.out.println(average);
	}
}
