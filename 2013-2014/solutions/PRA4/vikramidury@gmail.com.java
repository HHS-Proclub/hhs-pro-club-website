import java.math.BigInteger;
import java.util.Scanner;


public class PRA4 {

	public static void main(String[] args){
		
		Scanner kboard = new Scanner(System.in);
		String input = kboard.next();
		BigInteger number = new BigInteger(input, 2);
		number = number.multiply(new BigInteger("17"));
		System.out.println(number.toString(2));
		
	}
	
}
