import java.util.Scanner;

public class PRB4 {
	
	public static void main(String args[]){
		int sum = 0;
		long result = 1;
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 4; i++){
			sum += s.nextInt();
		}

		for(int i = sum; i > 0; i--){
			result *= i;
		}
		
		System.out.println(result);
	}
}
