import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args)
	{
		Scanner k= new Scanner(System.in);
		int a =k.nextInt();
		int b =k.nextInt();
		int c =k.nextInt();
		int d =k.nextInt();
		int total=a+b+c+d;
		System.out.println(factorial(total));
	}	
	public static long factorial(int a)
	{
		long total=1;
		for(int i=a;i>0;i--)
		{
			total*=i;
		}
		if(a==0)
			return 0;
		return total;
	}
}
