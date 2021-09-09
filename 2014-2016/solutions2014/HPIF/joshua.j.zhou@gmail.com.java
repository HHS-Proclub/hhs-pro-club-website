import java.math.BigInteger;
import java.util.Scanner;

public class HPIF {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int B = in.nextInt();
		int R = in.nextInt();

		BigInteger bi = new BigInteger(B + "");
		BigInteger ri = new BigInteger(R + "");
		BigInteger m = new BigInteger("1000000007");

		for (int i = 0; i < 100000; i++) {
			BigInteger ii = new BigInteger(i + "");
			
			if (ii.modPow(bi, m).equals(ri)) {
				System.out.println(ii);
				break;
			}

		}
	}

}
