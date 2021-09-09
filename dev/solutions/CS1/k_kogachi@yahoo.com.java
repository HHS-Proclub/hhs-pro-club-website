import java.io.*;
import java.util.*;

/*
 * Kazu Kogachi
 * January 23, 2015
 */

public class CS1 {

	public static void main (String[] args) throws IOException {
//	    BufferedReader in = new BufferedReader(new FileReader("cowroute.in"));
//	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowroute.out")));

	    Scanner in = new Scanner(System.in);
	    
	    //StringTokenizer st = new StringTokenizer(in.readLine());

	    char[] a = in.nextLine().toCharArray();
	    char[] b = in.nextLine().toCharArray();
	    
	    int[] re = new int[3];
	    
	    for(int i = 0; i < 3; i++) {
	    	re[2-i] = (a[2-i] + b[2-i] - 96) % 10;
	    }
	    
	    System.out.println(re[0] + "" + re[1] + "" + re[2]);
	    
//	    out.close();                                  // close the output file
	    System.exit(0);                               // don't omit this!
	  }

}
