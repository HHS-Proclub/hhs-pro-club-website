import java.math.BigInteger;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger num1 = BigInteger.ONE;
		BigInteger num2 = BigInteger.ONE;
		if(n==0)
			System.out.println(0);
		else if(n<=2)
			System.out.println(1);
		else{
			for(int x=3;x<=n;x++){
				BigInteger temp = new BigInteger(num1.toString());
				num1 = num1.add(num2);
				num2 = temp;
			}
			System.out.println(num1);
		}
	}
}
