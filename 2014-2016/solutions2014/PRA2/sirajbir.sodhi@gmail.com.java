import java.math.BigInteger;
import java.util.Scanner;


public class PRA2 
{
	
	public static void main(String[] args) 
	{
		System.out.print(fibonacci());
	}
	
	public static BigInteger fibonacci()
	{
		Scanner j = new Scanner(System.in);
		int num = j.nextInt();
		BigInteger k = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger ans = new BigInteger("0");
		for(int i=0;i<num;i++)
		{
			k = b;
			b = ans;
			ans = b.add(k);
			
		}
		return ans;
		
	}
}
