import java.util.Scanner;

public class PRB4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 4; i++){
			int num = keyboard.nextInt();
			sum += num;
		}
		
		long product = 1;
		for (int i = 1; i <= sum; i++){
			product *= i;
		}
		
		System.out.println(product);
	}

}
