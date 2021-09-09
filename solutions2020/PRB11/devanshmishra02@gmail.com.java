import java.util.Scanner;
public class PRB11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double hyp = s.nextInt();
		double angle = s.nextInt();
		double sinVal = Math.sin(Math.toRadians(angle));
		double cosVal = Math.cos(Math.toRadians(angle));
		double result = .5*(hyp*cosVal * hyp*sinVal);
		System.out.println((int)result);
		
		
	}

}
