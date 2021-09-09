import java.util.Scanner;


public class PRB7 {

	public static void main(String[] args){
		
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int m = kboard.nextInt();
		
		while (n != m){
			if (n > m) n -= m;
			if (m > n) m -= n;
		}
		System.out.println(n);
		
	}
	
}
