import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int tot = a + b;
			System.out.println(tot);
		}
	}
}
