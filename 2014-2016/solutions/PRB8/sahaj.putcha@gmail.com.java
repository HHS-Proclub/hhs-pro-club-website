import java.util.Scanner;

public class PRB8 {
	
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int one=scan.nextInt();
		int two = scan.nextInt();
		long[] oneM= new long[50];
		long[] twoM= new long[50];
		for(int i=0;i<50;i++)
		{
			oneM[i]=one*(i+1);
			twoM[i]=two*(i+1);
		}
		boolean found=false;
		for(long e:oneM)
		{
			for(long a:twoM)
			{
				if(e==a)
				{
					found=true;
					System.out.println(e);
					break;
					
				}
			}
			if(found)
			{
				break;
			}
		}
	}

}
