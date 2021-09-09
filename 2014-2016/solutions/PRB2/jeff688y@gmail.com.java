import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int lower = keyboard.nextInt();

		int upper = keyboard.nextInt();
		double sum = 0.0;
		double numbers = 0.0;
		for (int i=lower; i < upper; i++){
			
			if (i > 0){
				sum += i;
				numbers ++;
			}

		}
		
		System.out.println(sum/numbers);
	}

}
