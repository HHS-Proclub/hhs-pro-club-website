import java.util.Arrays;
import java.util.Scanner;

public class PRI3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int cantTouchThis=0;cantTouchThis<numtimes;cantTouchThis++) 
		{
			int  houses= sc.nextInt();
			int[] places=new int[3];
			int moves=0;
			for(int i=0;i<houses;i++) 
			{
				places[2]=places[1];
				places[1]=places[0];
				places[0]=sc.nextInt();
				if(places[1]==0&&places[2]==1&&places[0]==1) 
				{					
					moves++;
					places[0]=0;
				}				
			}			
			System.out.println(moves);			
		}
	}

}


