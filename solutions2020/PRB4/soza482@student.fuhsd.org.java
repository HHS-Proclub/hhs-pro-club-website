import java.util.Scanner;

public class PRB4 {

	public PRB4() { };

	public static void Multiples(int i, int j) {
		int result = 0;
		for (int k = 0; k < j; k++) {
			result = result + i;
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//System.out.println("Enter the first integer:");
		int i = keyboard.nextInt();
		//System.out.println("Enter the number of multiples:");
		int j = keyboard.nextInt();	
		//System.out.println();
		Multiples(i,j);
	}

}
