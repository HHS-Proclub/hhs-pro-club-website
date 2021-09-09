import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		int x = Integer.parseInt(kboard.nextLine());
		ArrayList<BigInteger> val = new ArrayList<BigInteger>();
		for (int i = 0; i < x; i++) {
			BigInteger y = new BigInteger(kboard.nextLine());
			val.add(y);
		}
		
		for (BigInteger y : val) {
			
			ArrayList<BigInteger> bests = new ArrayList<BigInteger>();
			bests.add(y);
			
			BigInteger answer = null;
			
			while(bests.size() > 0) {
				
				BigInteger thisone = bests.remove(0);
				
				if (thisone.equals(BigInteger.ZERO))
					continue;
				
				String stry = thisone+"";
				if (stry.charAt(0) == '0') {
					bests.add(new BigInteger(stry.substring(1)));
					continue;
				}
				
				if (thisone.mod(new BigInteger("3")).equals(BigInteger.ZERO)) {
					answer = thisone;
					break;
				}
				
				if (stry.length() <= 1)
					continue;
				
				for (int i = 0; i < stry.length(); i++) {
					String in3 = stry.substring(0, i) + stry.substring(i+1);
					bests.add(new BigInteger(in3));
				}
			}
			
			if (answer == null)
				System.out.println("-1");
			else
				System.out.println(y.toString().length()-answer.toString().length());
				// System.out.println(answer);  // TO PRINT ACTUAL ANSWER
			
			
		}
	}
	

}
