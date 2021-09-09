import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRA10 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        
        // Process        
        while(in.hasNextLine()){
        	int lowerbound = in.nextInt();
        	int upperbound = in.nextInt();
        	int count = 0;
        	for (int i = lowerbound; i <= upperbound; i++){
        		if(isPalandrome(i) && isPrime(i)){
        			count++;
        		}
        		
        	}
        	System.out.println(count);
        }
        
        
        // Print output
        
    }
    public static boolean isPalandrome (int number){
    	String str = String.valueOf(number);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    public static boolean isPrime(int number){
    	
    	if (number == 1){
    		return false;
    	}
    	if ( number > 2 && number%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(number) + 1;
        for(int i = 3; i < top; i+=2){
            if(number % i == 0){
                return false;
            }
        }
        return true; 
    }
    
}
 
