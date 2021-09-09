import java.util.Scanner;

public class PRB11 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		int hyp = Kboard.nextInt();
		int ang = Kboard.nextInt();
		double angle = ang * 0.0174533;
		System.out.println((int)(.5*(Math.sin(angle)*hyp*Math.cos(angle)*hyp)));
	}
}
