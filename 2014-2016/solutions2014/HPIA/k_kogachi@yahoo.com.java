//package HPIPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/*
 * Kazu Kogachi
 * Mar 17, 2015
 */

public class HPIA {

	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int num = Integer.parseInt(in.readLine());
        
        int[] primes = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71};
        
        int low = -1;
        for(int i = 0 ; i < primes.length; i++){
        	if(num%primes[i] == 0){
        		low = primes[i];
        		break;
        	}
        }
        
        if(low == -1) {
        	System.out.print("-1\n-1");
        }else{
        	System.out.print(num/low + "\n" + low);
        }

	}
}