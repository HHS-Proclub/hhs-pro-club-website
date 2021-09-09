import java.util.Scanner;

public class PRB3 {

	public static void Divisor(int i, int j) {
		int result = 0;
		for (int k = i; k <= j; k++) {
			result = j % k;
			if (result == 0) {
				System.out.println(k);
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		Divisor(x, y);

	}

}
