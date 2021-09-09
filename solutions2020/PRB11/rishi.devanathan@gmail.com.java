import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB11 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int hyp = in.nextInt();
        int degrees = in.nextInt();
        // Process        
        
        double radians = Math.toRadians(degrees);
        int Area = (int) (0.5 * (hyp* Math.sin(radians) * hyp * Math.cos(radians)));
        
        System.out.print(Area);
        
        // Print output
        
    }
    
}
 
