import java.util.Scanner;


public class Division {

	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n1 = kboard.nextInt();
		int n2 = kboard.nextInt();
		System.out.println(divide(n1, n2));
	}
	
	public static double divide(int num1, double num2){
		return num1/num2;
	}
}
