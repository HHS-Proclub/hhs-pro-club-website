import java.util.Scanner;

public class PRB11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] brokenUp = line.split(" ");
		int firstOne = Integer.parseInt(brokenUp[0]);
		
		int angle = Integer.parseInt(brokenUp[1]);
		
		double sinof = Math.sin(Math.PI / 180 * angle);
		double cosof = Math.cos(Math.PI / 180 * angle);
		
	    int doubleanswer = (int) (0.5 * ((firstOne * sinof) * (firstOne * cosof)));
		
//		System.out.println("First one is: " + firstOne);
//		System.out.println("Angle is: " + angle);
//		System.out.println("Math.sin(angle) is " + sinof);
//		System.out.println("Math.cos(angle) is " + cosof);
//		
		//.5(8*sin(30) * 8 * cos(30))
		System.out.println(doubleanswer);
	}
}
