import java.util.Scanner;
public class VSB1 {

	
	public static void main(String[] args) 
	{
		Scanner kboard = new Scanner(System.in);
		//System.out.println("Enter a number");
		int n = kboard.nextInt();
		int sum = 0;
		//while(n>0)
		//{
		//	sum+=n;
		//	n--;
		//}
		sum=n*(n+1)/2;
		System.out.print(sum);
	}
	

}
