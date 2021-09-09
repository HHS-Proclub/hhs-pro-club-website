import java.util.Scanner;
public class PRB1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = in.nextInt();
		int sum = num * 3;
		System.out.println(num + " * 3 = " + sum);
	}
}

