import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.*;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB6 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(in.hasNextLine()){
        	int i = in.nextInt();
        	numbers.add(i);
        }
        
        // Process        
        int sum = 0;
        for (int d: numbers){
        	sum+=d;
        }
        int max = Collections.max(numbers);
        
        if(sum-max == max){
        	System.out.println(max);
        }
        else{
        	System.out.println(sum);
        }
        // Print output
        
    }
    
}
 