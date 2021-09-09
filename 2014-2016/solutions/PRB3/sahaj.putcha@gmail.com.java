import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		 int max= io.nextInt();
		 int largest =0;
		 for(int i =0;i<max;i++)
		 {
			 int x = io.nextInt();
			 if(x>largest)
			 {
				 largest=x;
			 }
		 }
		 System.out.println(largest);
	}
}
