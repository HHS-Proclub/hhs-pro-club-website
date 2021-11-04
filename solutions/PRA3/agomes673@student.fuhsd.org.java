import java.util.Arrays;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int peterCantTouchThis=sc.nextInt();
		for(int cantTouchThis=0;cantTouchThis<peterCantTouchThis;cantTouchThis++) 
		{
			int numSongs=sc.nextInt();
			int maxPlay=sc.nextInt();
			long[] songLength=new long[numSongs];
			int[] songBeauty=new int[numSongs];
			for(int i=0;i<numSongs;i++) 
			{
				songLength[i]=sc.nextInt();
				songBeauty[i]=sc.nextInt();
			}

			 
			 long temp;
		        boolean swapped;
		        for (int i = 0; i < numSongs - 1; i++)
		        {
		            swapped = false;
		            for (int j = 0; j < numSongs - i - 1; j++)
		            {
		                if (songBeauty[j] > songBeauty[j + 1])
		                {
		                    temp = songBeauty[j];
		                    songBeauty[j] = songBeauty[j + 1];
		                    songBeauty[j + 1] = (int) temp;		                    
		                    temp = songLength[j];
		                    songLength[j] = songLength[j + 1];
		                    songLength[j + 1] = (int) temp;		
		                    swapped = true;
		                }
		            }

		            if (!swapped)
		                break;
		        }
				
		        int mult=0;
		        long score;
		        long maxscore=0;
		        for(int i=0;i<numSongs;i++) 
		        {
		        	mult=songBeauty[i];
		        	long sum=0;
		        	long[] tempLength=Arrays.copyOfRange(songLength, i, songLength.length);
		        	Arrays.sort(tempLength);
		        	for(int j=0;j<maxPlay&&j<tempLength.length;j++) 
		        	{
		        		sum=sum+tempLength[tempLength.length-1-j];
		        		
		        	}
		        	
		        	score=sum*mult;
		        	

		        	if(score>maxscore) 
		        	{
		        		maxscore=score;
		        	}
		        }
		        System.out.println(maxscore+"");
		        
		        
			
		} 
		
	}

}
