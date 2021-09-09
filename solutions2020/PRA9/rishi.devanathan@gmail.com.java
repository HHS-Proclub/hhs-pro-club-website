import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashSet;
/**
 * 
 * @author Your Name
 *
 */
public class PRA9 {
	
    public static void main(String[] args) {
    	// Take input
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        
        
        for (int i = 0; i <= length; i++) {
        	
        	StringTokenizer token = new StringTokenizer(in.nextLine());
        	ArrayList<Integer> inputs = new ArrayList<>();
        	
            while (token.hasMoreTokens()) {
            	int bars = Integer.parseInt(token.nextToken());
            	inputs.add(bars%7);
            }
            
            HashSet noDupSet = new HashSet();
            
            for(int j: inputs){
            	noDupSet.add(j);
            }
            
            if (noDupSet.size() > 0){
            	System.out.println(noDupSet.size());
            }
            
        }
        
    }
    
}