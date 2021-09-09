import java.util.Scanner;

public class PRB4 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int num4 = s.nextInt();
		
		long factorial = 1;
		for(int sum = num1 + num2 + num3 + num4; sum > 0; sum--) {
			factorial *= sum;
		}
		System.out.println(factorial + "");
	}
}
