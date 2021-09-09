import java.util.Scanner;

public class PRA1 {
	public static void main (String [] args){
		long input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		long output = 2;
		
		for(long n = 1; n < input; n++ ){
			
			
			for(long count = 2; count < n; count++ ){
				if(n%count == 0){
					break;

				}
				if(count == n-1) {
					output *= n;
				}
			}
		}
		if (input == 2)
			output = 2;
		
		System.out.print(Long.toOctalString(output));
	}
}
