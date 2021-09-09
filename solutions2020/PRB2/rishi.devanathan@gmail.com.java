import java.util.Scanner;
 
/**
 * 
 * Author: Rishikesh Devanathan
 *
 */
 
public class PRB2 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
		
		// Process    
		int sum = 0;
		
		while (in.hasNextInt()){
			int number = in.nextInt();
			sum+=number;
		}    
        
        // Print output
        System.out.println(sum);
    }
    
}
 