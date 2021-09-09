import java.math.BigInteger;
import java.util.Scanner;


public class PRA8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		
		for(int i = 1; i <= 300; i++){
			BigInteger n = new BigInteger("" + i);
			String changeN = n.toString(base);
			BigInteger nSquared = n.multiply(n);
			String changeNSquared = nSquared.toString(base);
			String reverse = reverse(changeNSquared);
			
			if(changeNSquared.equals(reverse)){
				System.out.println(changeN + " " + changeNSquared);				
			}	
			
			
		}
	}
	public static String reverse(String s){
		StringBuilder p = new StringBuilder(s);
		return p.reverse().toString();
	}

}
