import java.io.*;
import java.util.*;
import java.math.*;

/*
 * Kazu Kogachi
 * January 23, 2015
 */

public class CS5 {

	public static void main (String [] args) throws IOException {
//	    BufferedReader in = new BufferedReader(new FileReader("cowroute.in"));
//	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowroute.out")));

	    Scanner in = new Scanner(System.in);
	    
	    //StringTokenizer st = new StringTokenizer(in.readLine());

	    char[] s = in.nextLine().toCharArray();
	    char[] t = in.nextLine().toCharArray();
	    
	    for(int i = 0; i < t.length; i++) {
	    	boolean found = false;
	    	int j = 0;
	    	for(; j < s.length; j++) {
	    		if(t[i] == s[j]) {
	    			found = true;
	    			break;
	    		}
	    	}
	    	if(found) {
    			s[j] = ' ';
	    	} else {
	    		System.out.print(t[i]);
	    	}
	    }
	    
	    System.out.println("");
	    
	    for(int i = 0; i < s.length; i++) {
	    	if(s[i] != ' ') {
	    		System.out.print(s[i]);
	    	}
	    }
	    
	    System.out.println("");
	    
//	    out.close();                                  // close the output file
//	    System.exit(0);                               // don't omit this!
	  }

}
