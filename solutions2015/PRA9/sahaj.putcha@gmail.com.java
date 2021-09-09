import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRA9 {
	
	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int num=k.nextInt();
		ArrayList<Integer> x=new ArrayList<Integer>();
		for(int i=0;i<num;i++)
		{
			x.add(k.nextInt());
		}
		System.out.println(calcualteCost(num,x));
	}
	public static int calcualteCost(int items,ArrayList<Integer> arr)
	{ 
		Collections.sort(arr);
		int total=0;
		int counter=0;
		for(int i=arr.size()-1;i>=0;i--)
		{
			counter++;	
			total+=arr.get(i);
			if(counter==2 && i>=2)
			{
				arr.set(i-1,0);
				arr.set(i-2,0);
				i-=2;
				counter=0;
			}
			else if(i==1&& counter==2)
			{
				arr.set(i-1,0);
			}
		}
		//System.out.println(arr);
		return total;
	}
}
