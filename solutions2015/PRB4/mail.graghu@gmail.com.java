import java.util.Scanner;


public class PRB4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		for(int x = 0; x < 4; x++) {
			sum += s.nextInt();
		}
		
		if(sum == 0 || sum == 1) {
			System.out.println(1);
			System.exit(0);
		}
		long product = sum;
		
		for(int x = sum - 1; x > 0; x--) {
			product *= x;
		}
		
		System.out.println(product);
		s.close();
	}

}
