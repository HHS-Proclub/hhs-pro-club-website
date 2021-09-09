import java.util.Scanner;
public class PRB1 {

	static Scanner kboard = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		
		int numProb = kboard.nextInt();
		
		int[] data = new int[numProb];
		
		for (int i = 0; i < numProb; i++) {
			int a = kboard.nextInt();
			int b = kboard.nextInt();
			
			data[i] = a + b;
		}
		
		for (int i = 0; i < numProb; i++) {
			System.out.println(data[i]);
		}
		
	}

}
