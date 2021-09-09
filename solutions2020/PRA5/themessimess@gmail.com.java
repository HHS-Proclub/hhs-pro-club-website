
import java.util.Scanner;

public class PRA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		long numCases = in.nextLong();
		for(long ii = 0;ii<numCases;ii++) {
			long counter = 0;
			long num1 = in.nextLong();
			long num2 = in.nextLong();
			for(long i = num1; i<=num2;i++) {
				if(canBeExpressedAsPower(i)) {
					counter++;					
				}
			}
			System.out.println(counter);
		}
		
		

		
		
	}
	
	

	
	public static boolean canBeExpressedAsPower(long num) {
		if(num == 1) {
			return true;
		}
		for(long i = 2;i<=Math.sqrt(num);i++) {
			double pow = i;
			while(pow<=num ) {
				pow *= i;
				if(Math.abs(pow-num)<0.00001) {
					return true;
				}
				
			}
		}
		return false;
	}
}
