//package PR_10;

import java.math.BigInteger;
import java.util.Scanner;

public class PRB10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] frac = in.nextLine().split("/"); 
		in.close();
		BigInteger num = new BigInteger(""+Integer.parseInt(frac[0])), den = new BigInteger(""+Integer.parseInt(frac[1]));
		int gcd = num.gcd(den).intValue();
		System.out.println(num.intValue()/gcd+"/"+den.intValue()/gcd);
	}
}
