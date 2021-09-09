import java.math.BigInteger;
import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final String N = in.nextLine();
		System.out.println(new BigInteger(N + "0000", 2).add(new BigInteger(N, 2)).toString(2));
		
		in.close();
	}

}
