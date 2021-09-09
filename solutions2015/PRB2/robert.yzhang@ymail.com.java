import java.util.Scanner;
public class PRB2 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		double num1, num2, avg;
		num1 = kboard.nextInt();
		num2 = kboard.nextInt();
		if(num1 < 0)
		{
			num1 = 0;
		}
		if(num2 < 0)
		{
			num2 = 0;
		}
		avg = (num1 + num2)/2;
		System.out.println(avg);
	}

}
