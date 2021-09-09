import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		if (y < 0) {
			in.close();
			return;
		}
		double t = Math.sqrt(y / 5.0);
		int val = (int)(t + 0.5);
		System.out.println(val);
		in.close();
				
	}
}
