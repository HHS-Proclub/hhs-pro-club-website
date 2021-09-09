import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB3 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // Process        
        while(in.hasNextInt()){
        	int input = in.nextInt();
        	for(int i = 1; i <= input;i++){
        		if(input%i == 0){
        			// Print output
        			System.out.println(i);
        		}
        	}
        }
        
        
        
    }
    
}
 