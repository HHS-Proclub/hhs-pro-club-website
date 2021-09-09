import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB7 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        
        int length = in.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i =0; i <length; i++){
        	numbers.add(in.nextInt());
        }
        
        int chosen = in.nextInt();
        
        
        // Process        
        double ocurrences = Collections.frequency(numbers, chosen);
        double probability = (ocurrences/length);
        int percent = (int)(probability*100);
        // Print output
        System.out.println(percent);
    }
    
}
 