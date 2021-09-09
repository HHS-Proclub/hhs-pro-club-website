import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int perimeter=a+b+c;
		if(a>=b+c)
		{
			a=b+c-1;
		}else if(b>=a+c)
		{
			b=a+c-1;
		}else if(c>=a+b)
		{
			c=a+b-1;
		}
		System.out.println(a+b+c);
	}
}
