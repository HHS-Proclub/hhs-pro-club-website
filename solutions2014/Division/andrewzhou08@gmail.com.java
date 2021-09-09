import java.util.Scanner;


public class Division {

	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		double n1 = kboard.nextInt();
		double n2 = kboard.nextInt();
		double divide = n1/n2;
		System.out.println(divide);
	}
	
	public static double divide(int num1, int num2){
		return num1/num2;
	}
}
