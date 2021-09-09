import java.io.*;
import java.util.*;

public class PRB1 {
	static final Input in = new Input();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int testCases = in.nextInt();
		while(testCases-->0) {
			out.println(in.nextInt()+in.nextInt());
		}
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
	}
}