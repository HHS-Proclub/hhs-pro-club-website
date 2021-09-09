import java.util.Scanner;


public class PRB5 {

	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++){
			int x = kboard.nextInt();
			if (x > max) max = x;
		}
		System.out.println(max);
	}
	
}
