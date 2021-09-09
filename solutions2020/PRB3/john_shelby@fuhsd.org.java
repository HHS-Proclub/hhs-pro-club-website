
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = Integer.parseInt(input.nextLine());
		for (int i = 0; i < total; i++) {
			int num = Integer.parseInt(input.nextLine());
			for (int j = 1; j <= num; j++)
				if (num % j == 0)
					System.out.println(j);
			
		}
		
		
	}
}
