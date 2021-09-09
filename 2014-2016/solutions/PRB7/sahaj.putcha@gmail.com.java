import java.util.ArrayList;
import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args)
	{
		ArrayList<Integer> x= new ArrayList<Integer>();
            Scanner scanner = new Scanner(System.in);
            String input=scanner.nextLine();
            String[] numbers = input.split("\\s*,\\s*");
            for(String e :numbers)
            {
            	x.add(Integer.parseInt(e));
            }

		System.out.println(findClumps(x));
	}
	public static int findClumps(ArrayList<Integer> x)
	{
		int count=0;
		for(int i =0;i<x.size()-1;i++)
		{
				if(x.get(i)==x.get(i+1))
				{
					count++;
					
					if(i+2<x.size()&&x.get(i)==x.get(i+2))
					{
						count--;
					}
				}
		}
		return count;
	}
}
