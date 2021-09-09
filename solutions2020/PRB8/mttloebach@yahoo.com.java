import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.round;
public class PRB8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		double time = Math.sqrt(y/5);
		int t = (int) Math.round(time); 
		System.out.println(t);
	}
}
