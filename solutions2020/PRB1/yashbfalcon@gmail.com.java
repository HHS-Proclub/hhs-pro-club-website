import java.util.Scanner;

public class PRB1 {
	
	public static void main(String args[]) {
		Scanner kboard = new Scanner(System.in);
		
		//number of inputs
		int a = kboard.nextInt();
		int inputNum1=0;
		int inputNum2=0;
		for(int i=0; i<a; i++) {
			inputNum1=kboard.nextInt();
			inputNum2=kboard.nextInt();
			
			System.out.println(inputNum1+inputNum2);
		}
		
		
	}

}
