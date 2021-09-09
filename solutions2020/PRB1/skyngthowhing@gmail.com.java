import java.util.Scanner;

public class Beginner1 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int numCases = 0;
		numCases = sc.nextInt();
		
		for (int numCase = 0; numCase < numCases; numCase++ ) {
			 int x, y;
			 x = sc.nextInt();
			 y = sc.nextInt();
			 System.out.println(x*y);
		}
	}
	
}
