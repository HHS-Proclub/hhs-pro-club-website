import java.io.*;
import java.util.*;

public class PRB9 {
	static final Input in = new Input();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		int testCases = in.nextInt();
		while(testCases-->0) {
			int n = in.nextInt();
			if(n<10)
				out.println(19+9*(in.nextInt()-1));
			if(n<100)
				out.println(109+9*(in.nextInt()-1));
			else
				out.println(1009+9*(in.nextInt()-1));
		}
		System.err.println(System.currentTimeMillis()-t1);
		out.close();
	}

	static class Input {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
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
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}