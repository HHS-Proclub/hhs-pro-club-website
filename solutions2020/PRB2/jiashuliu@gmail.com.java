import java.util.Scanner;

public class PRB2 {
	public static void main(String args[]){		
		Scanner kbd = new Scanner(System.in);
		
		int sum = 0;

		for(int i = 0; i < 5; i++){
			sum += kbd.nextInt();
		}
		
		System.out.println(sum);
	}
}
