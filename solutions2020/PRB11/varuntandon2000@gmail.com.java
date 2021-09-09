import java.util.Arrays;
import java.util.Scanner;

public class PRB11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int radius = s.nextInt();
		int angle = s.nextInt();
//		if(angle >= 90)
//			angle = 180 - angle;
		double side1 =  (radius*Math.sin(angle*(Math.PI/180)));
		double side2 = (radius*Math.cos(angle*(Math.PI/180)));
		System.out.println((int) (side1*side2 /2));

	}
}