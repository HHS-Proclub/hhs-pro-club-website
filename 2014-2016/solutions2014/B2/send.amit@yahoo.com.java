import java.math.BigInteger;
import java.util.Scanner;


public class B2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger bInt = c(input.nextInt());
		
		for(BigInteger i = bInt.subtract(c(1));!i.equals(c(1));i=i.subtract(c(1))){
			bInt = bInt.multiply(i);
		}
		
		
		String s = bInt.toString();
		int ans = 0;
		for(int i = 0;i<s.length();i++)
			ans += Integer.parseInt(s.charAt(i)+"");
		
		System.out.println(ans);
		
	}

	public static BigInteger c(int i){
		return new BigInteger(i+"");
	}
		
}
