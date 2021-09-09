import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRB9 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // Process        
        while(in.hasNext()){
        	
        	String str = in.nextLine();
        	String one = (str.length() > 0 && str.charAt(0) == 'a') ? "a" : "";
            String two = (str.length() > 1 && str.charAt(1) == 'b') ? "b" : "";

            System.out.println(one+two+((str.length() > 2) ? str.substring(2) : ""));       
        
        }
    
    }
    
}
    