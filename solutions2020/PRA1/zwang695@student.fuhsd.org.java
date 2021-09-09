import java.util.*;
import java.lang.*;
import java.io.*;

class PRA1
{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        HashSet<Character> h;
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(f.readLine());
        	int numYear = Integer.parseInt(st.nextToken());
        	while(true) {
        		h = new HashSet();
        		numYear++;
        		for(int j = 0; j < 4; j++) {
        			String sYear = numYear + "";
        			h.add(sYear.charAt(j));
        		}
        		if(h.size()==4) {
        			System.out.println(numYear);
        			break;
        		}
        	}
        }
	}
}