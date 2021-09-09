//package HPIPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/*
 * Kazu Kogachi
 * Mar 29, 2015
 */

public class HPIB {

	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int num = Integer.parseInt(in.readLine());
        
        String[] beads = new String[num];
        for(int i = 0; i < num; i++) {
        	beads[i] = in.readLine();
        }
        boolean flag = false;
        for(int i = 0; i < beads.length-1; i++) {
        	for(int j = 1; j < beads.length; j++) {
        		if(		beads[i].charAt(0) == beads[j].charAt(beads[j].length()-1) &&
        				beads[i].charAt(beads[i].length()-1) == beads[j].charAt(0)) {
        			flag = true;
        			break;
        		}
        	}
        }
        
        if(flag){
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
 	}
}