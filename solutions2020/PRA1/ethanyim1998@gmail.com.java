import java.util.Scanner;

public class PRA1 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int[] list1 = {s.nextInt(), s.nextInt(), s.nextInt()};
		int[] list2 = {s.nextInt(), s.nextInt(), s.nextInt()};
		int[] list3 = {s.nextInt(), s.nextInt(), s.nextInt()};
		int[] list4 = {s.nextInt(), s.nextInt(), s.nextInt()};
		int[] list5 = {s.nextInt(), s.nextInt(), s.nextInt()};
		PRA1 object = new PRA1();
		boolean[] results = new boolean[5];
		
		results[0] = object.isPossible(list1);
		results[1] = object.isPossible(list2);
		results[2] = object.isPossible(list3);
		results[3] = object.isPossible(list4);
		results[4] = object.isPossible(list5);

		for (int i = 0; i < 5; i++)
			System.out.println(results[i]);
	}
	
	
	private boolean isPossible(int[] list)
	{	
		for (int i = 1; i <= list[1]; i++)
		{
			if (list[2] - 5 >= 0)
				list[2] -= 5;
		}
		
		if (list[2] - list[0] <= 0)
			return true;
		else 
			return false;
	}
}
