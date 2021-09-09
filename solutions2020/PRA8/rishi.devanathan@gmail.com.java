import java.util.Scanner;
 
/**
 * 
 * @Rishikesh 
 *
 */
public class PRA8 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int numberofinputs = in.nextInt();

        // Process        
        while(in.hasNextInt()){
        	int number = in.nextInt();
        
        	for(int i = 0; i< 1000000;i++){
        		if (isFibonocci(number+i)){
        			System.out.println(i);
        			break;
        		}
        		if (isFibonocci(number-i)){
        			System.out.println(i);
        			break;
        		}
        	}
        }
        
    }
    
    public static boolean isFibonocci(int n){
    	
    	int a=0, b=1 ,c=0; 
      
        while(c<n) {
             c = a + b; 
             a = b;
             b = c;
         }
 
        return (c==n);
             
    }
    
}
 