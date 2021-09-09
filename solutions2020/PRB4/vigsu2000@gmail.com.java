import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = Integer.parseInt(scan.nextLine());
		int j = Integer.parseInt(scan.nextLine());
		for(int a = 1; a <= j; a++) {
			System.out.println(i*a);
		}
	}
}
