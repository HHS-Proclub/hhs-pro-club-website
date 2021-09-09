import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;

		while (count < testCase) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int result = a + b;

			System.out.println(result);
			count++;
		}

	}

}
