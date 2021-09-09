import java.math.BigInteger;
import java.util.Scanner;

public class B2 {
	public static void main(String[] Args){
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		BigInteger fact = new BigInteger("1");

		for(int i = 1; i <= a; i++){
			fact = fact.multiply(new BigInteger(i + ""));
		}
		char[] p = fact.toString().toCharArray();
		int ans = 0;

		for(char all: p){
			ans += Integer.valueOf(all + "");
		}
		System.out.println(ans);
	}
}
