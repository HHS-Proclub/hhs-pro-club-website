import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int mutliples = scanner.nextInt();
		for(int i = 1; i <= mutliples; i++)
		{
			System.out.println(base * i);
		}
	}
}
