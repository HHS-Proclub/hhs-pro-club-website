import java.util.Scanner;
public class PRB1 {
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i<n; i++){
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int sum = num1 + num2;
			System.out.println(sum);
	  }
	}
}
