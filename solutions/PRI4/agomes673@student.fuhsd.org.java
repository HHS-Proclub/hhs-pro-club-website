import java.util.Arrays;
import java.util.Scanner;

public class PRI4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numtimes=sc.nextInt();
		for(int q=0;q<numtimes;q++) 
		{
			int numcams=sc.nextInt();
			int[] campos=new int[numcams];
			int[] camrange=new int[numcams];
			boolean spit=false;
			for(int i=0;i<numcams;i++) 
			{
				campos[i]=sc.nextInt();
				camrange[i]=sc.nextInt();
			}
	        
			long temp;
		    boolean swapped;
		    for (int i = 0; i < numcams - 1; i++)
		    {
		            swapped = false;
		            for (int j = 0; j < numcams - i - 1; j++)
		            {
		                if (campos[j] > campos[j + 1])
		                {
		                    temp = campos[j];
		                    campos[j] = campos[j + 1];
		                    campos[j + 1] = (int) temp;		                    
		                    temp = camrange[j];
		                    camrange[j] = camrange[j + 1];
		                    camrange[j + 1] = (int) temp;		
		                    swapped = true;
		                }
		            }

		            if (!swapped)
		                break;
		    }
		    for(int i=0;i<numcams;i++) 
		    {
		    	int targetdist=campos[i]+camrange[i];
		    	for(int j=i+1;j<numcams;j++) 
		    	{
		    		if(campos[j]==targetdist) 
		    		{
		    			if(campos[j]+camrange[j]==campos[i]) 
		    			{
		    				spit=true;
		    			}
		    		}
		    	}
		    	
		    }
		    if(spit) 
		    {
		    	System.out.println("YES");
		    }else 
		    {
		    	System.out.println("NO");
		    }
		    
		    
		        
		}
		
	}

}

