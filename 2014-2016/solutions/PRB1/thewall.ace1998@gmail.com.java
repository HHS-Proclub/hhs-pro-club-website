import java.util.InputMismatchException;
import java.util.Scanner;

public class PRB1 {

	public static void main (String[] args) {
		Scanner kboard = new Scanner (System.in);
    	boolean goodData = false;
    	
		long x = 0;
		long answer = 0;
		
		while(!goodData){
    		try
    	      {      
    			//System.out.print("What is the input? --> ");
    			x = kboard.nextLong();  
    			if(x < 0)
    				throw new InputMismatchException();
    			goodData = true;
    	      } 

    	      catch (Exception badData)
    	      { 
    	        System.out.println("You entered bad data. " );
    	        System.out.println("Please try again with a positive integer.\n" );
    	      
    	        if(x != 0)
    	        	x = 0;
    	        else
    	        	{
    	        		String flush = kboard.next();
    	        	}
    	      }finally{
    	    	  kboard.close();
    	      }
    	}
		
		
		try{
			answer = x * 3;
			System.out.println(answer);
		}
			catch(StackOverflowError tooBig){
				System.out.println ("I tried. And died. Please use a smaller number!");
		}
	}
}
