import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) sum += in.nextInt();
		long factorial = 1;
		for (int i = 2; i <= sum; i++) factorial *= i;
		System.out.println(factorial);
	}
}
