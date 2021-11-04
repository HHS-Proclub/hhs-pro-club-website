import java.util.Scanner;

public class PRI2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes= sc.nextInt();
		for(int cantTouchThis=0;cantTouchThis<numtimes;cantTouchThis++) 
		{
			
			String bistr=sc.next();
			int ones=0;
			int zeros=0;
			int finone=0;
			for(int i=0;i<bistr.length();i++) 
			{
				if(bistr.charAt(i)=='1') 
				{
					ones++;
					finone=i;
				}else 
				{
					zeros++;
				}
			}
			
			int counter=0;
			if(ones==1) 
			{
				counter=zeros;
				
			}else 
			{
				for(int i=finone;i<bistr.length();i++) 
				{
					if(bistr.charAt(i)=='0') 
					{
						zeros--;
						ones++;
					}
				}
				counter=ones+(2*zeros)+1;
				
			}
			
			System.out.println(counter);
			
			

			
			
			
			
		


		}
	}
	

}
