import java.util.Scanner;


public class PRB3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = Long.parseLong((new Scanner(System.in).nextLine()));
		long thisOne = 0, lastOne = 1;
		
		for (long i = 0; i < n; i++) {
			long temp = thisOne;
			thisOne = thisOne + lastOne;
			lastOne = temp;
		}
		System.out.println(thisOne);
	}

}
