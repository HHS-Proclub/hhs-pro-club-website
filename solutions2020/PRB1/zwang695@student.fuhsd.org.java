/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PRB1
{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(f.readLine());
        	System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
	}
}