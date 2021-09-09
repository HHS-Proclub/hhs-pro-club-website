import java.util.Scanner;
public class R3B2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double num1 = input.nextDouble();
	double num2 = input.nextDouble();
	double num3 = input.nextDouble();
	Double laps = (num3/num1)*num2;
	int lapsRound = laps.intValue();
	System.out.println(lapsRound);
	input.close();
	}
}
