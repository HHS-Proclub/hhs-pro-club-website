import java.util.Scanner;
public class R3B1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		System.out.println((y2 - y1)/(x2 - x1));
	}
}
