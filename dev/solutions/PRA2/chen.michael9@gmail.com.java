import java.util.*;
public class PRA2 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		
		if (num == 1)
		{
			System.out.println(1);
		}
		else if (num == 2)
		{
			System.out.println(3);
		}
		else
		{
			long x = 1;
			long y = 2;
			long z = 0;
			for (int i = 3; i < num; i++)
			{
				z = x + y;
				x = y;
				y = z;
			}
			System.out.println(z);
		}
	}
}