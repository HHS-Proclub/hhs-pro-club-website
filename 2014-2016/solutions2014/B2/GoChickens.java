import java.math.BigInteger;
import java.util.Scanner;


public class B2 {

	public static void main(String[] args) {
		
		BigInteger bI = new BigInteger("1");
		Scanner kboard = new Scanner(System.in);
		int nN = kboard.nextInt();
		for(int i=2;i<=nN;i++){
			bI=bI.multiply(new BigInteger(""+i));
		}
		String val=bI.toString();
		int result=0;
		for(int i=0;i<val.length();i++){
			result+=Integer.parseInt(""+val.charAt(i));
		}
		System.out.println(result);
		

	}

}
