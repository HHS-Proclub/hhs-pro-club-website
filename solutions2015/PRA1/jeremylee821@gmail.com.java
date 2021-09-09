import java.util.*;

class PRA1 {

	private static int primes = 2;
	
	public static void main (String args[]){
//		System.out.println("enter the upper bound");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		for (int x = 2; x <= limit; x++){
			int counted = 0;

			for (int y = x - 1; y > 1; y--){
				if (x % y == 0){
					counted += 1;
				}
				if (counted >= 1){

				} else if (y == 2){
					primes *= x;
				}
			}
		}
		int remainder = 0;
	    int oct = primes;
	    String result= Integer.toString(oct,8);
	    long l = Integer.parseInt(result);
	    System.out.println(l);
		String s = "";
	}
}