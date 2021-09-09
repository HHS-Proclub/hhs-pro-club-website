import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		String num;
		
		Scanner kboard = new Scanner(System.in);
		System.out.println("This program will take the square root of a number entered and multiply it by 2");
		System.out.println("Enter a number: ");
		num = kboard.next();
		int intNum = Integer.parseInt(num);
		int squaredNum = (int)Math.sqrt(intNum);
		squaredNum *= 2;
		System.out.println("The answer is: " + squaredNum);
		
		
		
		
		
	}

}
