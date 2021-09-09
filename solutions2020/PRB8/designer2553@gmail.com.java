import java.util.Scanner;

public class PRB8 {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		// So the base equation is dy = vt + .5at^2
		// Since initial velocity is 0, the real equation is dy = .5at^2
		// Move everything except t^2: 2dy/a = t^2
		// Sqrt! t = +-sqrt(2dy/a)
		long time = Math.round(Math.sqrt(2 * height / 9.81));
		System.out.println(time);
	}
}
