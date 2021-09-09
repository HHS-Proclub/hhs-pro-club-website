import java.util.*;
public class PRB3 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int num = kboard.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < num; i++)
		{
			int num1 = kboard.nextInt();
			array.add(num1);
		}
		
		int sum = 0;
		int average = 0;
		for (int j = 0; j < array.size(); j++)
		{
			sum += array.get(j);
		}
		
		average = sum / array.size();
		
		System.out.println(average);
	}
}
