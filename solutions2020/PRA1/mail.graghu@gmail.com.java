import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		for(int x = 0; x < 5; x++) {
			int one = scanner.nextInt();
			int five = scanner.nextInt();
			int total = scanner.nextInt();

			while(total >= 5) {
				if(five - 1 < 0) {
					break;
				}
				else {
					five--;
					total -=5;
				}
			}
			
			if(total - one <= 0) System.out.println("true");
			else System.out.println("false");
		}
	}

}
