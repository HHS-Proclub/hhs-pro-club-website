import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> e= new ArrayList<Integer>();
		for(int i=0;i<15;i++)
		{
			e.add(in.nextInt());
		}
		boolean set=false;
		for(int i=2;i<15;i+=3)
		{
			int temp=e.get(i);
			int fives=e.get(i-1);
			int ones =e.get(i-2);
			while(temp>0)
			{
				if(temp>5&&fives>0)
				{
					temp-=5;
					fives--;
				}else if(ones>0){
					temp-=1;
					ones--;
				}
				else{
					System.out.println("false");
					break;
				}
				if(temp==0)
				{
					System.out.println("true");
					set=true;
				}
			}
		}
	}

}
