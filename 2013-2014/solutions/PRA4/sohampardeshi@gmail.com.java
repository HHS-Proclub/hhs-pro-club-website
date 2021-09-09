import java.math.BigInteger;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[]Args){
		//Scanner finds input
		Scanner inputReader = new Scanner(System.in);
		String input = inputReader.nextLine();
		
		//Convert Binary input to BigInteger (Decimal)
		BigInteger d = toDecimal(input);	
		
		//Create a BigInteger with a constant of 17
		int mult = 17;
		BigInteger mult17 = new BigInteger(Integer.toString(mult));
		
		//Multiply Decimal Value by 17
		BigInteger dchange = d.multiply(mult17);
		
		//Convert 17*Decimal Number Back into Binary
		System.out.println(toBinary(dchange));


	}
	private static BigInteger toDecimal(String input) {
		BigInteger temp = new BigInteger(input, 2);
		return temp;

	}
	public static String toBinary(BigInteger x){
		String binary ="";
		binary = x.toString(2);
		return binary;
	}
}
