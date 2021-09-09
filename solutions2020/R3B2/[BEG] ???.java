import java.util.Scanner;

public class R3B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double speedA = s.nextDouble();
		double speedH = s.nextDouble();
		double lapA = s.nextDouble();
		
		double time = lapA / 4 / speedA;
		double lapH = time * speedH *4;
		System.out.println((int) lapH);
	}

}
