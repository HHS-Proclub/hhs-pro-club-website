import java.math.MathContext;
import java.util.Scanner;
public class PRB8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		double time = Math.sqrt(height/5);
		int ans = (int) Math.round(time);
		System.out.println(ans);
		

	}

}
