import java.util.Scanner;
// GCD

public class PRB7 {

	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		String a = thing.nextLine();
		String b = thing.nextLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		if (x<y) {
			y = x;
			x = Integer.parseInt(b);
		} 
		
		while (x % y != 0) {
			int temp = x;
			x = y;
			y = temp%y;
		}
		System.out.println(y);
	}

}
