// LOL noobs: "lis" --> "advanced" ???? 

import java.awt.Point;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.*;


public class PRA11 {
	static Input in;
	static PrintWriter out;
	static boolean file = false;
	static String filename = "";
	
	public static void main(String[] args) throws Exception {
		if(!file) {
			in = new Input(System.in);
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		} else {
			in = new Input(filename+".in");
			out = new PrintWriter(new BufferedWriter(new FileWriter(filename+".out")));
		}

		for(int testCases = in.nextInt(); testCases>0; testCases--) {
			new Solver();
		}
		out.close();
	}

	static class Solver {
		Solver() {
			int n = in.nextInt();
			int[] sequence = new int[n];
			for(int i=0; i<n; i++) {
				sequence[i] = in.nextInt();
			}
			out.println(lengthOfLIS(sequence));
		}
		
		int lengthOfLIS(int[] sequence) {
			if(sequence==null||sequence.length==0)
				return 0;
			
			int[] max = new int[sequence.length];
			Arrays.fill(max, 1);
			
			int ans = 1;
			for(int i=0; i<sequence.length; i++){
				for(int j=0; j<i; j++){
					if(sequence[i]>sequence[j]){
						max[i]= max(max[i], max[j]+1);

					}
				}
				ans = max(max[i], ans);
			}
			return ans;
		}

	}

	public static class Input {
		BufferedReader br;
		StringTokenizer st;
		
		Input(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream));
		}
		
		Input(String file) {
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (Exception e) {}
		}
		
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}