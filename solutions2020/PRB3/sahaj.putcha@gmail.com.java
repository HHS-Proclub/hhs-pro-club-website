import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		for(int i =0;i<first;i++)
		{
			int second=scan.nextInt();
			for(int x=1;x<=second;x++)
			{
				if(second%x==0)
				{
					System.out.println(x);
				}
			}
		}
		
	}
}
