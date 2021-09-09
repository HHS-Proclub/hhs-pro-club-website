import java.util.Scanner;


public class PRB2 {

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int start = Integer.parseInt(kboard.next());
		int fin = Integer.parseInt(kboard.next());
		double result = 0;
		int count = 0;
		for(int i = start; i<fin; i++)
			if(i>0)
			{
				result+=i;
				count++;
			}
		System.out.println(result/=count);
	}
}
