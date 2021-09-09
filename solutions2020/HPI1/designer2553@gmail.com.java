import java.math.BigInteger;
import java.util.Scanner;

public class HPI1 {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		BigInteger a = in.nextBigInteger(), b = in.nextBigInteger();
		BigInteger divisor = new BigInteger("32452813");
		final BigInteger TWO = new BigInteger("2");
		BigInteger gcf = BigInteger.ONE;
		
		while (filler(a.max(b)).max(divisor).equals(filler(a.max(b)))) {
			if (a.mod(divisor).equals(BigInteger.ZERO) && b.mod(divisor).equals(BigInteger.ZERO)) {
				gcf = gcf.multiply(divisor);
				a = a.divide(divisor);
				b = b.divide(divisor);
			} else {
				if (divisor.equals(TWO))
					divisor = divisor.add(BigInteger.ONE);
				else
					divisor = divisor.add(TWO);
			}
		}
		
		System.out.println(gcf);
		System.out.println(gcf.multiply(a).multiply(b));
		in.close();
	}
	
	public static BigInteger filler (BigInteger num) {
		int length = num.toString().length()*3/4+1;
		String s = "";
		
		for (int i = 0; i < length; i++) {
			s += 9;
		}
		
		return new BigInteger(s);
	}
}
