import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for(int i = 0; i < x; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.println(a+b);
		}
		
		input.close();
	}
}
