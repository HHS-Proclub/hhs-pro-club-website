import java.util.ArrayList;
import java.util.Scanner;


public class PRA3 
{
	public static void main (String args[])
	{	
		PRA3 tester = new PRA3();
		int index = tester.calcIndex(tester.storeNum());
		System.out.println(index);
	}
	
	private ArrayList<Integer> storeNum()
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			values.add(s.nextInt());
		return values;
	}
	
	private int calcIndex(ArrayList<Integer> values)
	{
		for (int i = 0; i < values.size(); i++)
		{
			int left = 0;
			int right = 0;
			for (int j = 0; j <= i; j++)
				left += values.get(j);
			for (int k = values.size()-1; k >= i; k--)
				right += values.get(k);
			if (left == right)
				return i;
		}
		return 0;
	}
}
