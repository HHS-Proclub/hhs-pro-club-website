
import java.util.Scanner;

public class PRB1 {
	
	public static void main(String args[]) {
		Scanner reader = new Scanner (System.in);
		int numOfProblems = reader.nextInt();
		for (int i=0; i<numOfProblems; i++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = a + b;
			System.out.println(c);
		}
		reader.close();
		
	}
}