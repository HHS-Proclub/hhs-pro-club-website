import java.util.Scanner;

public class PRB11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] data = (in.nextLine()).split(" ");
		double distance =Double.parseDouble(data[0]);
		double angle = Double.parseDouble(data[1]);
		System.out.println((int)(Math.floor(distance*Math.sin(angle*0.0174533)*distance*Math.cos(angle*0.0174533)*0.5)));
	}

}
