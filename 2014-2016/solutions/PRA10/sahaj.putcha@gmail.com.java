import java.math.BigInteger;
import java.util.Scanner;

public class PRA10 {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int total=io.nextInt();
		findTotalNums(total);
	}
	public static void findTotalNums(int num)
	{
		int counter=0;
		int works=0;
		for(int i =1;i<=num;i++)
		{
			for(int a =1;a<=num;a++)
			{
			
					counter++;
					if(isGCD(i,a))
					{
						works++;
				}
			}
		}
		System.out.println(works+"/"+counter);
	}
	public static boolean isGCD(int a,int b)
	{
		BigInteger a1= new BigInteger(a+"");
		BigInteger b1= new BigInteger(b+"");
		if(a1.gcd(b1).intValue()==b1.intValue())
		{
			return true;
		}

		return false;
	}

}
