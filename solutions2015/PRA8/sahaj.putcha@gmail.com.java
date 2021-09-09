import java.math.BigInteger;
import java.util.Scanner;

public class PRA8 {

	public static void main(String[] args)
	{
		char[] numbers = new char[] {'0','1','2','3','4','5','6','7','8','9',
	            'A','B','C','D','E','F','G','H','I','J'};
		Scanner k = new Scanner (System.in);
		int num=k.nextInt();

		for(int i=1;i<=300;i++)
		{
			if(isPalindrome(changeBase(i*i,num,numbers)))
			{
				System.out.println(changeBase(i,num,numbers)+" "+changeBase(i*i,num,numbers));
			}  
		}
	}
	public static boolean isPalindrome(String num)
	{
		String n ="";
		for(int i =num.length()-1;i>=0;i--)
		{
			n+=num.charAt(i);
		}
		if(n.equals(num))
			return true;
		return false;
	}
	 private static String changeBase(int i, int base, char[] rep) {
	        StringBuffer sb = new StringBuffer();
	        int val = i;
	        while(val >= base) {
	            sb.insert(0, rep[val%base]);
	            val = val/base;
	        }
	        return sb.insert(0, rep[val]).toString();
	    }
}
