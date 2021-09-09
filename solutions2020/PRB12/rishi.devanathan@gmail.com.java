import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB12 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // Process        
        while(in.hasNext()){
        	String str = in.nextLine();
        	String halftext = str.substring(0,(str.length())/2);
        	System.out.println(halftext);
        }
        
        // Print output
        
    }
    
}
 