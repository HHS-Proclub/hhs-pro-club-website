import java.util.Scanner;
public class R3B1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double slope = (y1-y2)/(x1-x2);
		if(slope == 0){
			System.out.println("na");
		}else{
		slope = (double)Math.round(slope * 1000d) / 1000d;
			System.out.println(slope);
		}
		input.close();
	}

}
