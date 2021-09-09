import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PRA2 {

	public static void main(String[] args) throws IOException {
		final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		final int tires = Integer.parseInt(in.readLine());
		in.close();

		BigInteger lastJumps = BigInteger.ZERO;
		BigInteger jumps = BigInteger.ONE;
		for (int i = 1; i < tires; i++) {
			final BigInteger newJumps = lastJumps.add(jumps);
			lastJumps = jumps;
			jumps = newJumps;
		}

		System.out.println(jumps);
	}

}
