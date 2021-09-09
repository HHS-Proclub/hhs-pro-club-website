import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int cases = 0; cases < scan.nextInt(); cases++) {
			System.out.println(scan.nextInt() * scan.nextInt());
		}
	}
}