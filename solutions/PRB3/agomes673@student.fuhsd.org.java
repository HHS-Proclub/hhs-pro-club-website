import java.util.Arrays;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int peterCantTouchThis=sc.nextInt();
		for(int cantTouchThis=0;cantTouchThis<peterCantTouchThis;cantTouchThis++) 
		{
			int sum=0;
			int numPeople=sc.nextInt();
			int friedPairs=sc.nextInt();
			int[] goldVals=new int[numPeople];
			
			for(int i=0;i<numPeople;i++) 
			{
				goldVals[i]=sc.nextInt();
			}
			int f1;
			int f2;
			for(int i=0;i<friedPairs;i++) 
			{
				f1=sc.nextInt();
				f2=sc.nextInt();
				if(Math.abs(goldVals[f1-1])<Math.abs(goldVals[f2-1])) 
				{
					goldVals[f2-1]=-1*Math.abs(goldVals[f1-1]);
				}else 
				{
					goldVals[f1-1]=-1*Math.abs(goldVals[f2-1]);
				}
				
			}
			for(int i=0;i<numPeople;i++) 
			{
				if(goldVals[i]>0) 
				{
					sum+=goldVals[i];
				}
			}
			System.out.println(sum);
		}
	}

}
