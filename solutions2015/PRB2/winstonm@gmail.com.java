import java.util.Scanner;

public class PRB2 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		if(num1 < 0) 
			num1 = 0;
		if(num2 < 0)
			num2 = 0;
		double result = (num1 + num2) / 2.0;
		System.out.println(result + "");
	}
}
