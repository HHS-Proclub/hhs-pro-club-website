import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		long amount = keyboard.nextInt();

		long nextInt = 0;
		for (int i = 0; i < amount; i++){
			long num = keyboard.nextInt();
			nextInt = Math.max(nextInt, num);
		}
		
		System.out.println(nextInt);
	}

}
