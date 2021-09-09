import java.util.Scanner;


public class PRB3 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.next());
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += Integer.parseInt(kboard.next());
		}
		System.out.println(sum / n);
	}
}
