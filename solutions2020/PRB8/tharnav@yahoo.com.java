import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int y = Kboard.nextInt();
		
		System.out.println((int)(Math.sqrt(y*2/10)+0.5));
	}
}
