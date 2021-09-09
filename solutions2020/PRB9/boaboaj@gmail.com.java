import java.util.Scanner;

public class PRB9 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int input1 = kboard.nextInt();
		for (int i = 0; i < input1; i++)
		{
			for (int count = 0; count < 4; count++)
			{
				int total = 0;
				int n = kboard.nextInt();
				int k = kboard.nextInt();
				int A = kboard.nextInt();
				int B = kboard.nextInt();
				while(n != 1)
				{
					if (n % k == 0)
					{
						n /= k;
						total += B;
					}
					else
					{
						n -= 1;
						total += A;
					}
				}
				System.out.println(total);
			}
		}
	}

}
