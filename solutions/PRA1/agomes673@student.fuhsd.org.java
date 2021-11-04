import java.util.Scanner;
public class PRA1 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		long numtimes=sc.nextLong();
		
		for(long i=0;i<numtimes;i++) 
		{
			long num=sc.nextLong();
			for(int j=0; j<1;) {
			long temp=num;
			long sum=0;

				while(temp>0) 
				{
					sum=sum+(temp%10);
					temp=temp/10;
				}
				for( int h=2;h<=sum&&h<=(num/h)+1;h++) 
				{
					if(sum%h==0) 
					{
						if(num%h==0) 
						{
							System.out.println(num);
							j++;
							break;
						}
						
					}
				}
				num++;
				
				
				
			}			
		}
		
		
	}

}
