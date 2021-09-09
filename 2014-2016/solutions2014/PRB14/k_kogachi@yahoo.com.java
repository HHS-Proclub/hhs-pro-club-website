import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Kazu Kogachi
 * April 21, 2015
 */

public class PRB14 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = 0;
        n = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(in.readLine());
        	int[] x = new int[] {Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())};
        	Arrays.sort(x);
        	
        	System.out.println(x[1]);
        }
        
	}
	
}
