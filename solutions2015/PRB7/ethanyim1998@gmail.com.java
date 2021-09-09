import java.util.ArrayList;
import java.util.Scanner;


public class PRB7 
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] list = input.split(",");
		
		ArrayList <Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++)
		{
			numList.add(Integer.parseInt(list[i]));
		}
		
		PRB7 object = new PRB7();
		System.out.println(object.getClump(numList));
		
	}
	
	
	private int getClump(ArrayList<Integer> list)
	{
		int remember = list.get(0);
		boolean alreadyRemembered = false;
		int clumpCount = 0;
		
		for (int i = 1; i < list.size(); i++)
		{
			if (list.get(i) == remember && !alreadyRemembered)
			{
				clumpCount++;
				alreadyRemembered = true;
			}
			else if (list.get(i) != remember)
			{
				alreadyRemembered = false;
				remember = list.get(i);
			}
		}
		
		return clumpCount;
	}
}
