import java.util.Scanner;


public class B3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int bitRep = input.nextInt();
		
		bitRep = 1<<bitRep;
		int answer = num1^bitRep;
		System.out.println(answer);
		// 1 0 1 1 0

	}

}
