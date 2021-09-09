import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 

public class PRA4 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean ab = true;
		boolean ac = true;
		boolean bc = true;
		if(a+b <= c){
		   c -= (c-(a+b) +1);	
		} 
        if (a+c <= b){
        	b -= (b-(a+c) +1);	
		} 
		if(b+c <= a){
			a -= (a-(b+c) +1);	
		}
		
		System.out.println("" + (a +b+c));
	}

}