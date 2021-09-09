import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB8 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();

        // Process        
        int initialv = 0;
        int g = 10;
        
        int time = (int) ((Math.sqrt((2*g*height)+initialv) + initialv)/g);
        
        
        // Print output
        System.out.println(time);
    }
    
}
 