import java.io.*;
import java.util.Scanner; 
	
public class PRA2 {
	    
	public static void main(String args[]) throws IOException{ 
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter number of integers.");
		int n = scanner.nextInt();
		int[] num = new int[n];
		for(int i = 0; i<n; i++) {
			//System.out.println("Enter numbers.");
			num[i] = scanner.nextInt();	
		}
		for(int i = 0; i< num.length; i++) {
			if (isEmirp(num[i]) == true)  System.out.println("YES");
			else System.out.println("NO"); 
		}
	   
	}  
	  
	public static boolean isEmirp(int n) { 
		if (isPrime(n) == false) 
	        return false; 
	   
        int rev = 0; 
        int rem = 0;
       
        while (n != 0) { 	
        	rem = n % 10; 
	        rev = rev * 10 + rem; 
	        n = n/10; 
	        
        } 
	  
	    if(rev != n || rev!=11){
        return isPrime(rev); 
      }
      else return false;
	 } 
	    
	public static boolean isPrime(int n){ 
        if (n <= 2 || n==11) {
        	return false; 
	    }
	    for (int i = 2; i < n; i++) { 
	    	if (n % i == 0) { 
	            return false;
	           }
     }
	  
	    return true; 
	   
	} 
	  
	
	    
	} 


