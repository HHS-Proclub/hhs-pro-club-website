import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int i = Kboard.nextInt();
		int j = Kboard.nextInt();
		for(int count = 1; count <= j; count++) {
				System.out.println(count*i);
		}
	}
}
