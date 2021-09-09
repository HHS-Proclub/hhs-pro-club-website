import java.util.*;
public class PRA1 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String num1 = kboard.next();
		
		int num10 = Integer.parseInt(num1, 16);
		
		String num2 = kboard.next();
		
		int num11 = Integer.parseInt(num2, 16);
		
		int num3;
		
		if (num10 > num11)
		{
			num3 = num10;
		}
		else if (num10 == num11)
		{
			num3 = num10;
		}
		else
		{
			num3 = num11;
		}
		
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 1; i < Math.sqrt(num3); i++)
		{
			if (num10 % i == 0 && num11 % i == 0)
			{
				array.add(i);
			}
		}
		
		int finalgcd = array.get(0);
		for (int j = 1; j < array.size(); j++)
		{
			if (array.get(j) > finalgcd)
			{
				finalgcd = array.get(j);
			}
		}
		
		String str = Integer.toHexString(finalgcd);
		int finalint = Integer.parseInt(str);
		
		System.out.println(finalgcd);
		System.out.printf("%04d", finalint);
		
	}
}
