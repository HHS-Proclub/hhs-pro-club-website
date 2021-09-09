import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int a =scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d =scan.nextInt();
		int e = scan.nextInt();
		int sum=a+b+c+d+e;
		if((sum-a)==a)
		{
			System.out.println(a);
		}
		else if((sum-b)==b)
		{
			System.out.println(b);
		}
		else if((sum-c)==c)
		{
			System.out.println(c);
		}
		else if((sum-d)==d)
		{
			System.out.println(d);
		}
		else if((sum-e)==e)
		{
			System.out.println(e);
		}
		else{
			System.out.println(sum);
		}
		
	}
}
