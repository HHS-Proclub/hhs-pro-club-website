import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int x = scan.nextInt(); x > 0; x--) {
			int y = scan.nextInt();
			int z = scan.nextInt();
			System.out.println(y + z);
		}
	}
}
