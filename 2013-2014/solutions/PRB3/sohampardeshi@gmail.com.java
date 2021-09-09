import java.util.Scanner;


public class PRB3 {
	public static void main(String[]Args){
		System.out.println(numAtTerm(getInput()));

	}
	public static int numAtTerm(int n){
		int a = 0;
		int b = 1;
		for(int i = 0; i < n-1 ; i++){
			b = b + a;
			a = b - a;
		}
		return b;
	}


	public static int getInput(){
		@SuppressWarnings("resource")
		Scanner inputReader = new Scanner(System.in);
		int input = inputReader.nextInt();
		return input;
	}
}



