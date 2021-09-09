
import java.util.Scanner;

public class PRI1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    	int times = in.nextInt();
    	
    	
    	for (int i = 0; i > times; i++) {
        	int Slob = in.nextInt();
        	int Bob = in.nextInt(); 
    		int years = 0;
    		
    		while (Slob >= Bob) {
    			Slob = Slob * 2;
    			Bob = Bob * 2;
    			years = years+ 1;
    					
    		}
    	System.out.println(years);
    	}
	}
}

