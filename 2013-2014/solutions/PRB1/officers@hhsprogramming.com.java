import java.util.Scanner;


public class PRB1 {
	public static void main(String[] args){
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		
		int total = 0;
		for (int i = 0; i < n; i++){
			total += kboard.nextInt();
		}
		int avg = total / n;
		System.out.println(avg);
		kboard.close();
	}
}
