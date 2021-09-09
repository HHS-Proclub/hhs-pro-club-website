import java.math.BigInteger;
import java.util.*;

public class PRA4 {

	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
	//	System.out.print(" ");
		String numOrig = input.next();
	    String binary = numOrig; BigInteger sum = new BigInteger("0");
	
	    
	  //CONSTANTS
	    BigInteger zero = new BigInteger("0");
	   //CONSTANTS
	    
	    
	    for(;binary.length() != 0;binary = binary.substring(1))
	    {
	    	BigInteger pow2 = new BigInteger("2");
	    	pow2 = pow2.pow(binary.length()-1);
	    	sum = sum.add((new BigInteger(new BigInteger(Integer.parseInt(binary.charAt(0)+"")+"").multiply(pow2)+"")));
	    }
	  
	    binary = ""; BigInteger dec = sum.multiply(new BigInteger(17+"")); // never going to use summ again
	    BigInteger sum2 = null;
	    sum = null; 
	      
	    while(dec.bitLength()!=binary.length())
	    {	
	    	//testing
	    	BigInteger pow2 = new BigInteger("2");
	    	pow2 = pow2.pow(binary.length());
	    	//testing
	   
			if((dec.and(pow2)).compareTo(pow2) == 0)
				binary = "1" + binary;
			else
				binary = "0" + binary;
	    }
	    
	    if(binary.length() == 0)
	    	binary = "0";
	    
	    System.out.println(binary);

	}
}
