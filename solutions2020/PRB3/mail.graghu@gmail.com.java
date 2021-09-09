import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		
		for(int x = 1; x <= n; x++) {
			if(n % x == 0) {
				System.out.println(x);
				System.out.println();
			}
		}
	}

}
