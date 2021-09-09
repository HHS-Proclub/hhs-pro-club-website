import java.util.InputMismatchException;
import java.util.Scanner;

public class PRA1 {

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
    	      //  System.out.println("You entered bad data. " );
    	        //System.out.println("Please try again with a positive integer.\n" );
    	      
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
			answer = multiplyPrimes(x);
			System.out.println(Integer.toString((int) answer, 8));
		}
			catch(StackOverflowError tooBig){
				//System.out.println ("I tried. And died. Please use a smaller number!");
		}
	}
	
	private static long multiplyPrimes(long limit){
		long product = 1;
		boolean prime;
		for(long i = 1; i < limit; i++){
			prime = true;
			for(long j = i-1; j > 1; j--){
				if(i%j == 0)
					prime = false;
			}
			if(prime)
				product = product * i;
			
		}
	
		if(limit == 1)
			return 0;
		return product;
	}
	
	private static long base8(long product){
		long power = 0;
		long answer = 0;
		
		while(product >= Math.pow(8, power)){
			power++;
		}
		power--;
		
		int base;
		//System.out.println("Power " + power);
		
		while(product > 0){
			base = (int) (product/(Math.pow(8, power)));
			product = (long)(product%(Math.pow(8, power)));
			answer += base * Math.pow(10, power);
			power--;
		}
		
		
		return answer;
	}
	
	
}
