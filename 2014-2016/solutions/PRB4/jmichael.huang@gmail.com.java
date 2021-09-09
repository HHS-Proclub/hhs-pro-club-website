import java.util.Scanner;


public class PRB4 {

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<4; i++)
			sum += Integer.parseInt(kboard.next());
		long result = sum;
		while(sum>1)
		{
			sum--;
			result*=sum;
		}
		System.out.println(result);
	}
}
