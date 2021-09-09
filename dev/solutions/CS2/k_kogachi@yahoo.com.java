import java.io.*;
import java.util.*;
import java.math.*;

/*
 * Kazu Kogachi
 * January 23, 2015
 */

public class CS2 {

	public static void main (String [] args) throws IOException {
//	    BufferedReader in = new BufferedReader(new FileReader("cowroute.in"));
//	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowroute.out")));

	    Scanner in = new Scanner(System.in);
	    
	    //StringTokenizer st = new StringTokenizer(in.readLine());

		int[] data = new int[in.nextInt()];
	    int numUnderPivot = 0, numPivot = 0;
	    for(int i = 0; i < data.length; i++) {
	    	data[i] = in.nextInt();
	    	if(data[i] < data[0]){
	    		numUnderPivot++;
	    	} else if (data[i] == data[0]) {
	    		numPivot++;
	    	}
	    }
	    
	    //pivot = data[0];
	    
	    int[] nData = new int[data.length];
	    for(int i = 0,j = numUnderPivot+numPivot, k = 0, m = 0; i < data.length; i++) {
	    	if(data[i] < data[0]) {
//	    		System.out.println("1 data[i] " + data[i]);
	    		nData[k] = data[i];
	    		k++;
	    	} else if (data[i] > data[0]) {
//	    		System.out.println("2 data[i] " + data[i]);
	    		nData[j] = data[i];
	    		j++;
	    	} else {
	    		nData[numUnderPivot+m] = data[0];
	    		m++;
	    	}
	    }
	    
	    System.out.println(Arrays.toString(nData).replaceAll("[^0-9 ]", ""));
	    
//	    out.close();                                  // close the output file
//	    System.exit(0);                               // don't omit this!
	  }

}
