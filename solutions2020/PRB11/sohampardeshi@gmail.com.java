import java.util.Scanner;

public class PRB11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = Integer.parseInt(s.next());
		double ang = Math.toRadians(Integer.parseInt(s.next()));

		System.out.println((int)(0.5 * len * Math.sin(ang) * len * Math.cos(ang)));
		
	}
}