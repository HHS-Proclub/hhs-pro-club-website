import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int q=0;q<numtimes;q++) 
		{
			int numcams=sc.nextInt();
			int[] candur=new int[numcams];
			for(int i=0;i<numcams;i++) 
			{
				candur[i]=sc.nextInt();
				
			}
			Arrays.sort(candur);
			
		    int sum=numcams;
		    int cannum=0;
		    for(int i=numcams-1;i>=0;i--) 
		    {
		    	sum=sum+(cannum*candur[i]);
		    	cannum++;
		    }
		    System.out.println(sum);


			
		}
	}

}




