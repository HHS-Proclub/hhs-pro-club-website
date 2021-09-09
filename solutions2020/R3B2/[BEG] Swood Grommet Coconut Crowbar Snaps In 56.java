import java.util.Scanner;

public class R3B2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double aSpeed = scanner.nextDouble();
		double hSpeed = scanner.nextDouble();
		double aLaps = scanner.nextDouble();
		double time = aLaps / aSpeed * 4;
		int hLaps = (int)(hSpeed * time / 4);
		System.out.println(hLaps);
	}
}
