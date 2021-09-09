import java.util.Scanner;

public class PRB1 {
	
	public static void main (String[] args)
	{
		String s = "";
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		for(int counter = 0; counter < i; counter++)
		{
			int answer = 0;
			int num = scanner.nextInt();
			for (int n = 0; n <= num; n++) {
				if (n*(n + 1)/2 <= num)
				{
					answer = n;
				}
			}
			s += answer + "\n";
		}
		System.out.println(s);
	}

}
