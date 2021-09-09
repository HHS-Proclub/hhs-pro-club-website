import java.util.Scanner;

public class PRB4 {
	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		System.out.println(factorial(s.nextInt() + s.nextInt() + s.nextInt() + s.nextInt()));
	}
	public static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}
}