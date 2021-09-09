import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int input1 = kboard.nextInt();
		for (int i = 0; i < input1; i++)
		{
			int n = kboard.nextInt();
			int k = kboard.nextInt();
			int zeros = 1;
			for (int count = 0; count < k; count++)
			{
				zeros *= 10;
			}
			int base = zeros;
			while(zeros % n != 0)
			{
				zeros += base;
			}
			System.out.println(zeros);
		}
	}

}
