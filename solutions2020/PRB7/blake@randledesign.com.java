import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int repeats = input.nextInt();
		for (int x = 0; x < repeats; x++) {
			long number = input.nextInt();
			if (number == 0)
				System.out.println(0);
			else {
				/*
				long divisor = 1;
				long k = 1;
				long thing = (long)((Math.pow(2, k)-1) * Math.pow(2, k - 1));
				while (number % thing == 0) {
					divisor = thing;
					k++;
					thing = (long)((Math.pow(2, k)-1) * Math.pow(2, k - 1));
				}
				*/
				long divisor = 1;
				for(int k = 1; (Math.pow(2, k)-1) * Math.pow(2, k - 1) <= number; k++) {
					if(number % (Math.pow(2, k)-1) * Math.pow(2, k - 1) == 0)
						divisor = (long)((Math.pow(2, k)-1) * Math.pow(2, k - 1));
				}
				System.out.println(divisor);
			}
		}

		input.close();
	}

}
