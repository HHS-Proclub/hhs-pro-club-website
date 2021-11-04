import java.util.Arrays;
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int cantTouchThis=0;cantTouchThis<numtimes;cantTouchThis++) 
		{
			long n=sc.nextLong();
			long k=sc.nextLong();
			
			long max=n;
			if(n<=k) 
			{
				System.out.println(n);
			}else {
			long addon=1;
			long v=0;
			long lastmin=-2147483648;
			while(max-addon!=1) 
			{
				v=(max-addon)/2+addon;
				
				long tempn=n-v;
				long pow=k;
				while(v/pow!=0) 
				{
					tempn=tempn-(v/pow);
					pow=pow*k;
				}
				if(tempn>0) 
				{
					addon=v;
				}else if(tempn<0) 
				{
					if(tempn>=lastmin) 
					{
						max=v;
						lastmin=tempn;
					}else 
					{
						addon=v;
					}
					
					
				}else 
				{
					max=1;
					addon=0;
				
				}
			}
			
			System.out.println(v);
			}
		

			
			
			

			
		}
	}

}
