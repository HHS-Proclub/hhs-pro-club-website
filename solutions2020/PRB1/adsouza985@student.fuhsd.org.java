
import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		int numRow;
		int inp1[];
		int inp2[];
		
		Scanner kboard = new Scanner(System.in);
		numRow = kboard.nextInt();

		inp1= new int[numRow];
		inp2 = new int[numRow];
		 
		for(int i = 0; i < numRow; i++) {
			inp1[i] = kboard.nextInt();
			inp2[i] = kboard.nextInt();
		}
		
		for(int k = 0; k < numRow; k++) {
			System.out.println(inp1[k] + inp2[k]);
		
		}

		kboard.close();
	}

}
