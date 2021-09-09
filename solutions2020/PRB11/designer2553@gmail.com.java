import java.util.Scanner;

public class PRB11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hyp = in.nextInt();
		int angdeg = in.nextInt();
		double angrad = Math.toRadians(angdeg);
		
		long area = (long)(.5 * hyp * Math.cos(angrad) * hyp * Math.sin(angrad));
		System.out.println(area);
	}

}
