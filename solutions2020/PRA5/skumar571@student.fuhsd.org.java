import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PRA5 {
	static int numlines;
	
	
	public static void main(String[] args) throws IOException {
		
		int temp, temp2, ans;
		
		ans = 0;
		// TODO Auto-generated method stub
Scanner r = new Scanner(System.in);
	    numlines =  r.nextInt();
	    
	    for (int i = 0; i< numlines; i++) {
	    	temp = r.nextInt();
	    	temp2 = r.nextInt();
	    	
	    	
	    	for (int c = temp; c <= temp2; c++) {
	    		
	    		for ( int d = 1; d < 3; d++) {
	    			
	    			if (Math.pow((double)c, 1.0/d) %1 ==0){
	    				ans++;
	    			}
	    			
	    			
	    			
	    		}
	    	}
	    	
	    	
	    	
	    }
	    
	    
	}

}
